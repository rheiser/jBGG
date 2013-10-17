package org.kerf.bgg.command;

import java.util.Arrays;
import java.util.List;

import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.type.FamilyType;

public class FamilyCommand extends Command {

   
   public FamilyCommand(String id) {
      command = "family";
      
      setId(id);
   }
   
   public FamilyCommand(List<String> ids) {
      command = "family";
      
      for(String currId : ids) {
         addId(currId);
      }
   }
   
   @Override
   protected Class<Items> getReturnType() {
      return Items.class;
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }
   
   public void addId(String id) {
      parameters.setProperty("id", parameters.getProperty("id") + "," + id);
   }
   
   public List<String> getId() {
      String[] ids =  parameters.getProperty("id").split(",");
      return Arrays.asList(ids);
   }
   
   public void setType(FamilyType type) {
      parameters.setProperty("type", type.name());
   }
   
   public FamilyType getType() {
      return FamilyType.valueOf(parameters.getProperty("type"));
   }
}
