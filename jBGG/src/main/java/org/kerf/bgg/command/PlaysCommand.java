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

   @Override
   protected Class<Plays> getReturnType() {
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

   public Type getType() {
      return Type.valueOf(parameters.getProperty("type"));
   }

   public void setType(Type type) {
      parameters.setProperty("type", type.name());
   }

   public ThingType getSubtype() {
      return ThingType.valueOf(parameters.getProperty("subtype"));
   }

   public void setSubtype(ThingType subtype) {
      parameters.setProperty("subtype", subtype.name());
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
