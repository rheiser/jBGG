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

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kerf.bgg.jaxb.adapter.DateTimeAdapter;

@XmlRootElement(name = "thread")
@XmlAccessorType(XmlAccessType.FIELD)
public class ForumThread {
   @XmlAttribute
   String id;

   @XmlAttribute
   String subject;

   @XmlAttribute
   String author;

   @XmlAttribute(name = "numarticles")
   Integer numArticles;

   @XmlAttribute(name = "postdate")
   @XmlJavaTypeAdapter(DateTimeAdapter.class)
   Date postDate;

   @XmlAttribute(name = "lastpostdate")
   @XmlJavaTypeAdapter(DateTimeAdapter.class)
   Date lastPostDate;

   @XmlElementWrapper(name = "articles")
   @XmlElement(name = "article")
   List<Article> articles;

   public List<Article> getArticles() {
      return articles;
   }

   public String getAuthor() {
      return author;
   }

   public String getId() {
      return id;
   }

   public Date getLastPostDate() {
      return lastPostDate;
   }

   public Integer getNumArticles() {
      return numArticles;
   }

   public Date getPostDate() {
      return postDate;
   }

   public String getSubject() {
      return subject;
   }

   public void setArticles(List<Article> articles) {
      this.articles = articles;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setLastPostDate(Date lastPostDate) {
      this.lastPostDate = lastPostDate;
   }

   public void setNumArticles(Integer numArticles) {
      this.numArticles = numArticles;
   }

   public void setPostDate(Date postDate) {
      this.postDate = postDate;
   }

   public void setSubject(String subject) {
      this.subject = subject;
   }

}
