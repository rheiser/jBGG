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

   public String getText() {
      return text;
   }

   public void setText(String type) {
      this.text = type;
   }

   public String getValue() {
      return value;
   }

   public void setValue(String text) {
      this.value = text;
   }

}
