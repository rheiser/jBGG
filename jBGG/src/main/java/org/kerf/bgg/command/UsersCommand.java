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

import org.kerf.bgg.jaxb.User;
import org.kerf.bgg.type.Domain;

public class UsersCommand extends Command {

   public UsersCommand(String name) {
      command = "users";

      setName(name);
   }

   public Boolean getBuddies() {
      return Boolean.parseBoolean(parameters.getProperty("buddies"));
   }

   public Domain getDomain() {
      return Domain.valueOf(parameters.getProperty("domain"));
   }

   public Boolean getGuilds() {
      return Boolean.parseBoolean(parameters.getProperty("guilds"));
   }

   public Boolean getHot() {
      return Boolean.parseBoolean(parameters.getProperty("hot"));
   }

   public String getName() {
      return parameters.getProperty("name");
   }

   public Integer getPage() {
      return Integer.parseInt(parameters.getProperty("page"));

   }

   @Override
   protected Class<User> getReturnType() {
      return User.class;
   }

   public Boolean getTop() {
      return Boolean.parseBoolean(parameters.getProperty("top"));
   }

   public void setBuddies(Boolean b) {
      parameters.setProperty("buddies", convertBoolean(b));
   }

   public void setDomain(Domain domain) {
      parameters.setProperty("domain", domain.name());
   }

   public void setGuilds(Boolean b) {
      parameters.setProperty("guilds", convertBoolean(b));
   }

   public void setHot(Boolean b) {
      parameters.setProperty("hot", convertBoolean(b));
   }

   public void setName(String name) {
      parameters.setProperty("name", name);
   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

   public void setTop(Boolean b) {
      parameters.setProperty("top", convertBoolean(b));
   }

}
