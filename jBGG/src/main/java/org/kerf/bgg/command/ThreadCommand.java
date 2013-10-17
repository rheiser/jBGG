package org.kerf.bgg.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.kerf.bgg.jaxb.ForumThread;

public class ThreadCommand extends Command {

   private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

   public ThreadCommand(String id) {
      command = "thread";
      
      setId(id);
   }

   @Override
   protected Class<ForumThread> getReturnType() {
      return ForumThread.class;
   }
   
   public String getId() {
      return parameters.getProperty("id");
   }
   
   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public String getMinArticleId() {
      return parameters.getProperty("minarticleid");
   }
   
   public void setMinArticleId(String id) {
      parameters.setProperty("minarticleid", id);
   }
   
   public void setMinArticleDate(Date date) {
      parameters.setProperty("minarticledate", dateFormat.format(date));
   }
   
   public Date getMinArticleDate() throws ParseException {
      return dateFormat.parse(parameters.getProperty("minarticledate"));
   }
   public String getCount() {
      return parameters.getProperty("count");
   }

   public void setCount(Boolean count) {
      parameters.setProperty("count", count.toString());
   }

   public String getUsername() {
      return parameters.getProperty("username");
   }

   public void setUsername(String username) {
      parameters.setProperty("username", username);
   }

}
