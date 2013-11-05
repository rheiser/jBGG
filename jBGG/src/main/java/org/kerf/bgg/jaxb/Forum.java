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

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
public class Forum implements Iterable<ForumThread>{

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

   public Forum() {
      threads = new ArrayList<ForumThread>();
   }
   
   public String toString() {
      String retval = "FORUM: ";

      retval += " | ID: " + getId();
      retval += " | Group ID: " + getGroupId();
      retval += " | Title: " + getTitle();
      retval += " | Posting: " + (!getNoPosting());
      retval += " | Description: " + getDescription();
      retval += " | # Threads: " + getNumThreads();
      retval += " | # Posts: " + getNumPosts();
      retval += " | Last post date: " + getLastPostDate();

      for (ForumThread thread : getThreads()) {
         retval += thread;
      }
      return retval;
   }

   public String getDescription() {
      return description;
   }

   public String getGroupId() {
      return groupId;
   }

   public String getId() {
      return id;
   }

   public Date getLastPostDate() {
      return lastPostDate;
   }

   public Boolean getNoPosting() {
      return noPosting;
   }

   public String getNumPosts() {
      return numPosts;
   }

   public Integer getNumThreads() {
      return numThreads;
   }

   public List<ForumThread> getThreads() {
      return threads;
   }

   public String getTitle() {
      return title;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public void setGroupId(String groupId) {
      this.groupId = groupId;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setLastPostDate(Date lastPostDate) {
      this.lastPostDate = lastPostDate;
   }

   public void setNoPosting(Boolean noPosting) {
      this.noPosting = noPosting;
   }

   public void setNumPosts(String numPosts) {
      this.numPosts = numPosts;
   }

   public void setNumThreads(Integer numThreads) {
      this.numThreads = numThreads;
   }

   public void setThreads(List<ForumThread> threads) {
      this.threads = threads;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public Iterator<ForumThread> iterator() {
      return threads.iterator();
   }

}
