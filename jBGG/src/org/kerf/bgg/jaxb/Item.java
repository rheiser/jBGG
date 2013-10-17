package org.kerf.bgg.jaxb;

import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
   @XmlAttribute(name = "id")
   String id;

   @XmlAttribute(name = "type")
   String type;

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

   @XmlElement
   List<Name> name;

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

   @XmlElement
   URL thumbnail;

   @XmlElement
   List<Link> link;

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

   public String getObjectType() {
      return objectType;
   }

   public void setObjectType(String objectType) {
      this.objectType = objectType;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getObjectId() {
      return objectId;
   }

   public void setObjectId(String objectId) {
      this.objectId = objectId;
   }

   public String getSubType() {
      return subType;
   }

   public void setSubType(String subType) {
      this.subType = subType;
   }

   public List<String> getSubtypes() {
      return subtypes;
   }

   public void setSubtypes(List<String> subtypes) {
      this.subtypes = subtypes;
   }

   public String getCollectionId() {
      return collectionId;
   }

   public void setCollectionId(String collectionId) {
      this.collectionId = collectionId;
   }

   public List<Name> getName() {
      return name;
   }

   public void setName(List<Name> name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Year getYearPublished() {
      return yearPublished;
   }

   public void setYearPublished(Year yearPublished) {
      this.yearPublished = yearPublished;
   }

   public URL getImage() {
      return image;
   }

   public void setImage(URL image) {
      this.image = image;
   }

   public URL getThumbnail() {
      return thumbnail;
   }

   public void setThumbnail(URL thumbnail) {
      this.thumbnail = thumbnail;
   }

   public List<Link> getLink() {
      return link;
   }

   public void setLink(List<Link> link) {
      this.link = link;
   }

   public Statistics getStats() {
      return stats;
   }

   public void setStats(Statistics stats) {
      this.stats = stats;
   }

   public Status getStatus() {
      return status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public Integer getNumPlays() {
      return numPlays;
   }

   public void setNumPlays(Integer numPlays) {
      this.numPlays = numPlays;
   }
}
