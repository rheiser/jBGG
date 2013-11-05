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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kerf.bgg.jaxb.adapter.DateTimeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Status {
   // <status own="1" prevowned="0" fortrade="0" want="0" wanttoplay="0"
   // wanttobuy="0" wishlist="0" preordered="0"
   // lastmodified="2008-08-09 18:25:32"/>
   @XmlAttribute
   Boolean own;

   @XmlAttribute(name = "prevowned")
   Boolean previouslyOwned;

   @XmlAttribute(name = "fortrade")
   Boolean tradeable;

   @XmlAttribute
   Boolean want;

   @XmlAttribute(name = "wanttoplay")
   Boolean wantToPlay;

   @XmlAttribute(name = "wanttobuy")
   Boolean wantToBuy;

   @XmlAttribute
   Boolean wishlist;

   @XmlAttribute
   Boolean preordered;

   @XmlAttribute(name = "lastmodified")
   @XmlJavaTypeAdapter(DateTimeAdapter.class)
   Date lastModified;

   public String toString() {
      String retval = "STATUS: ";

      retval += " | Own: " + getOwn();
      retval += " | Previously Owned: " + getPreviouslyOwned();
      retval += " | Tradeable: " + getTradeable();
      retval += " | Want: " + getWant();
      retval += " | Want to Play: " + getWantToPlay();
      retval += " | Want to Buy: " + getWantToBuy();
      retval += " | Wishlist: " + getWishlist();
      retval += " | Pre-ordered: " + getPreordered();
      retval += " | Last Modified: " + getLastModified();

      return retval;
   }

   public Date getLastModified() {
      return lastModified;
   }

   public Boolean getOwn() {
      return own;
   }

   public Boolean getPreordered() {
      return preordered;
   }

   public Boolean getPreviouslyOwned() {
      return previouslyOwned;
   }

   public Boolean getTradeable() {
      return tradeable;
   }

   public Boolean getWant() {
      return want;
   }

   public Boolean getWantToBuy() {
      return wantToBuy;
   }

   public Boolean getWantToPlay() {
      return wantToPlay;
   }

   public Boolean getWishlist() {
      return wishlist;
   }

   public void setLastModified(Date lastModified) {
      this.lastModified = lastModified;
   }

   public void setOwn(Boolean own) {
      this.own = own;
   }

   public void setPreordered(Boolean preordered) {
      this.preordered = preordered;
   }

   public void setPreviouslyOwned(Boolean previouslyOwned) {
      this.previouslyOwned = previouslyOwned;
   }

   public void setTradeable(Boolean tradeable) {
      this.tradeable = tradeable;
   }

   public void setWant(Boolean want) {
      this.want = want;
   }

   public void setWantToBuy(Boolean wantToBuy) {
      this.wantToBuy = wantToBuy;
   }

   public void setWantToPlay(Boolean wantToPlay) {
      this.wantToPlay = wantToPlay;
   }

   public void setWishlist(Boolean wishlist) {
      this.wishlist = wishlist;
   }

}
