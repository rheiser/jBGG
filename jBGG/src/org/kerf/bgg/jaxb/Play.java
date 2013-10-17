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

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public Integer getQuantity() {
      return quantity;
   }

   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   public Integer getLength() {
      return length;
   }

   public void setLength(Integer length) {
      this.length = length;
   }

   public Boolean getIncomplete() {
      return incomplete;
   }

   public void setIncomplete(Boolean incomplete) {
      this.incomplete = incomplete;
   }

   public Boolean getNoWinStats() {
      return noWinStats;
   }

   public void setNoWinStats(Boolean noWinStats) {
      this.noWinStats = noWinStats;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public Item getItem() {
      return item;
   }

   public void setItem(Item item) {
      this.item = item;
   }

   public String getComments() {
      return comments;
   }

   public void setComments(String comments) {
      this.comments = comments;
   }

   public List<Player> getPlayers() {
      return players;
   }

   public void setPlayers(List<Player> players) {
      this.players = players;
   }
}
