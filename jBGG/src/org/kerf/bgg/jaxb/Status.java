package org.kerf.bgg.jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kerf.bgg.jaxb.adapter.DateTimeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Status {
	// <status own="1" prevowned="0" fortrade="0" want="0" wanttoplay="0"
	// wanttobuy="0" wishlist="0" preordered="0"
	// lastmodified="2008-08-09 18:25:32"/>
	@XmlAttribute
	Boolean own;

	@XmlAttribute(name = "prevowned")
	Boolean previouslyOwned;

	@XmlAttribute(name = "fortrade")
	Boolean tradeable;

	@XmlAttribute
	Boolean want;

	@XmlAttribute(name = "wanttoplay")
	Boolean wantToPlay;

	@XmlAttribute(name = "wanttobuy")
	Boolean wantToBuy;

	@XmlAttribute
	Boolean wishlist;

	@XmlAttribute
	Boolean preordered;

	@XmlAttribute(name = "lastmodified")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	Date lastModified;

	public Boolean getOwn() {
		return own;
	}

	public void setOwn(Boolean own) {
		this.own = own;
	}

	public Boolean getPreviouslyOwned() {
		return previouslyOwned;
	}

	public void setPreviouslyOwned(Boolean previouslyOwned) {
		this.previouslyOwned = previouslyOwned;
	}

	public Boolean getTradeable() {
		return tradeable;
	}

	public void setTradeable(Boolean tradeable) {
		this.tradeable = tradeable;
	}

	public Boolean getWant() {
		return want;
	}

	public void setWant(Boolean want) {
		this.want = want;
	}

	public Boolean getWantToPlay() {
		return wantToPlay;
	}

	public void setWantToPlay(Boolean wantToPlay) {
		this.wantToPlay = wantToPlay;
	}

	public Boolean getWantToBuy() {
		return wantToBuy;
	}

	public void setWantToBuy(Boolean wantToBuy) {
		this.wantToBuy = wantToBuy;
	}

	public Boolean getWishlist() {
		return wishlist;
	}

	public void setWishlist(Boolean wishlist) {
		this.wishlist = wishlist;
	}

	public Boolean getPreordered() {
		return preordered;
	}

	public void setPreordered(Boolean preordered) {
		this.preordered = preordered;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

}
