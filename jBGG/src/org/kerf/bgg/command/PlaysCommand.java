package org.kerf.bgg.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.kerf.bgg.jaxb.Plays;

public class PlaysCommand extends Command {

   private final SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

   public PlaysCommand() {
      command = "plays";
   }

   @Override
   protected Class getReturnType() {
      return Plays.class;
   }

   public String getUsername() {
      return parameters.getProperty("username");
   }

   public void setUsername(String username) {
      parameters.setProperty("username", username);
   }

   public String getId() {
      return parameters.getProperty("id");
   }

   public void setId(String id) {
      parameters.setProperty("id", id);
   }

   public String getType() {
      return parameters.getProperty("type");
   }

   public void setType(String type) {
      parameters.setProperty("type", type);
   }

   public String getSubtype() {
      return parameters.getProperty("subtype");
   }

   public void setSubtype(String subtype) {
      parameters.setProperty("subtype", subtype);
   }

   public Date getMindate() throws ParseException {
      return dateFormat.parse(parameters.getProperty("mindate"));
   }

   public void setMindate(Date mindate) {
      parameters.setProperty("mindate", dateFormat.format(mindate));
   }

   public Date getMaxdate() throws ParseException {
      return dateFormat.parse(parameters.getProperty("maxdate"));
   }

   public void setMaxdate(Date maxdate) {
      parameters.setProperty("maxdate", dateFormat.format(maxdate));
   }

   public Integer getPage() {
      return Integer.parseInt(parameters.getProperty("page"));
   }

   public void setPage(Integer page) {
      parameters.setProperty("page", page.toString());
   }

}
