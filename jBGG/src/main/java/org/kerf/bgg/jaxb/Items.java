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
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(XmlAccessType.FIELD)
public class Items implements Iterable<Item>{
   @XmlAttribute
   int total;

   @XmlAttribute(name = "termsofuse")
   URL termsOfUse;

   @XmlElement(name = "item")
   List<Item> items;

   public List<Item> getItems() {
      return items;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public int getTotal() {
      return total;
   }

   public void setItems(List<Item> items) {
      this.items = items;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public Iterator<Item> iterator() {
      return items.iterator();
   }
}
