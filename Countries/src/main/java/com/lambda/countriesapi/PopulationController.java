package com.lambda.countriesapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController {
    @GetMapping(value = "/size/{people}", produces = {"application/json"})
    public ResponseEntity<?> getByPopulation(@PathVariable int people) {
        ArrayList<Country> response = CountriesApiApplication.countryArrayList.findCountries(c -> c.getPopulation() >= people);
        response.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/min", produces = {"application/json"})
    public ResponseEntity<?> getMinCountry() {
        ArrayList<Country> allCountries = CountriesApiApplication.countryArrayList.countryList;
        allCountries.sort((c1, c2) -> Integer.compare(c1.getPopulation(), c2.getPopulation()));
        return new ResponseEntity<>(allCountries.get(0), HttpStatus.OK);
    }

    @GetMapping(value = "/max", produces = {"application/json"})
    public ResponseEntity<?> getMaxCountry() {
        ArrayList<Country> allCountries = CountriesApiApplication.countryArrayList.countryList;
        allCountries.sort((c1, c2) -> Integer.compare(c2.getPopulation(), c1.getPopulation()));
        return new ResponseEntity<>(allCountries.get(0), HttpStatus.OK);
    }


}
