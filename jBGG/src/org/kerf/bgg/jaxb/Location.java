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

   public String getAddressFirstLine() {
      return addressFirstLine;
   }

   public void setAddressFirstLine(String addressFirstLine) {
      this.addressFirstLine = addressFirstLine;
   }

   public String getAddressSecondLine() {
      return addressSecondLine;
   }

   public void setAddressSecondLine(String addressSecondLine) {
      this.addressSecondLine = addressSecondLine;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getStateOrProvince() {
      return stateOrProvince;
   }

   public void setStateOrProvince(String stateOrProvince) {
      this.stateOrProvince = stateOrProvince;
   }

   public String getPostalCode() {
      return postalCode;
   }

   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }
}
