package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Forums;
import org.kerf.bgg.type.Type;

public class ForumListCommand extends Command {
   
   public ForumListCommand(String id, Type type) {
      command = "forumlist";
      
      setId(id);
      setType(type);
   }

   @Override
   protected Class<Forums> getReturnType() {
      return Forums.class;
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

   public void setType(Type type) {
      parameters.setProperty("type", type.name());
   }

   public Type getType() {
      return Type.valueOf(parameters.getProperty("type"));
   }
}
