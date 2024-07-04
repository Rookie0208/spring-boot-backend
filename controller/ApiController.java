package com.backend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.api.model.Entity;
import com.backend.api.service.ApiService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8585")
public class ApiController {
    
    @Autowired
    private ApiService apiService;
    
    @GetMapping("/data")
    public ResponseEntity<List<Entity>> getAllData() {
        List<Entity> data = apiService.getAllData();
        return ResponseEntity.ok(data);
    }

    @RequestMapping(path = "/setdata")
    public ResponseEntity<Void> setDataInDB() {
        apiService.saveApiApplicationData();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/intensity/{id}")
    public ResponseEntity<List<Entity>> getByIntensityController(@PathVariable("id") String intensity) {
        List<Entity> data = apiService.getByIntensity(intensity);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/likelihood/{id}")
    public ResponseEntity<List<Entity>> getByLikelihoodController(@PathVariable("id") String likelihood) {
        List<Entity> data = apiService.getByLikelihood(likelihood);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/region/asia")
    public ResponseEntity<List<Entity>> getAsiaData() {
        List<Entity> data = apiService.getDataByRegion("asia");
        return ResponseEntity.ok(data);
    }

    @GetMapping("/region/america")
    public ResponseEntity<List<Entity>> getAmericaData() {
        List<Entity> data = apiService.getDataByRegion("america");
        return ResponseEntity.ok(data);
    }

    @GetMapping("/region/africa")
    public ResponseEntity<List<Entity>> getAfricaData() {
        List<Entity> data = apiService.getDataByRegion("africa");
        return ResponseEntity.ok(data);
    }

    @GetMapping("/region/europe")
    public ResponseEntity<List<Entity>> getEuropeData() {
        List<Entity> data = apiService.getDataByRegion("europe");
        return ResponseEntity.ok(data);
    }

    @GetMapping("/region/world")
    public ResponseEntity<List<Entity>> getWorldData() {
        List<Entity> data = apiService.getDataByRegion("world");
        return ResponseEntity.ok(data);
    }

    @GetMapping("/years")
    public ResponseEntity<List<Entity>> getDataByYears(
            @RequestParam String startYear,
            @RequestParam String endYear) {
        List<Entity> data = apiService.getDataByYear(startYear, endYear);
        return ResponseEntity.ok(data);
    }
}
