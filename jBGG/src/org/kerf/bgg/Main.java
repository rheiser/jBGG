package org.kerf.bgg;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBException;

import org.kerf.bgg.command.BoardgameCommand;
import org.kerf.bgg.command.CollectionCommand;
import org.kerf.bgg.command.FamilyCommand;
import org.kerf.bgg.command.ForumCommand;
import org.kerf.bgg.command.ForumListCommand;
import org.kerf.bgg.command.SearchCommand;
import org.kerf.bgg.command.ThreadCommand;
import org.kerf.bgg.command.UsersCommand;
import org.kerf.bgg.jaxb.Article;
import org.kerf.bgg.jaxb.Boardgame;
import org.kerf.bgg.jaxb.Boardgames;
import org.kerf.bgg.jaxb.Forum;
import org.kerf.bgg.jaxb.ForumThread;
import org.kerf.bgg.jaxb.Forums;
import org.kerf.bgg.jaxb.Item;
import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.jaxb.Link;
import org.kerf.bgg.jaxb.Name;
import org.kerf.bgg.jaxb.User;

public class Main {

   static public void main(String[] args) {
      try {
         // Items boardgames = doSearch();
         // Item boardgame = boardgames.getItems().get(0);
         // doBoardgame(boardgame);
         // doCollection();
         // doThread();
         // doFamily();
         // doForumList();
         // doForum();
         // doThread();
         doUsers();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (JAXBException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

   private static void doForum() throws IOException, JAXBException {
      ForumCommand forumCommand = new ForumCommand();
      forumCommand.setId("285");
      forumCommand.setPage(2);

      Forum forum = forumCommand.execute();

      for (ForumThread thread : forum.getThreads()) {
         System.out.println(thread.getSubject() + ": " + thread.getAuthor() + " | " + thread.getNumArticles());
      }
   }

   private static void doThread() throws IOException, JAXBException {
      ThreadCommand threadCommand = new ThreadCommand();
      threadCommand.setId("323972");

      ForumThread thread = threadCommand.execute();
      for (Article article : thread.getArticles()) {
         System.out.println(article.getSubject() + " | " + article.getUsername() + " | " + article.getPostDate()
               + (article.getPostDate().equals(article.getEditDate()) ? "" : " (" + article.getEditDate() + ")"));
      }
   }

   private static void doUsers() throws IOException, JAXBException {
      UsersCommand usersCommand = new UsersCommand();
      usersCommand.setName("rheiser");
//      usersCommand.setBuddies(false);
//      usersCommand.setGuilds(true);
//      usersCommand.setHot(true);
//      usersCommand.setTop(true);
      
      User user = usersCommand.execute();
      
      System.out.println("User: " + user.getFirstname() + " " + user.getLastname());
   }
   
   
   private static void doCollection() throws IOException, JAXBException {
      CollectionCommand collectionCommand = new CollectionCommand("rheiser");
      // collectionCommand.setOwn(true);
      // collectionCommand.setMinplays(5);
      collectionCommand.setRated(true);
      Items collection = collectionCommand.execute();
      for (Item item : collection.getItems()) {
         for (Name name : item.getName()) {
            System.out.println(name.getValue() + " (image: " + item.getImage() + ")");
         }
      }
   }

   private static void doFamily() throws IOException, JAXBException {
      FamilyCommand familyCommand = new FamilyCommand();
      familyCommand.setId("17106"); // Android 

      Items families = familyCommand.execute();

      for (Item currItem : families.getItems()) {
         for (Name name : currItem.getName()) {
            System.out.println("Name: " + name.getValue());
         }

         for (Link link : currItem.getLink()) {
            System.out.println("Link: " + link.getValue() + " | " + link.getType());
         }
      }
   }

   private static void doForumList() throws IOException, JAXBException {
      ForumListCommand forumListCommand = new ForumListCommand();
      forumListCommand.setId("31260"); // Agricola
      forumListCommand.setType("thing");

      Forums forumList = forumListCommand.execute();
      for (Forum item : forumList.getForum()) {
         System.out.println(item.getTitle() + " - " + item.getDescription() + " (" + item.getNumThreads() + ")");
      }
   }

   private static void doBoardgame(Item boardgame) throws IOException, JAXBException {
      BoardgameCommand boardgameCommand = new BoardgameCommand();
      boardgameCommand.setGameId(boardgame.getObjectId());
      boardgameCommand.setComments(true);
      boardgameCommand.setStats(true);
      boardgameCommand.setHistorical(true);
      Calendar calendar = GregorianCalendar.getInstance();
      calendar.set(2009, 1, 1);
      boardgameCommand.setFrom(calendar.getTime());

      calendar.set(2009, 03, 17);
      boardgameCommand.setTo(calendar.getTime());

      Boardgames agricola = boardgameCommand.execute();
      for (Boardgame game : agricola.getBoardgames()) {
         for (Name name : game.getName()) {
            System.out.println("NAME: " + name.getValue());
         }
         System.out.println("DESC: " + game.getDescription());
      }
   }

   private static Items doSearch() throws IOException, JAXBException {
      SearchCommand searchCommand = new SearchCommand();
      searchCommand.setQuery("Agricola");
      searchCommand.setExact(Boolean.FALSE);

      Items boardgames = searchCommand.execute();

      for (Item item : boardgames.getItems()) {
         for (Name currName : item.getName()) {
            System.out.println("Name: " + currName.getValue());
         }
         System.out.println("Year: "
               + (item.getYearPublished() != null ? (item.getYearPublished().getText().equals("") ? item.getYearPublished()
                     .getValue() : item.getYearPublished().getText()) : "not specified"));
         System.out.println("ID: " + item.getId());
      }
      return boardgames;
   }

}
