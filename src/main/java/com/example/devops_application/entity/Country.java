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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() { return countryName; }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", Country='" + countryName +
                ", Capital='" + countryCapital +
                '}';
    }
}
