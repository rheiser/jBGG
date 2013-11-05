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
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Year {

   @XmlAttribute
   String value;

   @XmlValue
   String text;
   
   public String toString() {
      return (text == null || text.equals("")) ? ((value == null || value.equals("")) ? "NA" : value + " (attribute)") : text + " (text node)";
   }

   public String getText() {
      return text;
   }

   public String getValue() {
      return value;
   }

   public void setText(String type) {
      this.text = type;
   }

   public void setValue(String text) {
      this.value = text;
   }

}
