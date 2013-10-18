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

import org.kerf.bgg.jaxb.Items;
import org.kerf.bgg.type.ThingType;

public class CollectionCommand extends Command {

   private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

   public CollectionCommand(String username) {
      command = "collection";

      parameters.put("username", username);
   }

   Boolean getBrief() {
      return Boolean.parseBoolean(parameters.getProperty("brief"));
   }

   String getCollectionId() {
      return parameters.getProperty("collid");
   }

   public String getComment() {
      return parameters.getProperty("comment");
   }

   ThingType getExcludeSubtype() {
      return ThingType.valueOf(parameters.getProperty("excludesubtype"));
   }

   public String getHasparts() {
      return parameters.getProperty("hasparts");
   }

   public String getMaxbggrating() {
      return parameters.getProperty("maxbggrating");
   }

   public String getMaxplays() {
      return parameters.getProperty("maxplays");
   }

   public String getMaxrating() {
      return parameters.getProperty("maxrating");
   }

   public String getMinbggrating() {
      return parameters.getProperty("minbggrating");
   }

   public String getMinplays() {
      return parameters.getProperty("minplays");
   }

   public String getMinrating() {
      return parameters.getProperty("minrating");
   }

   Date getModifiedSince() throws ParseException {
      return dateFormat.parse(parameters.getProperty("modifiedsince"));
   }

   public String getOwn() {
      return parameters.getProperty("own");
   }

   public String getPlayed() {
      return parameters.getProperty("played");
   }

   public String getPrevowned() {
      return parameters.getProperty("prevowned");
   }

   public String getRated() {
      return parameters.getProperty("rated");
   }

   @Override
   protected Class<Items> getReturnType() {
      return Items.class;
   }

   public String getShowprivate() {
      return parameters.getProperty("showprivate");
   }

   Boolean getStats() {
      return Boolean.parseBoolean(parameters.getProperty("stats"));
   }

   ThingType getSubtype() {
      return ThingType.valueOf(parameters.getProperty("subtype"));
   }

   public String getTrade() {
      return parameters.getProperty("trade");
   }

   Boolean getVersion() {
      return Boolean.parseBoolean(parameters.getProperty("version"));
   }

   public String getWant() {
      return parameters.getProperty("want");
   }

   public String getWantparts() {
      return parameters.getProperty("wantparts");
   }

   public String getWanttobuy() {
      return parameters.getProperty("wanttobuy");
   }

   public String getWanttoplay() {
      return parameters.getProperty("wanttoplay");
   }

   public String getWishlist() {
      return parameters.getProperty("wishlist");
   }

   public String getWishlistpriority() {
      return parameters.getProperty("wishlistpriority");
   }

   public void setBrief(Boolean brief) {
      parameters.setProperty("brief", convertBoolean(brief));
   }

   public void setCollectionId(String collid) {
      parameters.setProperty("collid", collid);
   }

   public void setComment(Boolean comment) {
      parameters.setProperty("comment", convertBoolean(comment));
   }

   public void setExcludeSubtype(ThingType excludesubtype) {
      parameters.setProperty("excludesubtype", excludesubtype.name());
   }

   public void setHasparts(Boolean hasparts) {
      parameters.setProperty("hasparts", convertBoolean(hasparts));
   }

   public void setMaxbggrating(Integer maxbggrating) {
      parameters.setProperty("maxbggrating", maxbggrating.toString());
   }

   public void setMaxplays(Integer maxplays) {
      parameters.setProperty("maxplays", maxplays.toString());
   }

   public void setMaxrating(Integer maxrating) {
      parameters.setProperty("maxrating", maxrating.toString());
   }

   public void setMinbggrating(Integer minbggrating) {
      parameters.setProperty("minbggrating", minbggrating.toString());
   }

   public void setMinplays(Integer minplays) {
      parameters.setProperty("minplays", minplays.toString());
   }

   public void setMinrating(Integer minrating) {
      parameters.setProperty("minrating", minrating.toString());
   }

   public void setModifiedSince(Date modifiedSince) {
      parameters.setProperty("modifiedsince", dateFormat.format(modifiedSince));
   }

   public void setOwn(Boolean own) {
      parameters.setProperty("own", convertBoolean(own));
   }

   public void setPlayed(Boolean played) {
      parameters.setProperty("played", convertBoolean(played));
   }

   public void setPrevowned(Boolean prevowned) {
      parameters.setProperty("prevowned", convertBoolean(prevowned));
   }

   public void setRated(Boolean rated) {
      parameters.setProperty("rated", convertBoolean(rated));
   }

   public void setShowprivate(Boolean showprivate) {
      parameters.setProperty("showprivate", convertBoolean(showprivate));
   }

   public void setStats(Boolean stats) {
      parameters.setProperty("stats", convertBoolean(stats));
   }

   public void setSubtype(ThingType subtype) {
      parameters.setProperty("subtype", subtype.name());
   }

   public void setTrade(Boolean trade) {
      parameters.setProperty("trade", convertBoolean(trade));
   }

   public void setVersion(Boolean version) {
      parameters.setProperty("version", convertBoolean(version));
   }

   public void setWant(Boolean want) {
      parameters.setProperty("want", convertBoolean(want));
   }

   public void setWantparts(Boolean wantparts) {
      parameters.setProperty("wantparts", convertBoolean(wantparts));
   }

   public void setWanttobuy(Boolean wanttobuy) {
      parameters.setProperty("wanttobuy", convertBoolean(wanttobuy));
   }

   public void setWanttoplay(Boolean wanttoplay) {
      parameters.setProperty("wanttoplay", convertBoolean(wanttoplay));
   }

   public void setWishlist(Boolean wishlist) {
      parameters.setProperty("wishlist", convertBoolean(wishlist));
   }

   public void setWishlistpriority(Integer wishlistpriority) {
      parameters.setProperty("wishlistpriority", wishlistpriority.toString());
   }

}
