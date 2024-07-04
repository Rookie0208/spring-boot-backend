package com.blackcoffer.api.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blackcoffer.api.model.Data;

public interface  ApiDTO extends JpaRepository<Data, Integer> {
    // for intensity
    public List<Data> findByIntensity(String intensity);

    //for Likelihood
    public List<Data>findByLikelihood(String likelihood);

      // for Relevance
    public List<Data>findByRelevance(String relevance);

    // for Country
    public List<Data>findByCountry(String country);

    // for Topic
    public List<Data>findByTopic(String topic);

    // for Region
    public List<Data>findByRegion(String region);

    //for  City
    public List<Data>findByCity(String city);

    

    //for end_year
    @Query("from Data v where v.end_year=:year")
    public List<Data>findByEnd_year(@Param("year") String end_year);

    // for start_year
    @Query("from Data v where v.start_year=:year")
    public List<Data>findByStart_year(@Param("year") String start_year);
}
