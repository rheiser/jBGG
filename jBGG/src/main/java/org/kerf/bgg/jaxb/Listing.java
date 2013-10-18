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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.kerf.bgg.jaxb.adapter.LongDateAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Listing {
   @XmlPath("listdate/@value")
   @XmlJavaTypeAdapter(LongDateAdapter.class)
   Date listDate;

   @XmlElement
   Price price;

   @XmlPath("condition/@value")
   String condition;

   @XmlPath("notes/@value")
   String notes;

   @XmlElement
   Link link;

   public String getCondition() {
      return condition;
   }

   public Link getLink() {
      return link;
   }

   public Date getListDate() {
      return listDate;
   }

   public String getNotes() {
      return notes;
   }

   public Price getPrice() {
      return price;
   }

   public void setCondition(String condition) {
      this.condition = condition;
   }

   public void setLink(Link link) {
      this.link = link;
   }

   public void setListDate(Date listDate) {
      this.listDate = listDate;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public void setPrice(Price price) {
      this.price = price;
   }
}
