package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Items;

public class FamilyCommand extends Command {

   
   public FamilyCommand() {
      command = "family";
   }
   
   @Override
   protected Class getReturnType() {
      return Items.class;
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
