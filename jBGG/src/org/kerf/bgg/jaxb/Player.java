package org.kerf.bgg.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "player")
@XmlAccessorType(XmlAccessType.FIELD)
public class Player {
   @XmlAttribute
   String username;

   @XmlAttribute(name = "userid")
   String userId;

   @XmlAttribute
   String name;

   @XmlAttribute(name = "startposition")
   Integer startPosition;

   @XmlAttribute
   String color;

   @XmlAttribute
   Integer score;

   @XmlAttribute(name = "new")
   Boolean wasNew;

   @XmlAttribute
   Integer rating;

   @XmlAttribute(name = "win")
   Boolean won;

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getStartPosition() {
      return startPosition;
   }

   public void setStartPosition(Integer startPosition) {
      this.startPosition = startPosition;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public Integer getScore() {
      return score;
   }

   public void setScore(Integer score) {
      this.score = score;
   }

   public Boolean getWasNew() {
      return wasNew;
   }

   public void setWasNew(Boolean wasNew) {
      this.wasNew = wasNew;
   }

   public Integer getRating() {
      return rating;
   }

   public void setRating(Integer rating) {
      this.rating = rating;
   }

   public Boolean getWon() {
      return won;
   }

   public void setWon(Boolean won) {
      this.won = won;
   }
}
