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
