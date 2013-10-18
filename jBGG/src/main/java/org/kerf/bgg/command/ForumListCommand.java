/**
   Copyright 2013 Rob Heiser

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Forums;
import org.kerf.bgg.type.Type;

public class ForumListCommand extends Command {

   public ForumListCommand(String id, Type type) {
      command = "forumlist";

      setId(id);
      setType(type);
   }

   public void addId(String id) {
      parameters.setProperty("id", parameters.getProperty("id") + ", " + id);
   }

   public String getId() {
      return parameters.getProperty("id");
   }

   @Override
   protected Class<Forums> getReturnType() {
      return Forums.class;
   }

   public Type getType() {
      return Type.valueOf(parameters.getProperty("type"));
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public void setType(Type type) {
      parameters.setProperty("type", type.name());
   }
}
