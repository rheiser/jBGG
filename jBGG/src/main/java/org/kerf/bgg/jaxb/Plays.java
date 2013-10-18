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
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "plays")
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

   @XmlAttribute(name = "termsofuse")
   URL termsOfUse;

   @XmlElement(name = "play")
   List<Play> plays;

   public Integer getPage() {
      return page;
   }

   public List<Play> getPlays() {
      return plays;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public Integer getTotal() {
      return total;
   }

   public String getUserid() {
      return userid;
   }

   public String getUsername() {
      return username;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public void setPlays(List<Play> plays) {
      this.plays = plays;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }

   public void setUserid(String userid) {
      this.userid = userid;
   }

   public void setUsername(String username) {
      this.username = username;
   }
}
