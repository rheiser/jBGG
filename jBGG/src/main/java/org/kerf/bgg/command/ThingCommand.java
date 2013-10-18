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
import java.util.List;

import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.type.ThingType;

public class ThingCommand extends Command {

   private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

   public ThingCommand(List<String> ids) {
      String idList = "";

      for (String currId : ids) {
         idList += currId + ",";
      }

      parameters.put("id", idList);
   }

   public ThingCommand(String id) {
      command = "thing";

      parameters.put("id", id);
   }

   public Boolean getComments() {
      return Boolean.parseBoolean(parameters.getProperty("comments"));
   }

   public Date getFrom() throws ParseException {
      return dateFormat.parse(parameters.getProperty("from"));
   }

   public Boolean getHistorical() {
      return Boolean.parseBoolean(parameters.getProperty("historical"));
   }

   public String getId() {
      return parameters.getProperty("id");
   }

   public Boolean getMarketplace() {
      return Boolean.parseBoolean(parameters.getProperty("marketplace"));
   }

   public Integer getPage() {
      return Integer.parseInt(parameters.getProperty("page"));
   }

   public Integer getPageSize() {
      return Integer.parseInt(parameters.getProperty("pagesize"));
   }

   public Boolean getRatingComments() {
      return Boolean.parseBoolean(parameters.getProperty("ratingcomments"));
   }

   @Override
   protected Class<Items> getReturnType() {
      return Items.class;
   }

   public Boolean getStats() {
      return Boolean.parseBoolean(parameters.getProperty("stats"));
   }

   public Date getTo() throws ParseException {
      return dateFormat.parse(parameters.getProperty("to"));
   }

   public ThingType getType() {
      return ThingType.valueOf(parameters.getProperty("type"));
   }

   public Boolean getVersions() {
      return Boolean.parseBoolean(parameters.getProperty("versions"));
   }

   public Boolean getVideos() {
      return Boolean.parseBoolean(parameters.getProperty("videos"));
   }

   public void setComments(Boolean comments) {
      parameters.setProperty("comments", convertBoolean(comments));
   }

   public void setFrom(Date from) {
      parameters.setProperty("from", dateFormat.format(from));
   }

   public void setHistorical(Boolean historical) {
      parameters.setProperty("historical", convertBoolean(historical));
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public void setMarketplace(Boolean marketplace) {
      parameters.setProperty("marketplace", convertBoolean(marketplace));
   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

   public void setPageSize(Integer pagesize) {
      parameters.setProperty("pagesize", pagesize.toString());
   }

   public void setRatingComments(Boolean ratingcomments) {
      parameters.setProperty("ratingcomments", convertBoolean(ratingcomments));
   }

   public void setStats(Boolean stats) {
      parameters.setProperty("stats", convertBoolean(stats));
   }

   public void setTo(Date to) {
      parameters.setProperty("to", dateFormat.format(to));
   }

   public void setType(ThingType type) {
      parameters.setProperty("type", type.name());
   }

   public void setVersions(Boolean versions) {
      parameters.setProperty("versions", convertBoolean(versions));
   }

   public void setVideos(Boolean videos) {
      parameters.setProperty("videos", convertBoolean(videos));
   }

}
