package org.kerf.bgg.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.kerf.bgg.command.GuildsCommand;
import org.kerf.bgg.exception.CommandExecutionException;
import org.kerf.bgg.jaxb.Guild;
import org.xml.sax.SAXException;

public class GuildManager {
   private static final int GUILDS_PER_PAGE = 100;

   static private final Logger logger = Logger.getLogger(GuildManager.class);

   static private HashMap<Integer, Guild> guildCache;
   static private File cacheFile;

   static {
      ObjectInputStream objectInputStream = null;
      try {
         cacheFile = new File(System.getProperty("user.home") + File.separator + ".jbgg" + File.separator + "guilds.cache");

         if (cacheFile.exists()) {
            FileInputStream fileInputStream = new FileInputStream(cacheFile);

            objectInputStream = new ObjectInputStream(fileInputStream);
            guildCache = (HashMap<Integer, Guild>) objectInputStream.readObject();
         } else {
            guildCache = new HashMap<Integer, Guild>();
            saveCache();
         }
      } catch (FileNotFoundException e) {
         logger.warn("Cache file not found");
      } catch (IOException e) {
         logger.error(e);
      } catch (ClassNotFoundException e) {
         logger.error(e);
      } finally {
         try {
            if (objectInputStream != null) {
               objectInputStream.close();
            }
         } catch (IOException e) {
            logger.warn(e);
         }
      }
   }

   static private void saveCache() {
      ObjectOutputStream objectOutputStream = null;

      try {
         if (!cacheFile.getParentFile().exists()) {
            cacheFile.getParentFile().mkdir();
         }
         FileOutputStream fileOutputStream = new FileOutputStream(cacheFile);
         objectOutputStream = new ObjectOutputStream(fileOutputStream);

         objectOutputStream.writeObject(guildCache);
      } catch (Exception e) {
         logger.error(e);
      } finally {
         try {
            if (objectOutputStream != null) {
               objectOutputStream.close();
            }
         } catch (IOException e) {
            logger.warn(e);
         }
      }
   }

   public List<Guild> getAllGuilds() {

      int estimatedNumberOfGuilds = getEstimatedNumberOfGuilds();

      if (estimatedNumberOfGuilds == -1) {
         estimatedNumberOfGuilds = guildCache.size(); // Error recovery.
                                                      // Couldn't contact BGG
      }

      if (guildCache.size() == estimatedNumberOfGuilds) {
         Guild[] array = guildCache.values().toArray(new Guild[0]);
         return (List<Guild>) Arrays.asList(array);
      }

      ArrayList<Guild> retval = new ArrayList<Guild>(estimatedNumberOfGuilds);

      for (int i = 1, j = 1; i <= estimatedNumberOfGuilds; j++) {
         try {
            retval.add(getGuildById(Integer.toString(j)));
            i++;
         } catch (CommandExecutionException e) {
            logger.trace("Guild ID " + j + " doesn't exist (it was deleted, or hasn't been assigned)");
         }
      }

      return retval;
   }

   public List<Guild> findGuilds(String findString) {
      List<Guild> retval = new ArrayList<Guild>();
      for (Guild guild : getAllGuilds()) {
         if (guild.getName().contains(findString)) {
            retval.add(guild);
         }
      }

      return retval;
   }

   public Guild getGuildById(String id, boolean useCache) throws CommandExecutionException {
      Guild retval = null;
      if (useCache) {
         retval = guildCache.get(Integer.parseInt(id));
      }

      if (retval == null) {
         GuildsCommand command = new GuildsCommand(id);
         retval = command.execute();

         if (retval != null) {
            logger.trace("Guild ID " + id + " was new");
            guildCache.put(Integer.parseInt(id), retval);
            saveCache();
         }
      } else {
         logger.trace("Guild ID " + id + " pulled from cache");
      }

      return retval;
   }

   public Guild getGuildById(String id) throws CommandExecutionException {
      return getGuildById(id, true);
   }

   /*
    * This method is a hack to figure out how many Guilds exist on BGG. Some ID
    * numbers are Guilds that have been deleted, so we can't use an empty result
    * to indicate the end of the assigned IDs. So, we scrape the HTML Guild List
    * page and rely on it staying the same to determine the number of Guilds.
    * 
    * First, we look at the number of the last page, which is indicated by an
    * anchor element with an attribute called "title" with the value
    * "last page". We take the text associated with the link, strip off the
    * square brackets and turn it into an integer. Each full page contains 100
    * Guilds, with the last page usually being less than full. So, we subtract
    * one from the number of pages and multiple by 100.
    * 
    * To get the remainder of the Guilds on the last page, we load up the page
    * linked to by the "last page" anchor element, get the table of Guilds and
    * count the number of rows it has.
    * 
    * Not beautiful, but a good effort in the absence of an official way to get
    * the number of guilds through the API.
    */
   private int getEstimatedNumberOfGuilds() {
      int retval = -1;

      try {
         Document document = Jsoup.connect("http://www.boardgamegeek.com/guild/list").get();
         Element lastPageAnchor = document.select("a[title=last page]").first();

         String lastPage = lastPageAnchor.text();
         lastPage = lastPage.substring(lastPage.indexOf('[') + 1, lastPage.lastIndexOf(']'));

         document = Jsoup.connect(lastPageAnchor.attr("abs:href")).get();
         Element mainContent = document.getElementById("main_content");
         Elements rows = mainContent.getElementsByTag("tr");

         retval = (Integer.parseInt(lastPage) - 1) * GUILDS_PER_PAGE + rows.size();
      } catch (IOException ioErr) {
         logger.warn(ioErr);
      }
      return retval;
   }

   static public void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
      GuildManager manager = new GuildManager();

      int numEst = manager.getEstimatedNumberOfGuilds();
      System.out.println("Estimated number of guilds: " + numEst);

      List<Guild> guilds = manager.getAllGuilds();
      System.out.println("Actual number found: " + guilds.size());

      List<Guild> secretCabal = manager.findGuilds("Secret Cabal");
      for (Guild guild : secretCabal) {
         System.out.println(guild.getName() + ": " + guild.getDescription());
      }
   }
}
