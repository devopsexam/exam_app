package com.example.devops_application.controller;

import com.example.devops_application.entity.Country;
import com.example.devops_application.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/country/{id}")
    public Country getBook(@PathVariable String Id) {
        return countryService.getCountry(Id);
    }

    @PostMapping("/countries")
    public void addBook(@RequestBody Country country) {
        countryService.addCountry(country);
    }

    @PutMapping("/country/{id}")
    public void updateCountry(@PathVariable String id, @RequestBody Country country) {
        countryService.updateCountry(id, country);
    }

    @DeleteMapping("/country/{id}")
    public void deleteCountry(@PathVariable String id) {
        countryService.deleteCountry(id);
    }
}