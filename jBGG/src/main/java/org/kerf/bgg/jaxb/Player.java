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

   public String getColor() {
      return color;
   }

   public String getName() {
      return name;
   }

   public Integer getRating() {
      return rating;
   }

   public Integer getScore() {
      return score;
   }

   public Integer getStartPosition() {
      return startPosition;
   }

   public String getUserId() {
      return userId;
   }

   public String getUsername() {
      return username;
   }

   public Boolean getWasNew() {
      return wasNew;
   }

   public Boolean getWon() {
      return won;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setRating(Integer rating) {
      this.rating = rating;
   }

   public void setScore(Integer score) {
      this.score = score;
   }

   public void setStartPosition(Integer startPosition) {
      this.startPosition = startPosition;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public void setWasNew(Boolean wasNew) {
      this.wasNew = wasNew;
   }

   public void setWon(Boolean won) {
      this.won = won;
   }
}
