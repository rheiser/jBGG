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

import java.net.URL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
   @XmlAttribute
   String id;

   @XmlAttribute
   String name;

   @XmlAttribute(name = "termsofuse")
   URL termsOfUse;

   @XmlPath("firstname/@value")
   String firstname;

   @XmlPath("lastname/@value")
   String lastname;

   @XmlPath("avatarlink/@value")
   URL avatarlink;

   @XmlPath("yearregistered/@value")
   String yearregistered;

   @XmlPath("lastlogin/@value")
   String lastlogin;

   @XmlPath("stateorprovince/@value")
   String stateorprovince;

   @XmlPath("country/@value")
   String country;

   @XmlPath("webaddress/@value")
   String webaddress;

   @XmlPath("xboxaccount/@value")
   String xboxaccount;

   @XmlPath("wiiaccount/@value")
   String wiiaccount;

   @XmlPath("psnaccount/@value")
   String psnaccount;

   @XmlPath("battlenetaccount/@value")
   String battlenetaccount;

   @XmlPath("steamaccount/@value")
   String steamaccount;

   @XmlPath("traderating/@value")
   String traderating;

   public URL getAvatarlink() {
      return avatarlink;
   }

   public String getBattlenetaccount() {
      return battlenetaccount;
   }

   public String getCountry() {
      return country;
   }

   public String getFirstname() {
      return firstname;
   }

   public String getId() {
      return id;
   }

   public String getLastlogin() {
      return lastlogin;
   }

   public String getLastname() {
      return lastname;
   }

   public String getName() {
      return name;
   }

   public String getPsnaccount() {
      return psnaccount;
   }

   public String getStateorprovince() {
      return stateorprovince;
   }

   public String getSteamaccount() {
      return steamaccount;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public String getTraderating() {
      return traderating;
   }

   public String getWebaddress() {
      return webaddress;
   }

   public String getWiiaccount() {
      return wiiaccount;
   }

   public String getXboxaccount() {
      return xboxaccount;
   }

   public String getYearregistered() {
      return yearregistered;
   }

   public void setAvatarlink(URL avatarlink) {
      this.avatarlink = avatarlink;
   }

   public void setBattlenetaccount(String battlenetaccount) {
      this.battlenetaccount = battlenetaccount;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setLastlogin(String lastlogin) {
      this.lastlogin = lastlogin;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setPsnaccount(String psnaccount) {
      this.psnaccount = psnaccount;
   }

   public void setStateorprovince(String stateorprovince) {
      this.stateorprovince = stateorprovince;
   }

   public void setSteamaccount(String steamaccount) {
      this.steamaccount = steamaccount;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

   public void setTraderating(String traderating) {
      this.traderating = traderating;
   }

   public void setWebaddress(String webaddress) {
      this.webaddress = webaddress;
   }

   public void setWiiaccount(String wiiaccount) {
      this.wiiaccount = wiiaccount;
   }

   public void setXboxaccount(String xboxaccount) {
      this.xboxaccount = xboxaccount;
   }

   public void setYearregistered(String yearregistered) {
      this.yearregistered = yearregistered;
   }

}
