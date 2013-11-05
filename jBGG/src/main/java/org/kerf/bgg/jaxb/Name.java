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

import org.kerf.bgg.type.NameType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Name {

   @XmlAttribute
   NameType type;

   @XmlAttribute
   String value;

   @XmlAttribute(name = "sortindex")
   Integer sortIndex;

   public String toString() {
      String retval = "NAME: ";

      retval += " | Value: " + getValue();
      retval += " | Type: " + getType();
      retval += " | Sort index: " + getSortIndex();

      return retval;
   }

   public Integer getSortIndex() {
      return sortIndex;
   }

   public NameType getType() {
      return type;
   }

   public String getValue() {
      return value;
   }

   public void setSortIndex(Integer sortIndex) {
      this.sortIndex = sortIndex;
   }

   public void setType(NameType type) {
      this.type = type;
   }

   public void setValue(String text) {
      this.value = text;
   }

}
