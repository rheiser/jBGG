/**
   Copyright 2013 Rob Heiser

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */

package org.kerf.bgg;

import java.net.MalformedURLException;
import java.util.ArrayList;
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
import org.kerf.bgg.jaxb.Name;
import org.kerf.bgg.jaxb.Play;
import org.kerf.bgg.jaxb.Plays;
import org.kerf.bgg.jaxb.User;
import org.kerf.bgg.type.NameType;
import org.kerf.bgg.type.ThingType;
import org.kerf.bgg.type.Type;

public class Main {

   private static void doCollection() throws CommandExecutionException {
      CollectionCommand collectionCommand = new CollectionCommand("rheiser");
      // collectionCommand.setOwn(true);
      // collectionCommand.setMinplays(5);
      // collectionCommand.setRated(true);

      System.out.println("=== CollectionCommand ===");

      Items collection = collectionCommand.execute();

      for (Item item : collection.getItems()) {
         System.out.println(item);
      }
   }

   private static void doFamily() throws CommandExecutionException {
      FamilyCommand familyCommand = new FamilyCommand("17106");// Android 

      System.out.println("=== FamilyCommand ===");

      Items families = familyCommand.execute();

      for (Item currItem : families.getItems()) {
         System.out.println(currItem);
      }
   }

   private static void doForum() throws CommandExecutionException {
      ForumCommand forumCommand = new ForumCommand("285");

      System.out.println("=== ForumCommand ===");

      Forum forum = forumCommand.execute();

      for (ForumThread thread : forum.getThreads()) {
         System.out.println(thread);
      }
   }

   private static void doForumList() throws CommandExecutionException {
      ForumListCommand forumListCommand = new ForumListCommand("31260", Type.thing); // Agricola

      System.out.println("=== ForumListCommand ===");

      Forums forumList = forumListCommand.execute();

      for (Forum forum : forumList.getForums()) {
         System.out.println(forum);
      }
   }

   private static void doGuilds() throws CommandExecutionException {
      GuildsCommand guildsCommand = new GuildsCommand("1145");

      System.out.println("=== GuildsCommand ===");

      Guild guild = guildsCommand.execute();

      System.out.println(guild);
   }

   private static void doHotItems() throws CommandExecutionException, MalformedURLException {
      HotCommand hotCommand = new HotCommand();

      System.out.println("=== HotCommand ===");

      Items items = hotCommand.execute();

      for (Item item : items.getItems()) {
         System.out.println(item);
      }
   }

   private static void doPlays() throws CommandExecutionException {
      PlaysCommand playsCommand = new PlaysCommand("rheiser");

      System.out.println("=== PlaysCommand ===");

      Plays plays = playsCommand.execute();

      for (Play play : plays) {
         System.out.println(play);
      }
   }

   private static void doSearch() throws CommandExecutionException {
      SearchCommand searchCommand = new SearchCommand("Agricola");
      // searchCommand.setExact(Boolean.FALSE);

      System.out.println("=== SearchCommand ===");

      Items boardgames = searchCommand.execute();

      for (Item item : boardgames.getItems()) {
         System.out.println(item);
      }
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

      System.out.println("=== ThingCommand ===");

      Items items = thingCommand.execute();

      for (Item item : items.getItems()) {
         System.out.println(item);
      }
   }

   private static void doThread() throws CommandExecutionException {
      ThreadCommand threadCommand = new ThreadCommand("323972");

      System.out.println("=== ThreadCommand ===");

      ForumThread thread = threadCommand.execute();

      for (Article article : thread.getArticles()) {
         System.out.println(article);
      }
   }

   private static void doUsers() throws CommandExecutionException {
      UsersCommand usersCommand = new UsersCommand("rheiser");
      usersCommand.setBuddies(true);
      usersCommand.setGuilds(true);
      usersCommand.setHot(true);
      usersCommand.setTop(true);

      System.out.println("=== UsersCommand ===");

      User user = usersCommand.execute();

      System.out.println(user);
   }

   private static void doScenario() throws CommandExecutionException {
      SearchCommand searchCommand = new SearchCommand("X-wing");
      searchCommand.setType(ThingType.boardgame);
      Items items = searchCommand.execute();

      Integer lowestId = Integer.MAX_VALUE;
      for (Item currItem : items) {
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

      int mostThreads = 0;
      Forum selectedForum = null;
      for (Forum forum : forumList) {
         Integer numThreads = forum.getNumThreads();
         if (numThreads > mostThreads) {
            selectedForum = forum;
            mostThreads = numThreads;
         }
         System.out.println(forum.getTitle() + " (" + numThreads + ")");
      }

      ArrayList<ForumThread> allThreads = new ArrayList<ForumThread>();

      ForumCommand forumCommand = new ForumCommand(selectedForum.getId());

      int i = 1;
      List<ForumThread> threads = null;

      do {
         forumCommand.setPage(i++);
         selectedForum = forumCommand.execute();
         threads = selectedForum.getThreads();
         allThreads.addAll(threads);
      } while (threads.size() > 0);

      int mostArticles = 0;
      ForumThread selectedThread = null;
      for (ForumThread thread : allThreads) {
         Integer numArticles = thread.getNumArticles();
         if (numArticles > mostArticles) {
            selectedThread = thread;
            mostArticles = numArticles;
         }
         System.out.println("\"" + thread.getSubject() + "\" by " + thread.getAuthor() + " (" + numArticles + ")");
      }

      System.out.println("\"" + selectedThread.getSubject() + "\" by " + selectedThread.getAuthor() + " with "
            + (selectedThread.getNumArticles() - 1) + " replies is the most popular thread in " + allThreads.size() + " about "
            + theName.getValue() + ": " + "http://boardgamegeek.com/thread/" + selectedThread.getId());
   }

   static public void main(String[] args) throws Exception {
      doThing();
      doSearch();
      doCollection();
      doFamily();
      doForumList();
      doForum();
      doThread();
      doUsers();
      doGuilds();
      doPlays();
      doHotItems();

      // doScenario();
   }

}
