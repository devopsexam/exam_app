package com.example.devops_application.entity;

import javax.persistence.*;

@Entity
public class Country {

    @Id
    private Integer id;
    private String countryName;
    private String countryCapital;

    public Country() {
    }


    public Country(Integer id, String countryName, String countryCapital) {
        this.id = id;
        this.countryName = countryName;
        this.countryCapital = countryCapital;
    }

    public Integer getId() { return id; }


    public String getCountryName() { return countryName; }



    public String getCountryCapital() {
        return countryCapital;
    }

}
