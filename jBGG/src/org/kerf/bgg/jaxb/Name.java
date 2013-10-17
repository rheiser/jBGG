package org.kerf.bgg.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Name {

	@XmlAttribute
	String type;
	
	@XmlAttribute
	String value;

	@XmlAttribute(name="sortindex")
	Integer sortIndex;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String text) {
		this.value = text;
	}

   public Integer getSortIndex() {
      return sortIndex;
   }

   public void setSortIndex(Integer sortIndex) {
      this.sortIndex = sortIndex;
   }

}
