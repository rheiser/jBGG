package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Guild;
import org.kerf.bgg.type.SortType;

public class GuildsCommand extends Command {

   public GuildsCommand(String id) {
      command = "guilds";
      
      setId(id);
   }

   @Override
   protected Class<Guild> getReturnType() {
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

   public SortType getSort() {
      return SortType.valueOf(parameters.getProperty("sort"));
   }

   public void setSort(SortType sort) {
      parameters.setProperty("sort", sort.name());
   }

   public Integer getPage() {
      return Integer.parseInt(parameters.getProperty("page"));
   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

}
