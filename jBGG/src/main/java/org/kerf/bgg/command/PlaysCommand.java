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

import org.kerf.bgg.jaxb.Plays;
import org.kerf.bgg.type.ThingType;
import org.kerf.bgg.type.Type;

public class PlaysCommand extends Command {

   private final SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

   public PlaysCommand(String username) {
      command = "plays";

      setUsername(username);
   }

   public String getId() {
      return parameters.getProperty("id");
   }

   public Date getMaxdate() throws ParseException {
      return dateFormat.parse(parameters.getProperty("maxdate"));
   }

   public Date getMindate() throws ParseException {
      return dateFormat.parse(parameters.getProperty("mindate"));
   }

   public Integer getPage() {
      return Integer.parseInt(parameters.getProperty("page"));
   }

   @Override
   protected Class<Plays> getReturnType() {
      return Plays.class;
   }

   public ThingType getSubtype() {
      return ThingType.valueOf(parameters.getProperty("subtype"));
   }

   public Type getType() {
      return Type.valueOf(parameters.getProperty("type"));
   }

   public String getUsername() {
      return parameters.getProperty("username");
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public void setMaxdate(Date maxdate) {
      parameters.setProperty("maxdate", dateFormat.format(maxdate));
   }

   public void setMindate(Date mindate) {
      parameters.setProperty("mindate", dateFormat.format(mindate));
   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

   public void setSubtype(ThingType subtype) {
      parameters.setProperty("subtype", subtype.name());
   }

   public void setType(Type type) {
      parameters.setProperty("type", type.name());
   }

   public void setUsername(String username) {
      parameters.setProperty("username", username);
   }

}
