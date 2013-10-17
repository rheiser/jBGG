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

   public String getFirstname() {
      return firstname;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   public URL getAvatarlink() {
      return avatarlink;
   }

   public void setAvatarlink(URL avatarlink) {
      this.avatarlink = avatarlink;
   }

   public String getYearregistered() {
      return yearregistered;
   }

   public void setYearregistered(String yearregistered) {
      this.yearregistered = yearregistered;
   }

   public String getLastlogin() {
      return lastlogin;
   }

   public void setLastlogin(String lastlogin) {
      this.lastlogin = lastlogin;
   }

   public String getStateorprovince() {
      return stateorprovince;
   }

   public void setStateorprovince(String stateorprovince) {
      this.stateorprovince = stateorprovince;
   }

   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public String getWebaddress() {
      return webaddress;
   }

   public void setWebaddress(String webaddress) {
      this.webaddress = webaddress;
   }

   public String getXboxaccount() {
      return xboxaccount;
   }

   public void setXboxaccount(String xboxaccount) {
      this.xboxaccount = xboxaccount;
   }

   public String getWiiaccount() {
      return wiiaccount;
   }

   public void setWiiaccount(String wiiaccount) {
      this.wiiaccount = wiiaccount;
   }

   public String getPsnaccount() {
      return psnaccount;
   }

   public void setPsnaccount(String psnaccount) {
      this.psnaccount = psnaccount;
   }

   public String getBattlenetaccount() {
      return battlenetaccount;
   }

   public void setBattlenetaccount(String battlenetaccount) {
      this.battlenetaccount = battlenetaccount;
   }

   public String getSteamaccount() {
      return steamaccount;
   }

   public void setSteamaccount(String steamaccount) {
      this.steamaccount = steamaccount;
   }

   public String getTraderating() {
      return traderating;
   }

   public void setTraderating(String traderating) {
      this.traderating = traderating;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

}
