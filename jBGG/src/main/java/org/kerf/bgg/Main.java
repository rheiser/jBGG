package org.kerf.bgg;

import java.net.MalformedURLException;
import java.util.List;

import org.kerf.bgg.command.CollectionCommand;
import org.kerf.bgg.command.FamilyCommand;
import org.kerf.bgg.command.ForumCommand;
import org.kerf.bgg.command.ForumListCommand;
import org.kerf.bgg.command.GuildsCommand;
import org.kerf.bgg.command.HotCommand;
import org.kerf.bgg.command.PlaysCommand;
import org.kerf.bgg.command.SearchCommand;
import org.kerf.bgg.command.ThingCommand;
import org.kerf.bgg.command.ThreadCommand;
import org.kerf.bgg.command.UsersCommand;
import org.kerf.bgg.exception.CommandExecutionException;
import org.kerf.bgg.jaxb.Article;
import org.kerf.bgg.jaxb.Forum;
import org.kerf.bgg.jaxb.ForumThread;
import org.kerf.bgg.jaxb.Forums;
import org.kerf.bgg.jaxb.Guild;
import org.kerf.bgg.jaxb.Item;
import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.jaxb.Link;
import org.kerf.bgg.jaxb.Name;
import org.kerf.bgg.jaxb.Plays;
import org.kerf.bgg.jaxb.User;
import org.kerf.bgg.type.NameType;
import org.kerf.bgg.type.ThingType;
import org.kerf.bgg.type.Type;

public class Main {

   static public void main(String[] args) throws Exception {
      // doThing();
      //         doSearch();
      //         doCollection();
      //         doThread();
      //         doFamily();
      //         doForumList();
      //         doForum();
      //         doThread();
      //         doUsers();
      //         doGuilds();
      //         doPlays();
      doHotItems();
      //         
      //         doScenario();
   }

   private static void doHotItems() throws CommandExecutionException, MalformedURLException {
      HotCommand hotCommand = new HotCommand();
      Items items = hotCommand.execute();
      
      for(Item currItem :items.getItems()) {
         System.out.println(currItem.getNames().get(0).getValue() + " " + currItem.getThumbnail());
      }
   }

   private static void doScenario() throws CommandExecutionException {
      SearchCommand searchCommand = new SearchCommand("X-wing");
      searchCommand.setType(ThingType.boardgame);
      Items items = searchCommand.execute();

      Integer lowestId = Integer.MAX_VALUE;
      for (Item currItem : items.getItems()) {
         int currentId = Integer.parseInt(currItem.getId());
         if (currentId < lowestId) {
            lowestId = currentId;
         }
      }

      ThingCommand thingCommand = new ThingCommand(lowestId.toString());
      Items xwingGames = thingCommand.execute();

      Item xwingBaseGame = xwingGames.getItems().get(0);
      List<Name> names = xwingBaseGame.getNames();
      Name theName = null;
      for (Name currName : names) {
         if (currName.getType().equals(NameType.primary)) {
            theName = currName;
            break;
         }
      }

      System.out.println(theName.getValue());

      ForumListCommand forumListCommand = new ForumListCommand(xwingBaseGame.getId(), Type.thing);
      Forums forumList = forumListCommand.execute();

      forumList.getForums();

   }

   private static void doThing() throws CommandExecutionException, MalformedURLException {
      ThingCommand thingCommand = new ThingCommand("31260");
      thingCommand.setComments(true);
      thingCommand.setHistorical(true);
      thingCommand.setMarketplace(true);
      thingCommand.setRatingComments(true);
      thingCommand.setStats(true);
      thingCommand.setVersions(true);
      thingCommand.setVideos(true);

      Items items = thingCommand.execute();
      for (Item item : items.getItems()) {
         System.out.println(item.getNames().get(0).getValue() + ": " + item.getThumbnail());
      }
   }

   private static void doPlays() throws CommandExecutionException {
      PlaysCommand playsCommand = new PlaysCommand("rheiser");

      Plays plays = playsCommand.execute();

      System.out.println(plays.getUsername() + " has " + plays.getTotal() + " plays");
   }

   private static void doForum() throws CommandExecutionException {
      ForumCommand forumCommand = new ForumCommand("285");

      Forum forum = forumCommand.execute();

      for (ForumThread thread : forum.getThreads()) {
         System.out.println(thread.getSubject() + ": " + thread.getAuthor() + " | " + thread.getNumArticles());
      }
   }

   private static void doThread() throws CommandExecutionException {
      ThreadCommand threadCommand = new ThreadCommand("323972");

      ForumThread thread = threadCommand.execute();
      for (Article article : thread.getArticles()) {
         System.out.println(article.getSubject() + " | " + article.getUsername() + " | " + article.getPostDate()
                  + (article.getPostDate().equals(article.getEditDate()) ? "" : " (" + article.getEditDate() + ")"));
      }
   }

   private static void doUsers() throws CommandExecutionException {
      UsersCommand usersCommand = new UsersCommand("rheiser");
      // usersCommand.setBuddies(false);
      // usersCommand.setGuilds(true);
      // usersCommand.setHot(true);
      // usersCommand.setTop(true);

      User user = usersCommand.execute();

      System.out.println("User: " + user.getFirstname() + " " + user.getLastname() + " | " + user.getCountry());
   }

   private static void doGuilds() throws CommandExecutionException {
      GuildsCommand guildsCommand = new GuildsCommand("1145");

      Guild guild = guildsCommand.execute();

      System.out.println(guild.getName() + " (" + guild.getManager() + ") | " + guild.getDescription());
   }

   private static void doCollection() throws CommandExecutionException {
      CollectionCommand collectionCommand = new CollectionCommand("rheiser");
      // collectionCommand.setOwn(true);
      // collectionCommand.setMinplays(5);
      collectionCommand.setRated(true);
      Items collection = collectionCommand.execute();
      for (Item item : collection.getItems()) {
         for (Name name : item.getNames()) {
            System.out.println(name.getValue() + " (image: " + item.getImage() + ")");
         }
      }
   }

   private static void doFamily() throws CommandExecutionException {
      FamilyCommand familyCommand = new FamilyCommand("17106");// Android 

      Items families = familyCommand.execute();

      for (Item currItem : families.getItems()) {
         for (Name name : currItem.getNames()) {
            System.out.println("Name: " + name.getValue());
         }

         for (Link link : currItem.getLink()) {
            System.out.println("Link: " + link.getValue() + " | " + link.getType());
         }
      }
   }

   private static void doForumList() throws CommandExecutionException {
      ForumListCommand forumListCommand = new ForumListCommand("31260", Type.thing); // Agricola
      //      forumListCommand.setType("thing");

      Forums forumList = forumListCommand.execute();
      for (Forum item : forumList.getForums()) {
         System.out.println(item.getTitle() + " - " + item.getDescription() + " (" + item.getNumThreads() + ")");
      }
   }

   private static void doSearch() throws CommandExecutionException {
      SearchCommand searchCommand = new SearchCommand("Agricola");
      //      searchCommand.setExact(Boolean.FALSE);

      Items boardgames = searchCommand.execute();

      for (Item item : boardgames.getItems()) {
         for (Name currName : item.getNames()) {
            System.out.println("Name: " + currName.getValue());
         }
         System.out.println("Year: "
                  + (item.getYearPublished() != null ? (item.getYearPublished().getText().equals("") ? item
                           .getYearPublished().getValue() : item.getYearPublished().getText()) : "not specified"));
         System.out.println("ID: " + item.getId());
      }
   }

}
