package org.kerf.bgg.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class PollResult {
	@XmlAttribute
	String value;

	@XmlAttribute(name = "numvotes")
	Integer numVotes;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(Integer numVotes) {
		this.numVotes = numVotes;
	}
}
