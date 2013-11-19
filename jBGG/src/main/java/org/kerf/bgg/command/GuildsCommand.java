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

import org.kerf.bgg.exception.CommandExecutionException;
import org.kerf.bgg.jaxb.Guild;
import org.kerf.bgg.type.SortType;

public class GuildsCommand extends Command {

   public GuildsCommand(String id) {
      command = "guilds";

      setId(id);
   }

   @Override
   public Guild execute() throws CommandExecutionException {
      Guild guild = super.execute();

      if (guild.getError() != null) {
         throw new CommandExecutionException(guild.getError());
      }
      return guild;
   }

   public String getId() {
      return parameters.getProperty("id");
   }

   public Boolean getMembers() {
      return Boolean.parseBoolean(parameters.getProperty("members"));
   }

   public Integer getPage() {
      return Integer.parseInt(parameters.getProperty("page"));
   }

   @Override
   protected Class<Guild> getReturnType() {
      return Guild.class;
   }

   public SortType getSort() {
      return SortType.valueOf(parameters.getProperty("sort"));
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public void setMembers(Boolean members) {
      parameters.setProperty("members", convertBoolean(members));
   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

   public void setSort(SortType sort) {
      parameters.setProperty("sort", sort.name());
   }

}
