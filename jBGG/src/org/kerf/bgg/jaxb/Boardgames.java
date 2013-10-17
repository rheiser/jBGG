package org.kerf.bgg.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "boardgames", namespace="")
@XmlAccessorType(XmlAccessType.FIELD)
public class Boardgames {
	@XmlElement(name="boardgame")
	List<Boardgame> boardgames;
	
	@XmlAttribute(name="termsofuse")
	String termsOfUse;
	

	public String getTermsOfUse() {
		return termsOfUse;
	}

	public void setTermsOfUse(String termsOfUse) {
		this.termsOfUse = termsOfUse;
	}

	public List<Boardgame> getBoardgames() {
		return boardgames;
	}

	public void setBoardgames(List<Boardgame> boardgames) {
		this.boardgames = boardgames;
	}
}
