package org.kerf.bgg.jaxb;

import java.net.URL;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kerf.bgg.jaxb.adapter.ArticleDateAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Video {
	@XmlAttribute
	String id;

	@XmlAttribute
	String title;

	@XmlAttribute
	String category;

	@XmlAttribute
	String language;

	@XmlAttribute
	URL link;

	@XmlAttribute
	String username;

	@XmlAttribute(name = "userid")
	String userId;

	@XmlAttribute(name = "postdate")
	@XmlJavaTypeAdapter(ArticleDateAdapter.class)
	Date postDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public URL getLink() {
		return link;
	}

	public void setLink(URL link) {
		this.link = link;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
}
