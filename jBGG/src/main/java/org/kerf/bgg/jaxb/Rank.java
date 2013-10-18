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

@XmlAccessorType(XmlAccessType.FIELD)
public class Rank {
   @XmlAttribute
   String type;

   @XmlAttribute
   String id;

   @XmlAttribute
   String name;

   @XmlAttribute(name = "friendlyname")
   String friendlyName;

   @XmlAttribute
   String value;

   @XmlAttribute(name = "bayesaverage")
   String bayesianAverage;

   public String getBayesianAverage() {
      return bayesianAverage;
   }

   public String getFriendlyName() {
      return friendlyName;
   }

   public String getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getType() {
      return type;
   }

   public String getValue() {
      return value;
   }

   public void setBayesianAverage(String bayesianAverage) {
      this.bayesianAverage = bayesianAverage;
   }

   public void setFriendlyName(String friendlyName) {
      this.friendlyName = friendlyName;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setType(String type) {
      this.type = type;
   }

   public void setValue(String value) {
      this.value = value;
   }

}
