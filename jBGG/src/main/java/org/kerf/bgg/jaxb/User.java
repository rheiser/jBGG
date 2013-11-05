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

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

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
   String firstName;

   @XmlPath("lastname/@value")
   String lastName;

   @XmlPath("avatarlink/@value")
   URL avatarLink;

   @XmlPath("yearregistered/@value")
   String yearRegistered;

   @XmlPath("lastlogin/@value")
   String lastLogin;

   @XmlPath("stateorprovince/@value")
   String stateOrProvince;

   @XmlPath("country/@value")
   String country;

   @XmlPath("webaddress/@value")
   String webAddress;

   @XmlPath("xboxaccount/@value")
   String xboxAccount;

   @XmlPath("wiiaccount/@value")
   String wiiAccount;

   @XmlPath("psnaccount/@value")
   String psnAccount;

   @XmlPath("battlenetaccount/@value")
   String battlenetAccount;

   @XmlPath("steamaccount/@value")
   String steamaccount;

   @XmlPath("traderating/@value")
   String tradeRating;

   public String toString() {
      String retval = "USER: ";
      
      retval += " | ID: " + getId();
      retval += " | Name: " + getName();
      retval += " | termsOfUse: " + getTermsOfUse();
      retval += " | First name: " + getFirstName();
      retval += " | Last name: " + getLastName();
      retval += " | Avatar URL: " + getAvatarLink();
      retval += " | Registered: " + getYearRegistered();
      retval += " | Last login: " + getLastLogin();
      retval += " | State: "+ getStateOrProvince();
      retval += " | Country: " + getCountry();
      retval += " | Website: " + getWebAddress();
      retval += " | XBox: " + getXboxAccount();
      retval += " | Wii: " + getWiiAccount();
      retval += " | PSN: " + getPsnAccount();
      retval += " | BattleNET: " + getBattlenetAccount();
      retval += " | Steam: " + getSteamaccount();
      retval += " | Trade rating: "+ getTradeRating();
      
      return retval;
   }
   public URL getAvatarLink() {
      return avatarLink;
   }

   public String getBattlenetAccount() {
      return battlenetAccount;
   }

   public String getCountry() {
      return country;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getId() {
      return id;
   }

   public String getLastLogin() {
      return lastLogin;
   }

   public String getLastName() {
      return lastName;
   }

   public String getName() {
      return name;
   }

   public String getPsnAccount() {
      return psnAccount;
   }

   public String getStateOrProvince() {
      return stateOrProvince;
   }

   public String getSteamaccount() {
      return steamaccount;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public String getTradeRating() {
      return tradeRating;
   }

   public String getWebAddress() {
      return webAddress;
   }

   public String getWiiAccount() {
      return wiiAccount;
   }

   public String getXboxAccount() {
      return xboxAccount;
   }

   public String getYearRegistered() {
      return yearRegistered;
   }

   public void setAvatarLink(URL avatarlink) {
      this.avatarLink = avatarlink;
   }

   public void setBattlenetAccount(String battlenetaccount) {
      this.battlenetAccount = battlenetaccount;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public void setFirstName(String firstname) {
      this.firstName = firstname;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setLastLogin(String lastlogin) {
      this.lastLogin = lastlogin;
   }

   public void setLastName(String lastname) {
      this.lastName = lastname;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setPsnAccount(String psnaccount) {
      this.psnAccount = psnaccount;
   }

   public void setStateOrProvince(String stateorprovince) {
      this.stateOrProvince = stateorprovince;
   }

   public void setSteamaccount(String steamaccount) {
      this.steamaccount = steamaccount;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

   public void setTradeRating(String traderating) {
      this.tradeRating = traderating;
   }

   public void setWebAddress(String webaddress) {
      this.webAddress = webaddress;
   }

   public void setWiiAccount(String wiiaccount) {
      this.wiiAccount = wiiaccount;
   }

   public void setXboxAccount(String xboxaccount) {
      this.xboxAccount = xboxaccount;
   }

   public void setYearRegistered(String yearregistered) {
      this.yearRegistered = yearregistered;
   }

}
