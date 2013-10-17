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
   String numArticles;

   @XmlAttribute(name = "postdate")
   @XmlJavaTypeAdapter(DateTimeAdapter.class)
   Date postDate;

   @XmlAttribute(name = "lastpostdate")
   @XmlJavaTypeAdapter(DateTimeAdapter.class)
   Date lastPostDate;

   @XmlElementWrapper(name = "articles")
   @XmlElement(name = "article")
   List<Article> articles;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getSubject() {
      return subject;
   }

   public void setSubject(String subject) {
      this.subject = subject;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getNumArticles() {
      return numArticles;
   }

   public void setNumArticles(String numArticles) {
      this.numArticles = numArticles;
   }

   public Date getPostDate() {
      return postDate;
   }

   public void setPostDate(Date postDate) {
      this.postDate = postDate;
   }

   public Date getLastPostDate() {
      return lastPostDate;
   }

   public void setLastPostDate(Date lastPostDate) {
      this.lastPostDate = lastPostDate;
   }

   public List<Article> getArticles() {
      return articles;
   }

   public void setArticles(List<Article> articles) {
      this.articles = articles;
   }

}
