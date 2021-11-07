package com.example.travelagency.controller;

import com.example.travelagency.dto.ContinentDto;
import com.example.travelagency.dto.CountryDto;
import com.example.travelagency.entity.Continent;
import com.example.travelagency.entity.Country;
import com.example.travelagency.service.AdminService;
import com.example.travelagency.service.ContinentService;
import com.example.travelagency.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/travel-agency")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") //Żeby skomunikować frontend z backendem
public class adminController {

    private final ContinentService continentService;
    private final CountryService countryService;

    /*to jest połączenie internet - admin service dla metody addContinent
    - treść po @GetMapping("/BLABLABLA") to jest właśnie ENDPOINT, którym wystawiamy na jakiś URL nasze dane, z którymi
    połączy się Mateusz
    */
//    @GetMapping("/")
//    public void addContinent(String name) {
//        adminService.addContinentTranslate(name);
//    }

    @PostMapping("/addContinent")
    public ResponseEntity<Continent> addContinent(@RequestBody ContinentDto newContinent) {
        continentService.addContinent(newContinent.getName());
        Continent addedContinent = continentService.findContinent(newContinent.getName());
        if (addedContinent == null) {
            throw new IllegalStateException();
        } else {
            return new ResponseEntity<>(addedContinent, HttpStatus.CREATED);
        }
    }


    @DeleteMapping("/removeContinent")
    public ResponseEntity<Void> removeContinent(@RequestBody ContinentDto newContinent){
        continentService.removeContinent(newContinent.getName());
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    
    @GetMapping("/findContinent")
    public ResponseEntity<Continent> findContinent(@RequestParam String name){
       Continent foundContinent = continentService.findContinent(name);
        if (foundContinent == null) {
            throw new NullPointerException();
        } else {
            return new ResponseEntity<>(foundContinent, HttpStatus.OK);
        }
    }
    
    
    @PostMapping("/addCountry")
    public ResponseEntity<Country> addCountry(@RequestBody CountryDto newCountry) {
        countryService.addCountry(newCountry.getName(), continentService.findContinent(newCountry.getContinent()));
        Country addedCountry = countryService.findCountry(newCountry.getName());
        if (addedCountry == null) {
            throw new IllegalStateException();
        } else {
            return new ResponseEntity<>(addedCountry, HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/removeCountry")
    public ResponseEntity<Void> removeCountry(@RequestBody CountryDto newCountry) {
        countryService.removeCountry(newCountry.getName());
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/findCountry")
    public ResponseEntity<Country> findCountry(@RequestParam String name){
        Country foundCountry = countryService.findCountry(name);
        if (foundCountry == null) {
            throw new NullPointerException();
        } else {
            return new ResponseEntity<>(foundCountry, HttpStatus.OK);
        }
    }
}
