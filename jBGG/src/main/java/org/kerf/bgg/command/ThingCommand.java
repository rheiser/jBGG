package org.kerf.bgg.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.type.ThingType;

public class ThingCommand extends Command {

   private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

   public ThingCommand(String id) {
      command = "thing";

      parameters.put("id", id);
   }

   public ThingCommand(List<String> ids) {
      String idList = "";

      for (String currId : ids) {
         idList += currId + ",";
      }

      parameters.put("id", idList);
   }

   @Override
   protected Class<Items> getReturnType() {
      return Items.class;
   }

   public String getId() {
      return parameters.getProperty("id");
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public ThingType getType() {
      return ThingType.valueOf(parameters.getProperty("type"));
   }

   public void setType(ThingType type) {
      parameters.setProperty("type", type.name());
   }

   public Boolean getVersions() {
      return Boolean.parseBoolean(parameters.getProperty("versions"));
   }

   public void setVersions(Boolean versions) {
      parameters.setProperty("versions", convertBoolean(versions));
   }

   public Boolean getVideos() {
      return Boolean.parseBoolean(parameters.getProperty("videos"));
   }

   public void setVideos(Boolean videos) {
      parameters.setProperty("videos", convertBoolean(videos));
   }

   public Boolean getStats() {
      return Boolean.parseBoolean(parameters.getProperty("stats"));
   }

   public void setStats(Boolean stats) {
      parameters.setProperty("stats", convertBoolean(stats));
   }

   public Boolean getHistorical() {
      return Boolean.parseBoolean(parameters.getProperty("historical"));
   }

   public void setHistorical(Boolean historical) {
      parameters.setProperty("historical", convertBoolean(historical));
   }

   public Boolean getMarketplace() {
      return Boolean.parseBoolean(parameters.getProperty("marketplace"));
   }

   public void setMarketplace(Boolean marketplace) {
      parameters.setProperty("marketplace", convertBoolean(marketplace));
   }

   public Boolean getComments() {
      return Boolean.parseBoolean(parameters.getProperty("comments"));
   }

   public void setComments(Boolean comments) {
      parameters.setProperty("comments", convertBoolean(comments));
   }

   public Boolean getRatingComments() {
      return Boolean.parseBoolean(parameters.getProperty("ratingcomments"));
   }

   public void setRatingComments(Boolean ratingcomments) {
      parameters.setProperty("ratingcomments", convertBoolean(ratingcomments));
   }

   public Integer getPage() {
      return Integer.parseInt(parameters.getProperty("page"));
   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

   public Integer getPageSize() {
      return Integer.parseInt(parameters.getProperty("pagesize"));
   }

   public void setPageSize(Integer pagesize) {
      parameters.setProperty("pagesize", pagesize.toString());
   }

   public Date getFrom() throws ParseException {
      return dateFormat.parse(parameters.getProperty("from"));
   }

   public void setFrom(Date from) {
      parameters.setProperty("from", dateFormat.format(from));
   }

   public Date getTo() throws ParseException {
      return dateFormat.parse(parameters.getProperty("to"));
   }

   public void setTo(Date to) {
      parameters.setProperty("to", dateFormat.format(to));
   }

}
