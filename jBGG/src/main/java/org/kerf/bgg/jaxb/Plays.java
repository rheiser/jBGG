package org.kerf.bgg.jaxb;

import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="plays")
@XmlAccessorType(XmlAccessType.FIELD)
public class Plays {
   @XmlAttribute
   String username;
   
   @XmlAttribute
   String userid;
   
   @XmlAttribute
   Integer total;
   
   @XmlAttribute
   Integer page;
   
   @XmlAttribute(name="termsofuse")
   URL termsOfUse;
   
   @XmlElement(name="play")
   List<Play> plays;

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getUserid() {
      return userid;
   }

   public void setUserid(String userid) {
      this.userid = userid;
   }

   public Integer getTotal() {
      return total;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }

   public Integer getPage() {
      return page;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

   public List<Play> getPlays() {
      return plays;
   }

   public void setPlays(List<Play> plays) {
      this.plays = plays;
   }
}
