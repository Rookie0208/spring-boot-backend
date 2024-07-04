package com.blackcoffer.api.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcoffer.api.model.Data;
import com.blackcoffer.api.repository.ApiDTO;
@Service
public class ApiService {
     @Autowired
    private ApiDTO apiDto;
    String line="";


    public void saveApiApplicationData(){


        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Data.csv"))) {

            // Skip the header line if present
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                // Ensure the data array has the expected number of elements
                if (data.length < 21) {
                    System.err.println("Skipping incomplete line: " + line);
                    continue;
                }

                Data v = new Data();
                v.setEnd_year(data[0]);
                v.setCitylng(data[1]);
                v.setCitylat(data[2]);
                v.setIntensity(data[3]);
                v.setSector(data[4]);
                v.setTopic(data[5]);
                v.setInsight(data[6]);
                v.setSwot(data[7]);
                v.setUrl(data[8]);
                v.setRegion(data[9]);
                v.setStart_year(data[10]);
                v.setImpact(data[11]);
                v.setAdded(data[12]);
                v.setPublished(data[13]);
                v.setCity(data[14]);
                v.setCountry(data[15]);
                v.setRelevance(data[16]);
                v.setPestle(data[17]);
                v.setSource(data[18]);
                v.setTitle(data[19]);
                v.setLikelihood(data[20]);
                apiDto.save(v);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // for all data
    public List<Data> getAllData() {
        return apiDto.findAll();
    }

    // for intensity
    public List<Data>getByIntensity(String intensity)
    {
        List<Data>list=apiDto.findByIntensity(intensity);
        return list;
    }

    // for Likelihood
    public List<Data>getByLikelihood(String likelihood)
    {
        List<Data>list=apiDto.findByLikelihood(likelihood);
        return list;
    }

    // for Relevance
    public List<Data>getByRelevance(String relevance)
    {
        List<Data>list=apiDto.findByRelevance(relevance);
        return list;
    }

    //for Country
    public List<Data>getByCountry(String country)
    {
        List<Data>list=apiDto.findByCountry(country);
        return list;
    }

    // for Topics
    public List<Data>getByTopic(String topics)
    {
        List<Data>list=apiDto.findByTopic(topics);
        return list;
    }

    //for Region
    public List<Data>getByRegion(String region)
    {
        List<Data>list=apiDto.findByRegion(region);
        return list;
    }

    //for City
    public List<Data>getByCity(String city)
    {
        List<Data>list=apiDto.findByCity(city);
        return list;
    }

    // for end_year
    public List<Data>getByEnd_year(String end_year)
    {
        List<Data>list=apiDto.findByEnd_year(end_year);
        return list;
    }

    // for start_year
    public List<Data>getByStart_year(String start_year)
    {
        List<Data>list=apiDto.findByStart_year(start_year);
        return list;
    }

    public List<Data> getDataByRegion(String region) {
        return apiDto.findByRegion(region);
    }

    public List<Data> getDataByYear(String startYear, String endYear) {
        // Assuming you want to get data between startYear and endYear
        List<Data> dataByStartYear = apiDto.findByStart_year(startYear);
        List<Data> dataByEndYear = apiDto.findByEnd_year(endYear);
        
        // You might need to merge or process these lists depending on your requirements
        dataByStartYear.addAll(dataByEndYear); // This is a simple example, adjust as needed
        return dataByStartYear;
    }
}
