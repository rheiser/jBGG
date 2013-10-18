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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "boardgames", namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class Boardgames {
   @XmlElement(name = "boardgame")
   List<Boardgame> boardgames;

   @XmlAttribute(name = "termsofuse")
   String termsOfUse;

   public List<Boardgame> getBoardgames() {
      return boardgames;
   }

   public String getTermsOfUse() {
      return termsOfUse;
   }

   public void setBoardgames(List<Boardgame> boardgames) {
      this.boardgames = boardgames;
   }

   public void setTermsOfUse(String termsOfUse) {
      this.termsOfUse = termsOfUse;
   }
}
