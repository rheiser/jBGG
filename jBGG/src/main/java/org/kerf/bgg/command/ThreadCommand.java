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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.kerf.bgg.jaxb.ForumThread;

public class ThreadCommand extends Command {

   private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

   public ThreadCommand(String id) {
      command = "thread";

      setId(id);
   }

   public String getCount() {
      return parameters.getProperty("count");
   }

   public String getId() {
      return parameters.getProperty("id");
   }

   public Date getMinArticleDate() throws ParseException {
      return dateFormat.parse(parameters.getProperty("minarticledate"));
   }

   public String getMinArticleId() {
      return parameters.getProperty("minarticleid");
   }

   @Override
   protected Class<ForumThread> getReturnType() {
      return ForumThread.class;
   }

   public String getUsername() {
      return parameters.getProperty("username");
   }

   public void setCount(Boolean count) {
      parameters.setProperty("count", count.toString());
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public void setMinArticleDate(Date date) {
      parameters.setProperty("minarticledate", dateFormat.format(date));
   }

   public void setMinArticleId(String id) {
      parameters.setProperty("minarticleid", id);
   }

   public void setUsername(String username) {
      parameters.setProperty("username", username);
   }

}
