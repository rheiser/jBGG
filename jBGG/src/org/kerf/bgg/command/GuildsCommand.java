package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Guild;

public class GuildsCommand extends Command {

   public GuildsCommand() {
      command = "guilds";
   }

   @Override
   protected Class getReturnType() {
      return Guild.class;
   }

   public String getId() {
      return parameters.getProperty("id");
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public Boolean getMembers() {
      return Boolean.parseBoolean(parameters.getProperty("members"));
   }

   public void setMembers(Boolean members) {
      parameters.setProperty("members", convertBoolean(members));
   }

   // TODO - enum? (username, date)
   public String getSort() {
      return parameters.getProperty("sort");
   }

   public void setSort(String sort) {
      parameters.setProperty("sort", sort);
   }

   public Integer getPage() {
      return Integer.parseInt(parameters.getProperty("page"));
   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

}
