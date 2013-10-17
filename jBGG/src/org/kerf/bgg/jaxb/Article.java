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

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public URL getLink() {
      return link;
   }

   public void setLink(URL link) {
      this.link = link;
   }

   public Date getPostDate() {
      return postDate;
   }

   public void setPostDate(Date postDate) {
      this.postDate = postDate;
   }

   public Date getEditDate() {
      return editDate;
   }

   public void setEditDate(Date editDate) {
      this.editDate = editDate;
   }

   public Integer getNumEdits() {
      return numEdits;
   }

   public void setNumEdits(Integer numEdits) {
      this.numEdits = numEdits;
   }

   public String getSubject() {
      return subject;
   }

   public void setSubject(String subject) {
      this.subject = subject;
   }

   public String getBody() {
      return body;
   }

   public void setBody(String body) {
      this.body = body;
   }

}
