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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kerf.bgg.jaxb.adapter.ArticleDateAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Article {

   @XmlAttribute
   String id;

   @XmlAttribute
   String username;

   @XmlAttribute
   URL link;

   @XmlAttribute(name = "postdate")
   @XmlJavaTypeAdapter(ArticleDateAdapter.class)
   Date postDate;

   @XmlAttribute(name = "editdate")
   @XmlJavaTypeAdapter(ArticleDateAdapter.class)
   Date editDate;

   @XmlAttribute(name = "numedits")
   Integer numEdits;

   @XmlElement
   String subject;

   @XmlElement
   String body;

   public String toString() {
      String retval = "ARTICLE: ";

      retval += " | ID: " + getId();
      retval += " | Username: " + getUsername();
      retval += " | Link: " + getLink();
      retval += " | Post date: " + getPostDate();
      retval += " | Edit date: " + getEditDate();
      retval += " | Num edits: " + getNumEdits();
      retval += " | Subject: "+ getSubject();
      retval += " | Body: " + getBody();
      
      return retval;
   }

   public String getBody() {
      return body;
   }

   public Date getEditDate() {
      return editDate;
   }

   public String getId() {
      return id;
   }

   public URL getLink() {
      return link;
   }

   public Integer getNumEdits() {
      return numEdits;
   }

   public Date getPostDate() {
      return postDate;
   }

   public String getSubject() {
      return subject;
   }

   public String getUsername() {
      return username;
   }

   public void setBody(String body) {
      this.body = body;
   }

   public void setEditDate(Date editDate) {
      this.editDate = editDate;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setLink(URL link) {
      this.link = link;
   }

   public void setNumEdits(Integer numEdits) {
      this.numEdits = numEdits;
   }

   public void setPostDate(Date postDate) {
      this.postDate = postDate;
   }

   public void setSubject(String subject) {
      this.subject = subject;
   }

   public void setUsername(String username) {
      this.username = username;
   }

}
