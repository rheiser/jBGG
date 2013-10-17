package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.type.ThingType;

public class SearchCommand extends Command {

   public SearchCommand(String query) {
      command = "search";
      
      setQuery(query);
   }

   protected Class<Items> getReturnType() {
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

   public ThingType getType() {
      return ThingType.valueOf(parameters.getProperty("type"));
   }

   public void setType(ThingType itemType) {
      parameters.put("type", itemType.name());
   }

}
