package org.kerf.bgg.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Rating {
	@XmlAttribute
	String date;
	
	@XmlElement(name="usersrated")
	Integer usersRated;
	
	@XmlElement
	Integer average;
	
	@XmlElement(name="bayesaverage")
	Integer bayesianAverage;
	
	@XmlElementWrapper(name="ranks")
	@XmlElement(name="rank")
	List<Rank> ranks;
	
	@XmlElement(name="stddev")
	Integer standardDeviation;
	
	@XmlElement
	Integer median;
	
	@XmlElement
	Integer owned;
	
	@XmlElement
	Integer trading;
	
	@XmlElement
	Integer wanting;
	
	@XmlElement
	Integer wishing;
	
	@XmlElement(name="numcomments")
	Integer numComments;
	
	@XmlElement(name="numweights")
	Integer numWeights;
	
	@XmlElement(name="averageweight")
	Integer averageWeight;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getUsersRated() {
		return usersRated;
	}

	public void setUsersRated(Integer usersRated) {
		this.usersRated = usersRated;
	}

	public Integer getAverage() {
		return average;
	}

	public void setAverage(Integer average) {
		this.average = average;
	}

	public Integer getBayesianAverage() {
		return bayesianAverage;
	}

	public void setBayesianAverage(Integer bayesianAverage) {
		this.bayesianAverage = bayesianAverage;
	}

	public List<Rank> getRanks() {
		return ranks;
	}

	public void setRanks(List<Rank> ranks) {
		this.ranks = ranks;
	}

	public Integer getStandardDeviation() {
		return standardDeviation;
	}

	public void setStandardDeviation(Integer standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

	public Integer getMedian() {
		return median;
	}

	public void setMedian(Integer median) {
		this.median = median;
	}

	public Integer getOwned() {
		return owned;
	}

	public void setOwned(Integer owned) {
		this.owned = owned;
	}

	public Integer getTrading() {
		return trading;
	}

	public void setTrading(Integer trading) {
		this.trading = trading;
	}

	public Integer getWanting() {
		return wanting;
	}

	public void setWanting(Integer wanting) {
		this.wanting = wanting;
	}

	public Integer getWishing() {
		return wishing;
	}

	public void setWishing(Integer wishing) {
		this.wishing = wishing;
	}

	public Integer getNumComments() {
		return numComments;
	}

	public void setNumComments(Integer numComments) {
		this.numComments = numComments;
	}

	public Integer getNumWeights() {
		return numWeights;
	}

	public void setNumWeights(Integer numWeights) {
		this.numWeights = numWeights;
	}

	public Integer getAverageWeight() {
		return averageWeight;
	}

	public void setAverageWeight(Integer averageWeight) {
		this.averageWeight = averageWeight;
	}
	
}
