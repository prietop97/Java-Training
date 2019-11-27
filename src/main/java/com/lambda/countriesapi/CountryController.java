package com.lambda.countriesapi;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")

///names/size/{number}
//return the countries alphabetically that have a name equal to or longer than the given length
public class CountryController {
    @GetMapping(value = "/all", produces = {"application/json"})
    public ResponseEntity<?> getAllCountries(){
        CountriesApiApplication.countryArrayList.countryList.sort((a1,a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        return new ResponseEntity<>(CountriesApiApplication.countryArrayList.countryList, HttpStatus.OK);
    }

    @GetMapping(value = "/start/{letter}", produces = {"application/json"})
    public ResponseEntity<?> getCountryByFirstLetter(@PathVariable char letter){
        ArrayList<Country> rtnCountries = CountriesApiApplication.countryArrayList.findCountries(c -> c.getName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        rtnCountries.sort((c1,c2)->c1.getName().compareToIgnoreCase(c2.getName()));
        return new ResponseEntity<>(rtnCountries,HttpStatus.OK);
    }

    @GetMapping(value = "/size/{number}",produces = {"application/json"})
    public ResponseEntity<?> findByNameSize(@PathVariable int number){
        ArrayList<Country> rtnCountries = CountriesApiApplication.countryArrayList.findCountries(c -> c.getName().length() >= number);
        rtnCountries.sort((c1,c2)->c1.getName().compareToIgnoreCase(c2.getName()));
        return new ResponseEntity<>(rtnCountries,HttpStatus.OK);
    }
}




