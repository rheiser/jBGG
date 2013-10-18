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

import org.kerf.bgg.jaxb.adapter.DateAdapter;

@XmlRootElement(name = "play")
@XmlAccessorType(XmlAccessType.FIELD)
public class Play {
   @XmlAttribute
   String id;

   @XmlAttribute
   @XmlJavaTypeAdapter(DateAdapter.class)
   Date date;

   @XmlAttribute
   Integer quantity;

   @XmlAttribute
   Integer length;

   @XmlAttribute
   Boolean incomplete;

   @XmlAttribute(name = "nowinstats")
   Boolean noWinStats;

   @XmlAttribute
   String location;

   @XmlElement
   Item item;

   @XmlElement
   String comments;

   @XmlElementWrapper(name = "players")
   @XmlElement(name = "player")
   List<Player> players;

   public String getComments() {
      return comments;
   }

   public Date getDate() {
      return date;
   }

   public String getId() {
      return id;
   }

   public Boolean getIncomplete() {
      return incomplete;
   }

   public Item getItem() {
      return item;
   }

   public Integer getLength() {
      return length;
   }

   public String getLocation() {
      return location;
   }

   public Boolean getNoWinStats() {
      return noWinStats;
   }

   public List<Player> getPlayers() {
      return players;
   }

   public Integer getQuantity() {
      return quantity;
   }

   public void setComments(String comments) {
      this.comments = comments;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setIncomplete(Boolean incomplete) {
      this.incomplete = incomplete;
   }

   public void setItem(Item item) {
      this.item = item;
   }

   public void setLength(Integer length) {
      this.length = length;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public void setNoWinStats(Boolean noWinStats) {
      this.noWinStats = noWinStats;
   }

   public void setPlayers(List<Player> players) {
      this.players = players;
   }

   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }
}
