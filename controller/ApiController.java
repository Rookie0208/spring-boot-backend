package com.blackcoffer.api.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blackcoffer.api.model.Data;
import com.blackcoffer.api.service.ApiService;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ApiService apiService;
    
    @GetMapping("/data")
    public List<Data> getAllData() {
        return apiService.getAllData();
    }
    

    //for add all data in database
    @RequestMapping(path = "setdata")
    public void setDataInDB(){
        apiService.saveApiApplicationData();
    }

    // for find intensity with help of ID
    @GetMapping(path = "intensity/{id}")
    public ResponseEntity<List<Data>> getByIntensityController(@PathVariable("id")String intensity){

        List<Data>list=apiService.getByIntensity(intensity);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    //for find Likelihood with help of id
    @GetMapping(path = "likelihood/{id}")
    public ResponseEntity<List<Data>>getByLikelihoodController(@PathVariable("id")String likelihood)
    {
        List<Data>list=apiService.getByLikelihood(likelihood);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/asia")
    public ResponseEntity<List<Data>> getAsiaData() {
        List<Data> data = apiService.getDataByRegion("asia");
        return ResponseEntity.ok(data);
    }

    @GetMapping("/america")
    public ResponseEntity<List<Data>> getAmericaData() {
        List<Data> data = apiService.getDataByRegion("america");
        return ResponseEntity.ok(data);
    }

    @GetMapping("/africa")
    public ResponseEntity<List<Data>> getAfricaData() {
        List<Data> data = apiService.getDataByRegion("africa");
        return ResponseEntity.ok(data);
    }

    @GetMapping("/europe")
    public ResponseEntity<List<Data>> getEuropeData() {
        List<Data> data = apiService.getDataByRegion("europe");
        return ResponseEntity.ok(data);
    }

    @GetMapping("/world")
    public ResponseEntity<List<Data>> getWorldData() {
        List<Data> data = apiService.getDataByRegion("world");
        return ResponseEntity.ok(data);
    }
    @GetMapping("/years")
    public ResponseEntity<List<Data>> getDataByYears(
        @RequestParam String startYear, 
        @RequestParam String endYear) {
        List<Data> data = apiService.getDataByYear(startYear, endYear);
        return ResponseEntity.ok(data);
    }
}
