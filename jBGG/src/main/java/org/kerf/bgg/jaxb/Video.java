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
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kerf.bgg.jaxb.adapter.ArticleDateAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Video {
   @XmlAttribute
   String id;

   @XmlAttribute
   String title;

   // FIXME - Enum?
   @XmlAttribute
   String category;

   // FIXME - standard Enum? (e.g., "en_US")
   @XmlAttribute
   String language;

   @XmlAttribute
   URL link;

   @XmlAttribute
   String username;

   @XmlAttribute(name = "userid")
   String userId;

   @XmlAttribute(name = "postdate")
   @XmlJavaTypeAdapter(ArticleDateAdapter.class)
   Date postDate;

   public String toString() {
      String retval = "VIDEO: ";

      retval += " | ID: " + getId();
      retval += " | Title: " + getTitle();
      retval += " | Category: " + getCategory();
      retval += " | Language: " + getLanguage();
      retval += " | Link: " + getLink();
      retval += " | Username: " + getUsername();
      retval += " | User ID: " + getUserId();
      retval += " | Post date: " + getPostDate();

      return retval;
   }

   public String getCategory() {
      return category;
   }

   public String getId() {
      return id;
   }

   public String getLanguage() {
      return language;
   }

   public URL getLink() {
      return link;
   }

   public Date getPostDate() {
      return postDate;
   }

   public String getTitle() {
      return title;
   }

   public String getUserId() {
      return userId;
   }

   public String getUsername() {
      return username;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setLanguage(String language) {
      this.language = language;
   }

   public void setLink(URL link) {
      this.link = link;
   }

   public void setPostDate(Date postDate) {
      this.postDate = postDate;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public void setUsername(String username) {
      this.username = username;
   }
}
