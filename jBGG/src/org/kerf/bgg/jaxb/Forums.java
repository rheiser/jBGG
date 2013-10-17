package org.kerf.bgg.jaxb;

import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="forums")
@XmlAccessorType(XmlAccessType.FIELD)
public class Forums {
   @XmlAttribute
   String type;
   
   @XmlAttribute
   String id;
   
   @XmlAttribute(name="termsofuse")
   URL termsOfUse;
   
   @XmlElement
   List<Forum> forum;

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

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }

   public List<Forum> getForum() {
      return forum;
   }

   public void setForum(List<Forum> forum) {
      this.forum = forum;
   }
}
