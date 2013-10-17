package org.kerf.bgg.jaxb;

import java.net.URL;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kerf.bgg.jaxb.adapter.LongDateAdapter;
import org.kerf.bgg.type.GuildCategory;

@XmlRootElement(name = "guild")
@XmlAccessorType(XmlAccessType.FIELD)
public class Guild {
   @XmlAttribute
   String id;

   @XmlAttribute
   String name;

   @XmlAttribute
   @XmlJavaTypeAdapter(LongDateAdapter.class)
   Date created;

   @XmlAttribute(name = "termsofuse")
   URL termsOfUse;

   @XmlElement
   GuildCategory category;

   @XmlElement
   URL website;

   @XmlElement
   String manager;

   @XmlElement
   String description;

   @XmlElement
   Location location;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

   public GuildCategory getCategory() {
      return category;
   }

   public void setCategory(GuildCategory category) {
      this.category = category;
   }

   public URL getWebsite() {
      return website;
   }

   public void setWebsite(URL website) {
      this.website = website;
   }

   public String getManager() {
      return manager;
   }

   public void setManager(String manager) {
      this.manager = manager;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Location getLocation() {
      return location;
   }

   public void setLocation(Location location) {
      this.location = location;
   }

}
