package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Forums;

public class ForumListCommand extends Command {

   public ForumListCommand() {
      command = "forumlist";
   }

   @Override
   protected Class getReturnType() {
      return Forums.class;
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public void addId(String id) {
      parameters.setProperty("id", parameters.getProperty("id") + ", " + id);
   }

   // FIXME - Return a List instead?
   public String getId() {
      return parameters.getProperty("id");
   }

   // FIXME - pass in an enum?
   public void setType(String type) {
      parameters.setProperty("type", type);
   }

   public String getType() {
      return parameters.getProperty("type");
   }
}
