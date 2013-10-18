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

import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Boardgame {

   @XmlAttribute(name = "objectid")
   String objectId;

   @XmlElement
   List<Name> name;

   @XmlElement(name = "yearpublished")
   String year;

   @XmlElement(name = "minplayers")
   Integer minPlayers;

   @XmlElement(name = "maxplayers")
   Integer maxPlayers;

   @XmlElement(name = "playingtime")
   Integer playingTime;

   @XmlElement
   Integer age;

   @XmlElement
   String description;

   @XmlElement
   URL thumbnail;

   @XmlElement
   URL image;

   @XmlElement(name = "boardgamepodcastepisode")
   List<Podcast> podcastEpisode;

   @XmlElement(name = "boardgamehonor")
   List<Honor> honor;

   @XmlElement(name = "boardgamepublisher")
   List<Publisher> publisher;

   @XmlElement(name = "boardgamefamily")
   List<Family> family;

   @XmlElement(name = "videogamebg")
   List<VideoGame> videoGame;

   @XmlElement(name = "boardgameexpansion")
   List<Expansion> expansion;

   @XmlElement(name = "boardgameaccessory")
   List<Accessory> accessory;

   @XmlElement(name = "boardgamemechanic")
   List<Mechanic> mechanic;

   @XmlElement(name = "boardgameversion")
   List<Version> version;

   @XmlElement(name = "boardgamecategory")
   List<Category> category;

   @XmlElement(name = "boardgameartist")
   List<Artist> artist;

   @XmlElement(name = "boardgamedesigner")
   List<Designer> designer;

   @XmlElement(name = "boardgamesubdomain")
   List<Domain> subdomain;

   @XmlElement(name = "poll")
   List<Poll> poll;

   @XmlElement
   Statistics statistics;

   public List<Accessory> getAccessory() {
      return accessory;
   }

   public Integer getAge() {
      return age;
   }

   public List<Artist> getArtist() {
      return artist;
   }

   public List<Category> getCategory() {
      return category;
   }

   public String getDescription() {
      return description;
   }

   public List<Designer> getDesigner() {
      return designer;
   }

   public List<Expansion> getExpansion() {
      return expansion;
   }

   public List<Family> getFamily() {
      return family;
   }

   public List<Honor> getHonor() {
      return honor;
   }

   public URL getImage() {
      return image;
   }

   public Integer getMaxPlayers() {
      return maxPlayers;
   }

   public List<Mechanic> getMechanic() {
      return mechanic;
   }

   public Integer getMinPlayers() {
      return minPlayers;
   }

   public List<Name> getName() {
      return name;
   }

   public String getObjectId() {
      return objectId;
   }

   public Integer getPlayingTime() {
      return playingTime;
   }

   public List<Podcast> getPodcastEpisode() {
      return podcastEpisode;
   }

   public List<Poll> getPoll() {
      return poll;
   }

   public List<Publisher> getPublisher() {
      return publisher;
   }

   public Statistics getStatistics() {
      return statistics;
   }

   public List<Domain> getSubdomain() {
      return subdomain;
   }

   public URL getThumbnail() {
      return thumbnail;
   }

   public List<Version> getVersion() {
      return version;
   }

   public List<VideoGame> getVideoGame() {
      return videoGame;
   }

   public String getYear() {
      return year;
   }

   public void setAccessory(List<Accessory> accessory) {
      this.accessory = accessory;
   }

   public void setAge(Integer age) {
      this.age = age;
   }

   public void setArtist(List<Artist> artist) {
      this.artist = artist;
   }

   public void setCategory(List<Category> category) {
      this.category = category;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public void setDesigner(List<Designer> designer) {
      this.designer = designer;
   }

   public void setExpansion(List<Expansion> expansion) {
      this.expansion = expansion;
   }

   public void setFamily(List<Family> family) {
      this.family = family;
   }

   public void setHonor(List<Honor> honor) {
      this.honor = honor;
   }

   public void setImage(URL image) {
      this.image = image;
   }

   public void setMaxPlayers(Integer maxPlayers) {
      this.maxPlayers = maxPlayers;
   }

   public void setMechanic(List<Mechanic> mechanic) {
      this.mechanic = mechanic;
   }

   public void setMinPlayers(Integer minPlayers) {
      this.minPlayers = minPlayers;
   }

   public void setName(List<Name> name) {
      this.name = name;
   }

   public void setObjectId(String objectId) {
      this.objectId = objectId;
   }

   public void setPlayingTime(Integer playingTime) {
      this.playingTime = playingTime;
   }

   public void setPodcastEpisode(List<Podcast> podcastEpisode) {
      this.podcastEpisode = podcastEpisode;
   }

   public void setPoll(List<Poll> poll) {
      this.poll = poll;
   }

   public void setPublisher(List<Publisher> publisher) {
      this.publisher = publisher;
   }

   public void setStatistics(Statistics statistics) {
      this.statistics = statistics;
   }

   public void setSubdomain(List<Domain> subdomain) {
      this.subdomain = subdomain;
   }

   public void setThumbnail(URL thumbnail) {
      this.thumbnail = thumbnail;
   }

   public void setVersion(List<Version> version) {
      this.version = version;
   }

   public void setVideoGame(List<VideoGame> videoGame) {
      this.videoGame = videoGame;
   }

   public void setYear(String year) {
      this.year = year;
   }
}
