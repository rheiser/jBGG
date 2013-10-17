package org.kerf.bgg.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Poll {
	@XmlAttribute
	String name;
	
	@XmlAttribute
	String title;
	
	@XmlAttribute(name = "totalvotes")
	Integer totalVotes;

	@XmlElementWrapper(name="results")
	@XmlElement(name="result")
	List<PollResult> result;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(Integer totalVotes) {
		this.totalVotes = totalVotes;
	}

	public List<PollResult> getResult() {
		return result;
	}

	public void setResult(List<PollResult> result) {
		this.result = result;
	}
}
