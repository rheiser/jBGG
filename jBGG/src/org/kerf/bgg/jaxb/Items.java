package org.kerf.bgg.jaxb;

import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="items")
@XmlAccessorType(XmlAccessType.FIELD)
public class Items {
   @XmlAttribute
   int total;
   
   @XmlAttribute(name = "termsofuse")
   URL termsOfUse;
   
	@XmlElement(name="item")
	List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

   public int getTotal() {
      return total;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public URL getTermsOfUse() {
      return termsOfUse;
   }

   public void setTermsOfUse(URL termsOfUse) {
      this.termsOfUse = termsOfUse;
   }
}
