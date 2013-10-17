package org.kerf.bgg.jaxb;

import java.net.URL;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Boardgame {

	@XmlAttribute(name="objectid")
	String objectId;

	@XmlElement
	List<Name> name;

	@XmlElement(name = "yearpublished")
	String year;

	@XmlElement(name = "minplayers")
	Integer minPlayers;

	@XmlElement(name = "maxplayers")
	Integer maxPlayers;

	@XmlElement(name = "playingtime")
	Integer playingTime;

	@XmlElement
	Integer age;

	@XmlElement
	String description;

	@XmlElement
	URL thumbnail;

	@XmlElement
	URL image;

	@XmlElement(name = "boardgamepodcastepisode")
	List<Podcast> podcastEpisode;

	@XmlElement(name = "boardgamehonor")
	List<Honor> honor;

	@XmlElement(name = "boardgamepublisher")
	List<Publisher> publisher;

	@XmlElement(name = "boardgamefamily")
	List<Family> family;

	@XmlElement(name = "videogamebg")
	List<VideoGame> videoGame;
	
	@XmlElement(name="boardgameexpansion")
	List<Expansion> expansion;

	@XmlElement(name="boardgameaccessory")
	List<Accessory> accessory;
	
	@XmlElement(name = "boardgamemechanic")
	List<Mechanic> mechanic;
	
	@XmlElement(name = "boardgameversion")
	List<Version> version;
	
	@XmlElement(name="boardgamecategory")
	List<Category> category;
	
	@XmlElement(name="boardgameartist")
	List<Artist> artist;
	
	@XmlElement(name="boardgamedesigner")
	List<Designer> designer;
	
	@XmlElement(name="boardgamesubdomain")
	List<Domain> subdomain;
	
	@XmlElement(name="poll")
	List<Poll> poll;
	
	@XmlElement
	Statistics statistics;
	
	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public List<Name> getName() {
		return name;
	}

	public void setName(List<Name> name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getMinPlayers() {
		return minPlayers;
	}

	public void setMinPlayers(Integer minPlayers) {
		this.minPlayers = minPlayers;
	}

	public Integer getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(Integer maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public Integer getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(Integer playingTime) {
		this.playingTime = playingTime;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public URL getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(URL thumbnail) {
		this.thumbnail = thumbnail;
	}

	public URL getImage() {
		return image;
	}

	public void setImage(URL image) {
		this.image = image;
	}

	public List<Podcast> getPodcastEpisode() {
		return podcastEpisode;
	}

	public void setPodcastEpisode(List<Podcast> podcastEpisode) {
		this.podcastEpisode = podcastEpisode;
	}

	public List<Honor> getHonor() {
		return honor;
	}

	public void setHonor(List<Honor> honor) {
		this.honor = honor;
	}

	public List<Publisher> getPublisher() {
		return publisher;
	}

	public void setPublisher(List<Publisher> publisher) {
		this.publisher = publisher;
	}

	public List<Family> getFamily() {
		return family;
	}

	public void setFamily(List<Family> family) {
		this.family = family;
	}

	public List<VideoGame> getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(List<VideoGame> videoGame) {
		this.videoGame = videoGame;
	}

	public List<Expansion> getExpansion() {
		return expansion;
	}

	public void setExpansion(List<Expansion> expansion) {
		this.expansion = expansion;
	}

	public List<Accessory> getAccessory() {
		return accessory;
	}

	public void setAccessory(List<Accessory> accessory) {
		this.accessory = accessory;
	}

	public List<Mechanic> getMechanic() {
		return mechanic;
	}

	public void setMechanic(List<Mechanic> mechanic) {
		this.mechanic = mechanic;
	}

	public List<Version> getVersion() {
		return version;
	}

	public void setVersion(List<Version> version) {
		this.version = version;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public List<Artist> getArtist() {
		return artist;
	}

	public void setArtist(List<Artist> artist) {
		this.artist = artist;
	}

	public List<Designer> getDesigner() {
		return designer;
	}

	public void setDesigner(List<Designer> designer) {
		this.designer = designer;
	}

	public List<Domain> getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(List<Domain> subdomain) {
		this.subdomain = subdomain;
	}

	public List<Poll> getPoll() {
		return poll;
	}

	public void setPoll(List<Poll> poll) {
		this.poll = poll;
	}

	public Statistics getStatistics() {
		return statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}
}
