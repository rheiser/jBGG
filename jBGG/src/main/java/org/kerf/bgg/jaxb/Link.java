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

import org.kerf.bgg.type.LinkType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Link {
   @XmlAttribute
   LinkType type;

   @XmlAttribute
   String id;

   @XmlAttribute
   String value;

   @XmlAttribute
   Boolean inbound;

   public String getId() {
      return id;
   }

   public Boolean getInbound() {
      return inbound;
   }

   public LinkType getType() {
      return type;
   }

   public String getValue() {
      return value;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setInbound(Boolean inbound) {
      this.inbound = inbound;
   }

   public void setType(LinkType type) {
      this.type = type;
   }

   public void setValue(String value) {
      this.value = value;
   }
}
