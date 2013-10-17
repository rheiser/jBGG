package org.kerf.bgg.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Link {
   @XmlAttribute
   String type;
   
   @XmlAttribute
   String id;

   @XmlAttribute
   String value;

   @XmlAttribute
   Boolean inbound;

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public Boolean getInbound() {
      return inbound;
   }

   public void setInbound(Boolean inbound) {
      this.inbound = inbound;
   }
}
