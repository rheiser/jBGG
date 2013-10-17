package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Items;

public class SearchCommand extends Command {

   public SearchCommand() {
      command = "search";
   }

   protected Class getReturnType() {
      return Items.class;
   }

   public String getQuery() {
      return parameters.getProperty("query");
   }

   public void setQuery(String search) {
      parameters.put("query", search);
   }

   public String getExact() {
      return parameters.getProperty("exact");
   }

   public void setExact(Boolean exact) {
      parameters.put("exact", convertBoolean(exact));
   }

   public String getItemType() {
      return parameters.getProperty("type");
   }

   public void setItemType(String itemType) {
      parameters.put("type", itemType);
   }

}
