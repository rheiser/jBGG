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

import java.io.Serializable;
import java.net.URL;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kerf.bgg.jaxb.adapter.LongDateAdapter;
import org.kerf.bgg.jaxb.adapter.URLAdapter;
import org.kerf.bgg.type.GuildCategory;

@XmlRootElement(name = "guild")
@XmlAccessorType(XmlAccessType.FIELD)
public class Guild implements Serializable {
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
   @XmlJavaTypeAdapter(URLAdapter.class)
   URL website;

   @XmlElement
   String manager;

   @XmlElement
   String description;

   @XmlElement
   Location location;

   @XmlElement
   String error;

   public String toString() {
      String retval = "GUILD: ";

      retval += " | ID: " + getId();
      retval += " | Name: " + getName();
      retval += " | Created: " + getCreated();
      retval += " | Terms of Use: " + getTermsOfUse();
      retval += " | Category: " + getCategory();
      retval += " | Website: " + getWebsite();
      retval += " | Manager: " + getManager();
      retval += " | Description: " + getDescription();
      retval += " | Location: " + getLocation();

      return retval;
   }

   public GuildCategory getCategory() {
      return category;
   }

   public Date getCreated() {
      return created;
   }

   public String getDescription() {
      return description;
   }

   public String getId() {
      return id;
   }

   public Location getLocation() {
      return location;
   }

   public String getManager() {
      return manager;
   }

   public String getName() {
      return name;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public URL getWebsite() {
      return website;
   }

   public void setCategory(GuildCategory category) {
      this.category = category;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setLocation(Location location) {
      this.location = location;
   }

   public void setManager(String manager) {
      this.manager = manager;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

   public void setWebsite(URL website) {
      this.website = website;
   }

   public String getError() {
      return error;
   }

   public void setError(String error) {
      this.error = error;
   }

}
