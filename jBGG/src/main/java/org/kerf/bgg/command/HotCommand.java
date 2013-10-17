package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.type.HotItemType;

public class HotCommand extends Command {

   public HotCommand() {
      command = "hot";
   }

   @Override
   protected Class<Items> getReturnType() {
      return Items.class;
   }

   public HotItemType getType() {
      return HotItemType.valueOf((parameters.getProperty("type")));
   }
   
   public void setType(HotItemType type) {
      parameters.setProperty("type", type.name());
   }
}
