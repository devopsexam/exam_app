package com.example.devops_application.service;

import com.example.devops_application.entity.Country;
import com.example.devops_application.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        List<Country> country = new ArrayList<>();
        countryRepository.findAll().forEach(country::add);
        return country;
    }

    public Country getCountry(String id) {
        return countryRepository.findById(id).orElseGet(Country::new);
    }

    public void addCountry(Country Norway) {
        countryRepository.save(Norway);
    }

    public void updateCountry(String id, Country Norway) {
        countryRepository.save(Norway);
    }

    public void deleteCountry(String id) {
        countryRepository.deleteById(id);
    }

}
