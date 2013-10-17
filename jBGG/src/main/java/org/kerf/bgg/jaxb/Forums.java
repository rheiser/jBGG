package org.kerf.bgg.jaxb;

import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kerf.bgg.type.Type;

@XmlRootElement(name="forums")
@XmlAccessorType(XmlAccessType.FIELD)
public class Forums {
   @XmlAttribute
   Type type;
   
   @XmlAttribute
   String id;
   
   @XmlAttribute(name="termsofuse")
   URL termsOfUse;
   
   @XmlElement(name="forum")
   List<Forum> forums;

   public Type getType() {
      return type;
   }

   public void setType(Type type) {
      this.type = type;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

   public List<Forum> getForums() {
      return forums;
   }

   public void setForums(List<Forum> forum) {
      this.forums = forum;
   }
}
