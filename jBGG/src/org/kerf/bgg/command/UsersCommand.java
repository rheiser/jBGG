package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.User;

public class UsersCommand extends Command {

   public UsersCommand() {
      command = "users";
   }

   @Override
   protected Class getReturnType() {
      return User.class;
   }

   public String getName() {
      return parameters.getProperty("name");
   }

   public void setName(String name) {
      parameters.setProperty("name", name);
   }

   public Boolean getBuddies() {
      return Boolean.parseBoolean(parameters.getProperty("buddies"));
   }

   public void setBuddies(Boolean b) {
      parameters.setProperty("buddies", convertBoolean(b));
   }

   public Boolean getGuilds() {
      return Boolean.parseBoolean(parameters.getProperty("guilds"));
   }

   public void setGuilds(Boolean b) {
      parameters.setProperty("guilds", convertBoolean(b));
   }

   public Boolean getHot() {
      return Boolean.parseBoolean(parameters.getProperty("hot"));
   }

   public void setHot(Boolean b) {
      parameters.setProperty("hot", convertBoolean(b));
   }

   public Boolean getTop() {
      return Boolean.parseBoolean(parameters.getProperty("top"));
   }

   public void setTop(Boolean b) {
      parameters.setProperty("top", convertBoolean(b));
   }

   public String getDomain() {
      return parameters.getProperty("domain");
   }

   public void setDomain(String domain) {
      parameters.setProperty("domain", domain);
   }

   public Integer getPage() {
      return Integer.parseInt(parameters.getProperty("page"));

   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

}
