/**
   Copyright 2013 Rob Heiser

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */

package org.kerf.bgg.jaxb;

import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Rating implements Iterable<Rank> {
   @XmlAttribute
   String date;

   @XmlElement(name = "usersrated")
   Integer usersRated;

   @XmlElement
   Integer average;

   @XmlElement(name = "bayesaverage")
   Integer bayesianAverage;

   @XmlElementWrapper(name = "ranks")
   @XmlElement(name = "rank")
   List<Rank> ranks;

   @XmlElement(name = "stddev")
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

   @XmlElement(name = "numcomments")
   Integer numComments;

   @XmlElement(name = "numweights")
   Integer numWeights;

   @XmlElement(name = "averageweight")
   Integer averageWeight;

   public String toString() {
      String retval = "RATING: ";

      retval += " | Date: " + getDate();
      retval += " | # Users rated: " + getUsersRated();
      retval += " | Avg.: " + getAverage();
      retval += " | Bayesian Avg.: " + getBayesianAverage();
      retval += " | Std. Dev.: " + getStandardDeviation();
      retval += " | Median: " + getMedian();
      retval += " | # Owned: " + getOwned();
      retval += " | # Trading: " + getTrading();
      retval += " | # Wanting: " + getWanting();
      retval += " | # Wishing: " + getWishing();
      retval += " | # Comments: " + getNumComments();
      retval += " | # Weights: " + getNumWeights();
      retval += " | Avg. Weight: " + getAverageWeight();

      for (Rank rank : ranks) {
         retval += rank;
      }
      return retval;
   }

   public Integer getAverage() {
      return average;
   }

   public Integer getAverageWeight() {
      return averageWeight;
   }

   public Integer getBayesianAverage() {
      return bayesianAverage;
   }

   public String getDate() {
      return date;
   }

   public Integer getMedian() {
      return median;
   }

   public Integer getNumComments() {
      return numComments;
   }

   public Integer getNumWeights() {
      return numWeights;
   }

   public Integer getOwned() {
      return owned;
   }

   public List<Rank> getRanks() {
      return ranks;
   }

   public Integer getStandardDeviation() {
      return standardDeviation;
   }

   public Integer getTrading() {
      return trading;
   }

   public Integer getUsersRated() {
      return usersRated;
   }

   public Integer getWanting() {
      return wanting;
   }

   public Integer getWishing() {
      return wishing;
   }

   public void setAverage(Integer average) {
      this.average = average;
   }

   public void setAverageWeight(Integer averageWeight) {
      this.averageWeight = averageWeight;
   }

   public void setBayesianAverage(Integer bayesianAverage) {
      this.bayesianAverage = bayesianAverage;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public void setMedian(Integer median) {
      this.median = median;
   }

   public void setNumComments(Integer numComments) {
      this.numComments = numComments;
   }

   public void setNumWeights(Integer numWeights) {
      this.numWeights = numWeights;
   }

   public void setOwned(Integer owned) {
      this.owned = owned;
   }

   public void setRanks(List<Rank> ranks) {
      this.ranks = ranks;
   }

   public void setStandardDeviation(Integer standardDeviation) {
      this.standardDeviation = standardDeviation;
   }

   public void setTrading(Integer trading) {
      this.trading = trading;
   }

   public void setUsersRated(Integer usersRated) {
      this.usersRated = usersRated;
   }

   public void setWanting(Integer wanting) {
      this.wanting = wanting;
   }

   public void setWishing(Integer wishing) {
      this.wishing = wishing;
   }

   public Iterator<Rank> iterator() {
      return ranks.iterator();
   }

}
