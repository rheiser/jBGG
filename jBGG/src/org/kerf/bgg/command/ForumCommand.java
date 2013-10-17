package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Forum;

public class ForumCommand extends Command {

   public ForumCommand() {
      command="forum";
   }
   @Override
   protected Class getReturnType() {
      return Forum.class;
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

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

   public Integer getPage() {
      return Integer.valueOf(parameters.getProperty("page"));
   }

}
