package com.lambda.countriesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;

@SpringBootApplication
public class CountriesApiApplication {

    static CountryList countryArrayList;
    public static void main(String[] args) {

        countryArrayList = new CountryList();
        System.out.println(countryArrayList);

        SpringApplication.run(CountriesApiApplication.class, args);
    }

}
