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
   @XmlAttribute(name = "id")
   String id;

   // FIXME - The BGG schema uses both "type" and "objecttype" in different
   // places.
   @XmlAttribute(name = "type")
   ThingType type;

   @XmlAttribute(name = "objecttype")
   String objectType;

   @XmlAttribute(name = "objectid")
   String objectId;

   @XmlAttribute(name = "subtype")
   String subType;

   @XmlElementWrapper(name = "subtypes")
   @XmlElement(name = "subtype")
   List<String> subtypes;

   @XmlAttribute(name = "collid")
   String collectionId;

   @XmlElement(name = "name")
   List<Name> names;

   @XmlElement
   String description;

   @XmlElement(name = "yearpublished")
   Year yearPublished;

   @XmlPath("minplayers/@value")
   Integer minimumPlayers;

   @XmlPath("maxplayers/@value")
   Integer maximumPlayers;

   @XmlPath("minage/@value")
   Integer minimumAge;

   @XmlPath("playingtime/@value")
   Integer playingTime;

   @XmlElement
   URL image;

   @XmlPath("thumbnail/text()")
   String thumbnailProxy;

   @XmlPath("thumbnail/@value")
   String thumbnailAttr;

   @XmlElement(name = "link")
   List<Link> links;

   @XmlElement(name = "statistics")
   Statistics stats;

   @XmlElement
   Status status;

   @XmlElement(name = "numplays")
   Integer numPlays;

   @XmlElement(name = "poll")
   List<Poll> polls;

   @XmlElementWrapper(name = "versions")
   @XmlElement(name = "item")
   List<Item> versions;

   @XmlPath("productcode/@value")
   String productCode;

   @XmlPath("length/@value")
   Float length;

   @XmlPath("width/@value")
   Float width;

   @XmlPath("depth/@value")
   Float depth;

   @XmlPath("weight/@value")
   Float weight;

   @XmlElementWrapper(name = "comments")
   @XmlElement(name = "comment")
   List<Comment> comments;

   @XmlElementWrapper(name = "videos")
   @XmlElement(name = "video")
   List<Video> videos;

   @XmlElementWrapper(name = "marketplacelistings")
   @XmlElement(name = "listing")
   List<Listing> marketPlaceListings;

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

   public List<String> getSubtypes() {
      return subtypes;
   }

   // FIXME - Workaround. The BGG schema is inconsistent with the thumbnail
   // element inside item. Sometimes it's the text() node, sometimes it's the
   // @value attribute
   public URL getThumbnail() throws MalformedURLException {
      return (thumbnailProxy == null || thumbnailProxy.equals("")) ? new URL(thumbnailAttr) : new URL(thumbnailProxy);
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

   public void setSubtypes(List<String> subtypes) {
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
