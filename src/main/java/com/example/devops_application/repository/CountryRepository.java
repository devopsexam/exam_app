package com.example.devops_application.repository;

import com.example.devops_application.entity.Country;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@AutoConfigureTestDatabase
public interface CountryRepository extends CrudRepository<Country, String> {
}
