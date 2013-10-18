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

import java.util.Arrays;
import java.util.List;

import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.type.FamilyType;

public class FamilyCommand extends Command {

   public FamilyCommand(List<String> ids) {
      command = "family";

      for (String currId : ids) {
         addId(currId);
      }
   }

   public FamilyCommand(String id) {
      command = "family";

      setId(id);
   }

   public void addId(String id) {
      parameters.setProperty("id", parameters.getProperty("id") + "," + id);
   }

   public List<String> getId() {
      String[] ids = parameters.getProperty("id").split(",");
      return Arrays.asList(ids);
   }

   @Override
   protected Class<Items> getReturnType() {
      return Items.class;
   }

   public FamilyType getType() {
      return FamilyType.valueOf(parameters.getProperty("type"));
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public void setType(FamilyType type) {
      parameters.setProperty("type", type.name());
   }
}
