package com.example.travelagency.controller;

import com.example.travelagency.dto.*;
import com.example.travelagency.entity.*;
import com.example.travelagency.service.*;
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
    private final CityService cityService;
    private final AirportService airportService;
    private final HotelService hotelService;

    /*to jest połączenie internet - admin service dla metody addContinent
    - treść po @GetMapping("/BLABLABLA") to jest właśnie ENDPOINT, którym wystawiamy na jakiś URL nasze dane, z którymi
    połączy się Mateusz
    */


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

    @GetMapping("/listAllContinents")
    public ResponseEntity<ContinentListDto> listAllContinents(){
        ContinentListDto continentListDto = new ContinentListDto();
        continentListDto.setContinentList(continentService.findAllContinents());
        return new ResponseEntity<>(continentListDto, HttpStatus.OK);
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

    @GetMapping("/listAllCountries")
    public ResponseEntity<CountryListDto> listAllCountries(){
        CountryListDto countryListDto = new CountryListDto();
        countryListDto.setCountryList(countryService.findAllCountries());
        return new ResponseEntity<>(countryListDto, HttpStatus.OK);
    }


    @PostMapping("/addCity")
    public ResponseEntity<City> addCity (@RequestBody CityDto newCity) {
        cityService.addCity(newCity.getName(), countryService.findCountry(newCity.getCountry()));
        City addedCity = cityService.findCity(newCity.getName());
        if (addedCity == null) {
            throw new IllegalStateException();
        } else {
            return new ResponseEntity<>(addedCity, HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/removeCity")
    public ResponseEntity<Void> removeCity (@RequestBody CityDto newCity) {
        cityService.removeCity(newCity.getName());
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/findCity")
    public ResponseEntity<City> findCity (@RequestParam String name){
        City foundCity = cityService.findCity(name);
        if (foundCity == null) {
            throw new NullPointerException();
        } else {
            return new ResponseEntity<>(foundCity, HttpStatus.OK);
        }
    }

    @GetMapping("/listAllCities")
    public ResponseEntity<CityListDto> listAllCities(){
        CityListDto cityListDto = new CityListDto();
        cityListDto.setCityList(cityService.findAllCities());
        return new ResponseEntity<>(cityListDto, HttpStatus.OK);
    }


    @PostMapping("/addHotel")
    public ResponseEntity<Hotel> addHotel (@RequestBody HotelDto newHotel) {
        hotelService.addHotel(newHotel.getName(), newHotel.getStars(), newHotel.getDescription(),
                cityService.findCity(newHotel.getCity()));
        Hotel addedHotel = hotelService.findHotel(newHotel.getName());
        if (addedHotel == null) {
            throw new IllegalStateException();
        } else {
            return new ResponseEntity<>(addedHotel, HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/removeHotel")
    public ResponseEntity<Void> removeHotel (@RequestBody HotelDto newHotel) {
        hotelService.removeHotel(newHotel.getName());
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/findHotel")
    public ResponseEntity<Hotel> findHotel (@RequestParam String name){
        Hotel foundHotel = hotelService.findHotel(name);
        if (foundHotel == null) {
            throw new NullPointerException();
        } else {
            return new ResponseEntity<>(foundHotel, HttpStatus.OK);
        }
    }

    @GetMapping("/listAllHotels")
    public ResponseEntity<HotelListDto> listAllHotels(){
        HotelListDto hotelListDto = new HotelListDto();
        hotelListDto.setHotelList(hotelService.findAllHotels());
        return new ResponseEntity<>(hotelListDto, HttpStatus.OK);
    }

    @PostMapping("/addAirport")
    public ResponseEntity<Airport> addAirport (@RequestBody AirportDto newAirport) {
        airportService.addAirport(newAirport.getName(), cityService.findCity(newAirport.getCity()));
        Airport addedAirport = airportService.findAirport(newAirport.getName());
        if (addedAirport == null) {
            throw new IllegalStateException();
        } else {
            return new ResponseEntity<>(addedAirport, HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/removeAirport")
    public ResponseEntity<Void> removeAirport (@RequestBody AirportDto newAirport) {
        airportService.removeAirport(newAirport.getName());
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/findAirport")
    public ResponseEntity<Airport> findAirport (@RequestParam String name){
        Airport foundAirport = airportService.findAirport(name);
        if (foundAirport == null) {
            throw new NullPointerException();
        } else {
            return new ResponseEntity<>(foundAirport, HttpStatus.OK);
        }
    }

    @GetMapping("/listAllAirports")
    public ResponseEntity<AirportListDto> listAllAirports(){
        AirportListDto airportListDto = new AirportListDto();
        airportListDto.setAirportList(airportService.findAllAirports());
        return new ResponseEntity<>(airportListDto, HttpStatus.OK);
    }

}
