package org.kerf.bgg.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import org.kerf.bgg.type.NameType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Name {

	@XmlAttribute
	NameType type;
	
	@XmlAttribute
	String value;

	@XmlAttribute(name="sortindex")
	Integer sortIndex;
	
	public NameType getType() {
		return type;
	}

	public void setType(NameType type) {
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
