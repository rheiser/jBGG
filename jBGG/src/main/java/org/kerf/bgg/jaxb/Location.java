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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "location")
@XmlAccessorType(XmlAccessType.FIELD)
public class Location {
   @XmlElement(name = "addr1")
   String addressFirstLine;

   @XmlElement(name = "addr2")
   String addressSecondLine;

   @XmlElement
   String city;

   @XmlElement(name = "stateorprovince")
   String stateOrProvince;

   @XmlElement(name = "postalcode")
   String postalCode;

   @XmlElement
   String country;

   public String toString() {
      String retval = "LOCATION: ";

      retval += " | Address 1: " + getAddressFirstLine();
      retval += " | Address 2: " + getAddressSecondLine();
      retval += " | City: " + getCity();
      retval += " | State: " + getStateOrProvince();
      retval += " | ZIP: " + getPostalCode();
      retval += " | Country: " + getCountry();

      return retval;

   }

   public String getAddressFirstLine() {
      return addressFirstLine;
   }

   public String getAddressSecondLine() {
      return addressSecondLine;
   }

   public String getCity() {
      return city;
   }

   public String getCountry() {
      return country;
   }

   public String getPostalCode() {
      return postalCode;
   }

   public String getStateOrProvince() {
      return stateOrProvince;
   }

   public void setAddressFirstLine(String addressFirstLine) {
      this.addressFirstLine = addressFirstLine;
   }

   public void setAddressSecondLine(String addressSecondLine) {
      this.addressSecondLine = addressSecondLine;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

   public void setStateOrProvince(String stateOrProvince) {
      this.stateOrProvince = stateOrProvince;
   }
}
