package com.example.devops_application.controller;

import com.example.devops_application.entity.Country;
import com.example.devops_application.service.CountryService;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private MeterRegistry meterRegistry;

    public CountryController(MeterRegistry meterRegistry){
    }

    @Timed(description = "Time getting all countries")
    @GetMapping("/")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @Timed(description = "Time getting a single country")
    @GetMapping("/country/{id}")
    public Country getCountry(@PathVariable String Id) {
        return countryService.getCountry(Id);
    }

    @Timed(description = "Time adding a country")
    @PostMapping("/country")
    public ResponseEntity<Object> addCountry(@RequestBody Country country) {
        countryService.addCountry(country);
        return null;
    }

    @Timed(description = "Time updating a country")
    @PutMapping("/country/{id}")
    public void updateCountry(@PathVariable String id, @RequestBody Country country) {
        countryService.updateCountry(id, country);
    }

    @Timed(description = "Time deleting a country")
    @DeleteMapping("/country/{id}")
    public void deleteCountry(@PathVariable String id) {
        countryService.deleteCountry(id);
    }

    public void gaugeCountry(List<Country> country){
        Gauge.builder("country.countriesInQueue", country, Collection::size)
                .description("Number of countries")
                .register(meterRegistry);
    }
}