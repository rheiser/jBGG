package org.kerf.bgg.jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.kerf.bgg.jaxb.adapter.LongDateAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Listing {
	@XmlPath("listdate/@value")
	@XmlJavaTypeAdapter(LongDateAdapter.class)
	Date listDate;

	@XmlElement
	Price price;

	@XmlPath("condition/@value")
	String condition;

	@XmlPath("notes/@value")
	String notes;

	@XmlElement
	Link link;

	public Date getListDate() {
		return listDate;
	}

	public void setListDate(Date listDate) {
		this.listDate = listDate;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}
}
