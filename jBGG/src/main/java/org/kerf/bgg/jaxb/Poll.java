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

import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Poll implements Iterable<PollResult> {
   @XmlAttribute
   String name;

   @XmlAttribute
   String title;

   @XmlAttribute(name = "totalvotes")
   Integer totalVotes;

   @XmlElementWrapper(name = "results")
   @XmlElement(name = "result")
   List<PollResult> results;

   public String toString() {
      String retval = "POLL: ";

      retval += " | Name: " + getName();
      retval += " | Title: " + getTitle();
      retval += " | Total Votes: " + getTotalVotes();

      for (PollResult result : results) {
         retval += result;
      }
      return retval;
   }

   public String getName() {
      return name;
   }

   public List<PollResult> getResults() {
      return results;
   }

   public String getTitle() {
      return title;
   }

   public Integer getTotalVotes() {
      return totalVotes;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setResults(List<PollResult> result) {
      this.results = result;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setTotalVotes(Integer totalVotes) {
      this.totalVotes = totalVotes;
   }

   public Iterator<PollResult> iterator() {
      return results.iterator();
   }
}
