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

package org.kerf.bgg.jaxb;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;

import org.apache.log4j.Logger;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.kerf.bgg.type.ThingType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
   @XmlTransient
   private Logger logger = Logger.getLogger(Item.class);

   // FIXME - The BGG schema uses both "id" and "objectid" in different places.
   @XmlAttribute(name = "id") // ThingCommand, FamilyCommand, HotCommand, SearchCommand
   String id;

   // FIXME - The BGG schema uses both "type" and "objecttype" in different
   // places.
   @XmlAttribute(name = "type")  // ThingCommand, SearchCommand
   ThingType type;

   @XmlAttribute(name = "objecttype") // CollectionCommand
   String objectType;

   @XmlAttribute(name = "objectid") // CollectionCommand
   String objectId;

   @XmlAttribute(name = "subtype") // CollectionCommand
   String subType;

   @XmlElementWrapper(name = "subtypes") // PlayCommand
   @XmlElement(name = "subtype")
   List<Subtype> subtypes;

   @XmlAttribute(name = "collid") // CollectionCommand
   String collectionId;

   @XmlElement(name = "name") // ThingCommand, CollectionCommand, FamilyCommand, HotCommand, SearchCommand
   List<Name> names;

   @XmlElement // ThingCommand, FamilyCommand
   String description;

   @XmlElement(name = "yearpublished") // ThingCommand (value attribute), CollectionCommand (text node), HotCommand (value attribute), SearchCommand (value attribute)
   Year yearPublished;

   @XmlElementWrapper(name = "marketplacelistings") // ThingCommand
   @XmlElement(name = "listing")
   List<Listing> marketPlaceListings;

   @XmlPath("playingtime/@value")  // ThingCommand
   Integer playingTime;

   @XmlElement // ThingCommand, CollectionCommand, FamilyCommand
   URL image;

   @XmlPath("thumbnail/text()")  // ThingCommand, CollectionCommand, FamilyCommand
   String thumbnailProxy;

   @XmlPath("thumbnail/@value") // HotCommand
   String thumbnailAttr;

   @XmlElement(name = "link") // ThingCommand, FamilyCommand
   List<Link> links;

   @XmlElement(name = "statistics")  // ThingCommand
   Statistics stats;

   @XmlElement
   Status status; // CollectionCommand

   @XmlElement(name = "numplays") // CollectionCommand
   Integer numPlays;

   @XmlElement(name = "poll") // ThingCommand
   List<Poll> polls;

   @XmlElementWrapper(name = "versions") // ThingCommand
   @XmlElement(name = "item")
   List<Item> versions;

   @XmlElementWrapper(name = "comments") // ThingCommand
   @XmlElement(name = "comment")
   List<Comment> comments;

   @XmlElementWrapper(name = "videos") // ThingCommand
   @XmlElement(name = "video")
   List<Video> videos;

   @XmlPath("productcode/@value") // ThingCommand (only when versions = 1)
   String productCode;

   @XmlPath("length/@value") // ThingCommand (only when versions = 1)
   Float length;

   @XmlPath("width/@value") // ThingCommand (only when versions = 1)
   Float width;

   @XmlPath("depth/@value") // ThingCommand (only when versions = 1)
   Float depth;

   @XmlPath("weight/@value") // ThingCommand (only when versions = 1)
   Float weight;

   @XmlPath("minplayers/@value") // ThingCommand (only when marketplace = 1)
   Integer minimumPlayers;

   @XmlPath("maxplayers/@value") // ThingCommand (only when marketplace = 1)
   Integer maximumPlayers;

   @XmlPath("minage/@value") // ThingCommand (only when marketplace = 1)
   Integer minimumAge;

   public String toString() {
      String retval = "ITEM: ";

      retval += "CollectionId: " + getCollectionId();

      retval += " | Comments: " + getComments();

      retval += " | Depth: " + getDepth();

      retval += " | Description: " + getDescription();

      retval += " | Id: " + getId();

      retval += " | Image: " + getImage();

      retval += " | Length: " + getLength();

      retval += " | Links: " + getLinks();

      retval += " | MarketPlaceListings: " + getMarketPlaceListings();

      retval += " | MaximumPlayers: " + getMaximumPlayers();

      retval += " | MinimumAge: " + getMinimumAge();

      retval += " | MinimumPlayers: " + getMinimumPlayers();

      retval += " | Names: " + getNames();

      retval += " | NumPlays: " + getNumPlays();

      retval += " | ObjectId: " + getObjectId();

      retval += " | ObjectType: " + getObjectType();

      retval += " | PlayingTime: " + getPlayingTime();

      retval += " | Polls: " + getPolls();

      retval += " | ProductCode: " + getProductCode();

      retval += " | Stats: " + getStats();

      retval += " | Status: " + getStatus();

      retval += " | SubType: " + getSubType();

      retval += " | Subtypes: " + getSubtypes();

      try {
         retval += " | Thumbnail: " + getThumbnail();
      } catch (MalformedURLException e) {
         // ignore
      }

      retval += " | Type: " + getType();

      retval += " | Versions: " + getVersions();

      retval += " | Videos: " + getVideos();

      retval += " | Weight: " + getWeight();

      retval += " | Width: " + getWidth();

      retval += " | YearPublished: " + getYearPublished();

      return retval;
   }

   public String getCollectionId() {
      return collectionId;
   }

   public List<Comment> getComments() {
      return comments;
   }

   public Float getDepth() {
      return depth;
   }

   public String getDescription() {
      return description;
   }

   public String getId() {
      return id;
   }

   public URL getImage() {
      return image;
   }

   public Float getLength() {
      return length;
   }

   public List<Link> getLinks() {
      return links;
   }

   public List<Listing> getMarketPlaceListings() {
      return marketPlaceListings;
   }

   public Integer getMaximumPlayers() {
      return maximumPlayers;
   }

   public Integer getMinimumAge() {
      return minimumAge;
   }

   public Integer getMinimumPlayers() {
      return minimumPlayers;
   }

   public List<Name> getNames() {
      return names;
   }

   public Integer getNumPlays() {
      return numPlays;
   }

   public String getObjectId() {
      return objectId;
   }

   public String getObjectType() {
      return objectType;
   }

   public Integer getPlayingTime() {
      return playingTime;
   }

   public List<Poll> getPolls() {
      return polls;
   }

   public String getProductCode() {
      return productCode;
   }

   public Statistics getStats() {
      return stats;
   }

   public Status getStatus() {
      return status;
   }

   public String getSubType() {
      return subType;
   }

   public List<Subtype> getSubtypes() {
      return subtypes;
   }

   // FIXME - Workaround. The BGG schema is inconsistent with the thumbnail
   // element inside item. Sometimes it's the text() node, sometimes it's the
   // @value attribute
   public URL getThumbnail() throws MalformedURLException {
      return (thumbnailProxy == null || thumbnailProxy.equals("")) ? new URL(thumbnailAttr + "?attr") : new URL(thumbnailProxy + "?proxy");
   }

   public ThingType getType() {
      return type;
   }

   public List<Item> getVersions() {
      return versions;
   }

   public List<Video> getVideos() {
      return videos;
   }

   public Float getWeight() {
      return weight;
   }

   public Float getWidth() {
      return width;
   }

   public Year getYearPublished() {
      return yearPublished;
   }

   public void setCollectionId(String collectionId) {
      this.collectionId = collectionId;
   }

   public void setComments(List<Comment> comments) {
      this.comments = comments;
   }

   public void setDepth(Float depth) {
      this.depth = depth;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setImage(URL image) {
      this.image = image;
   }

   public void setLength(Float length) {
      this.length = length;
   }

   public void setLinks(List<Link> link) {
      this.links = link;
   }

   public void setMarketPlaceListings(List<Listing> marketPlaceListings) {
      this.marketPlaceListings = marketPlaceListings;
   }

   public void setMaximumPlayers(Integer maximumPlayers) {
      this.maximumPlayers = maximumPlayers;
   }

   public void setMinimumAge(Integer minimumAge) {
      this.minimumAge = minimumAge;
   }

   public void setMinimumPlayers(Integer minimumPlayers) {
      this.minimumPlayers = minimumPlayers;
   }

   public void setNames(List<Name> name) {
      this.names = name;
   }

   public void setNumPlays(Integer numPlays) {
      this.numPlays = numPlays;
   }

   public void setObjectId(String objectId) {
      this.objectId = objectId;
   }

   public void setObjectType(String objectType) {
      this.objectType = objectType;
   }

   public void setPlayingTime(Integer playingTime) {
      this.playingTime = playingTime;
   }

   public void setPolls(List<Poll> polls) {
      this.polls = polls;
   }

   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   public void setStats(Statistics stats) {
      this.stats = stats;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public void setSubType(String subType) {
      this.subType = subType;
   }

   public void setSubtypes(List<Subtype> subtypes) {
      this.subtypes = subtypes;
   }

   public void setThumbnailAttr(String thumbnailAttr) {
      this.thumbnailAttr = thumbnailAttr;
   }

   public void setThumbnailProxy(String thumbnail) {
      this.thumbnailProxy = thumbnail;
   }

   public void setType(ThingType type) {
      this.type = type;
   }

   public void setVersions(List<Item> versions) {
      this.versions = versions;
   }

   public void setVideos(List<Video> videos) {
      this.videos = videos;
   }

   public void setWeight(Float weight) {
      this.weight = weight;
   }

   public void setWidth(Float width) {
      this.width = width;
   }

   public void setYearPublished(Year yearPublished) {
      this.yearPublished = yearPublished;
   }

}
