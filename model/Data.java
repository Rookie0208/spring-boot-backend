package com.blackcoffer.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Data {
    @Id
    @GeneratedValue
    private Long id;

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


    // // Getters and setters

    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getEndYear() {
    //     return end_year;
    // }

    // public void setYear(String year) {
    //     this.end_year = year;
    // }

    // public String getTopic() {
    //     return topic;
    // }

    // public void setTopic(String topic) {
    //     this.topic = topic;
    // }

    // public String getRegion() {
    //     return region;
    // }

    // public void setRegion(String region) {
    //     this.region = region;
    // }

    // public String getCountry() {
    //     return country;
    // }

    // public void setCountry(String country) {
    //     this.country = country;
    // }

    // public String getCity() {
    //     return citylng;
    // }

    // public void setCity(String citylng) {
    //     this.citylng = citylng;
    // }

    // public int getIntensity() {
    //     return intensity;
    // }

    // public void setIntensity(int intensity) {
    //     this.intensity = intensity;
    // }

    // public int getLikelihood() {
    //     return likelihood;
    // }

    // public void setLikelihood(int likelihood) {
    //     this.likelihood = likelihood;
    // }

    // public int getRelevance() {
    //     return relevance;
    // }

    // public void setRelevance(int relevance) {
    //     this.relevance = relevance;
    // }
}
