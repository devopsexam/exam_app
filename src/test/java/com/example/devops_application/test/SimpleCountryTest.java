package com.example.devops_application.test;

import com.example.devops_application.entity.Country;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Test;

@Controller
@RunWith(SpringRunner.class)
public class SimpleCountryTest {

        //Very simple test to check if travis works as it should
        @Test
        public void testCreateCountry() {
                Country country = new Country();
                country.setCountryName("Norway");
                country.setCountryCapital("Oslo");

                Country country2 = new Country(2, "Germany", "Berlin");

                assertFalse(country.equals(country2));

        }
}