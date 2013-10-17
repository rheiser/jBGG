package org.kerf.bgg.jaxb;

import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

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

   @XmlAttribute(name = "collid")
   String collectionId;

   @XmlElement
   List<Name> name;
   
   @XmlElement
   String description;

   @XmlElement(name = "yearpublished")
   Year yearPublished;

   @XmlElement
   URL image;

   @XmlElement
   URL thumbnail;

   @XmlElement
   List<Link> link;
   
   @XmlElement(name = "stats")
   Statistics stats;

   @XmlElement
   Status status;

   @XmlElement(name = "numplays")
   Integer numPlays;

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
