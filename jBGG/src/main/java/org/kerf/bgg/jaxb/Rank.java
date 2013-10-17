package org.kerf.bgg.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Rank {
	@XmlAttribute
	String type;

	@XmlAttribute
	String id;

	@XmlAttribute
	String name;

	@XmlAttribute(name = "friendlyname")
	String friendlyName;

	@XmlAttribute
	String value;

	@XmlAttribute(name = "bayesaverage")
	String bayesianAverage;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getBayesianAverage() {
		return bayesianAverage;
	}

	public void setBayesianAverage(String bayesianAverage) {
		this.bayesianAverage = bayesianAverage;
	}

}
