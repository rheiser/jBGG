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

@XmlRootElement(name = "forum")
@XmlAccessorType(XmlAccessType.FIELD)
public class Forum {
   // <forum id="559" groupid="0" title="Sessions" noposting="0"
   // description="Post your session reports here." numthreads="593"
   // numposts="4570" lastpostdate="Wed, 02 Oct 2013 20:25:35 +0000" />
   @XmlAttribute
   String id;

   @XmlAttribute(name = "groupid")
   String groupId;

   @XmlAttribute
   String title;

   @XmlAttribute(name = "noposting")
   Boolean noPosting;

   @XmlAttribute
   String description;

   @XmlAttribute(name = "numthreads")
   Integer numThreads;

   @XmlAttribute(name = "numposts")
   String numPosts;

   @XmlAttribute(name = "lastpostdate")
   @XmlJavaTypeAdapter(DateTimeAdapter.class)
   Date lastPostDate;

   @XmlElementWrapper(name = "threads")
   @XmlElement(name = "thread")
   List<ForumThread> threads;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getGroupId() {
      return groupId;
   }

   public void setGroupId(String groupId) {
      this.groupId = groupId;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public Boolean getNoPosting() {
      return noPosting;
   }

   public void setNoPosting(Boolean noPosting) {
      this.noPosting = noPosting;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Integer getNumThreads() {
      return numThreads;
   }

   public void setNumThreads(Integer numThreads) {
      this.numThreads = numThreads;
   }

   public String getNumPosts() {
      return numPosts;
   }

   public void setNumPosts(String numPosts) {
      this.numPosts = numPosts;
   }

   public Date getLastPostDate() {
      return lastPostDate;
   }

   public void setLastPostDate(Date lastPostDate) {
      this.lastPostDate = lastPostDate;
   }

   public List<ForumThread> getThreads() {
      return threads;
   }

   public void setThreads(List<ForumThread> threads) {
      this.threads = threads;
   }

}
