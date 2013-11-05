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

import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Statistics implements Iterable<Rating>{
   @XmlElement
   List<Rating> ratings;

   public String toString() {
      String retval = "STATISTICS: ";
      
      for(Rating rating: ratings) {
         retval += rating;
      }
      
      return retval;
   }
   public List<Rating> getRatings() {
      return ratings;
   }

   public void setRatings(List<Rating> ratings) {
      this.ratings = ratings;
   }

   public Iterator<Rating> iterator() {
      return ratings.iterator();
   }
}
