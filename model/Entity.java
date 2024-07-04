package com.backend.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection = "BlackCofferDB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entity {
    @Id
    private int id;

    private String end_year;
    private String citylng;
    private String citylat;
    private String intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;
    private String start_year;
    private String impact;
    private String added;
    private String published;
    private String city;
    private String country;
    private String relevance;
    private String pestle;
    private String source;
    private String title;
    private String likelihood;


    public void setSector(String sector) {
        this.sector = sector;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setSwot(String swot) {
        this.swot = swot;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }
    

    public void setImpact(String impact) {
        this.impact = impact;
    }
    public void setAdded(String added) {
        this.added = added;
    }
    public void setPublished(String published) {
        this.published = published;
    }

    public void setPestle(String pestle) {
        this.pestle = pestle;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // // Getters and setters

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCitylng() {
        return citylng;
    }
    public void setCitylng(String citylng) {
        this.citylng = citylng;
    }

    public String getCitylat() {
        return citylat;
    }
    public void setCitylat(String citylat) {
        this.citylat = citylat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndYear() {
        return end_year;
    }

    public void setEndYear(String year) {
        this.end_year = year;
    }

    public String getStartYear() {
        return start_year;
    }

    public void setStartYear(String year) {
        this.start_year = year;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(String likelihood) {
        this.likelihood = likelihood;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }
}
