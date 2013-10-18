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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kerf.bgg.jaxb.adapter.FloatAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Comment {
   @XmlAttribute
   String username;

   @XmlAttribute
   @XmlJavaTypeAdapter(FloatAdapter.class)
   Float rating;

   @XmlAttribute
   String value;

   public Float getRating() {
      return rating;
   }

   public String getUsername() {
      return username;
   }

   public String getValue() {
      return value;
   }

   public void setRating(Float rating) {
      this.rating = rating;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public void setValue(String value) {
      this.value = value;
   }
}
