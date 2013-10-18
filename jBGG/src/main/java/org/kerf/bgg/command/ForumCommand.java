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

import org.kerf.bgg.jaxb.Forum;

public class ForumCommand extends Command {

   public ForumCommand(String id) {
      command = "forum";

      setId(id);
   }

   public void addId(String id) {
      parameters.setProperty("id", parameters.getProperty("id") + ", " + id);
   }

   public String getId() {
      return parameters.getProperty("id");
   }

   public Integer getPage() {
      return Integer.valueOf(parameters.getProperty("page"));
   }

   @Override
   protected Class<Forum> getReturnType() {
      return Forum.class;
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

}
