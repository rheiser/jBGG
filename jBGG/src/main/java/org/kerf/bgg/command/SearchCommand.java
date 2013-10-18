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

import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.type.ThingType;

public class SearchCommand extends Command {

   public SearchCommand(String query) {
      command = "search";

      setQuery(query);
   }

   public String getExact() {
      return parameters.getProperty("exact");
   }

   public String getQuery() {
      return parameters.getProperty("query");
   }

   @Override
   protected Class<Items> getReturnType() {
      return Items.class;
   }

   public ThingType getType() {
      return ThingType.valueOf(parameters.getProperty("type"));
   }

   public void setExact(Boolean exact) {
      parameters.put("exact", convertBoolean(exact));
   }

   public void setQuery(String search) {
      parameters.put("query", search);
   }

   public void setType(ThingType itemType) {
      parameters.put("type", itemType.name());
   }

}
