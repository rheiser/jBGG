package org.kerf.bgg.jaxb;

import javax.xml.bind.annotation.XmlAttribute;

public class Subtype {
   @XmlAttribute
   String value;

   public String toString() {
      return value;
   }

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
   }
}
