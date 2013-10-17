package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Forum;

public class ForumCommand extends Command {

   public ForumCommand(String id) {
      command="forum";
      
      setId(id);
   }
   @Override
   protected Class<Forum> getReturnType() {
      return Forum.class;
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public void addId(String id) {
      parameters.setProperty("id", parameters.getProperty("id") + ", " + id);
   }

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
