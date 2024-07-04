package com.backend.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.api.model.Entity;

public interface  ApiDTO extends MongoRepository<Entity, Integer>{
    // for intensity
    public List<Entity> findByIntensity(String intensity);

    //for Likelihood
    public List<Entity>findByLikelihood(String likelihood);

      // for Relevance
    public List<Entity>findByRelevance(String relevance);

    // for Country
    public List<Entity>findByCountry(String country);

    // for Topic
    public List<Entity>findByTopic(String topic);

    // for Region
    public List<Entity>findByRegion(String region);

    //for  City
    public List<Entity>findByCity(String city);

    

    //for end_year
    @Query("from Entity v where v.end_year=:year")
    public List<Entity>findByEnd_year(@Param("year") String end_year);

    // for start_year
    @Query("from Entity v where v.start_year=:year")
    public List<Entity>findByStart_year(@Param("year") String start_year);
}
