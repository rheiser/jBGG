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
public class PollResult {
   @XmlAttribute
   String value;

   @XmlAttribute(name = "numvotes")
   Integer numVotes;

   public String toString() {
      String retval = "POLL RESULT: ";
      
      retval += " | Value: " + getValue();
      retval += " | Num Votes: " + getNumVotes();
      
      return retval;
   }
   public Integer getNumVotes() {
      return numVotes;
   }

   public String getValue() {
      return value;
   }

   public void setNumVotes(Integer numVotes) {
      this.numVotes = numVotes;
   }

   public void setValue(String value) {
      this.value = value;
   }
}
