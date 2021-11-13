package com.example.travelagency.service;

import com.example.travelagency.dto.*;
import com.example.travelagency.entity.*;
import com.example.travelagency.repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class AdminService implements AdminTranslator, AdminTour {

    // nie jestem pewien czy te autowired będą potrzebne, ale możliwe że tak, na wszelki wypadek je tu przekopiowałem
    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private ContinentRepository continentRepository;

    @Autowired
    private CountryRepository countryRepository;


    @Autowired
    private ContinentService continentService;

    @Autowired
    private AirportService airportService;

    @Autowired
    private CityService cityService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private TourService tourService;


    @Override
    public void addAirportTranslate(String name, String city) {
        City city1 = cityRepository.findByName(city);
        airportService.addAirport(name, city1);
    }

    @Override
    public void removeAirportTranslate(String name, String city) {
        City city2 = cityRepository.findByName(city);
        airportService.removeAirport(name);
    }

    @Override
    public void addCityTranslate(String name, String country) {
        Country country1 = countryRepository.findByName(country);
        cityService.addCity(name, country1);
    }

    @Override
    public void removeCityTranslate(String name) {
        cityService.removeCity(name);
    }

    @Override
    public void addContinentTranslate(String name) {
        continentService.addContinent(name);
    }

    @Override
    public void removeContinentTranslate(String name) {
        continentService.removeContinent(name);
    }

    @Override
    public void addCountryTranslate(String name, String continent) {
        Continent continent1 = continentRepository.findByName(continent);
        countryService.addCountry(name, continent1);
    }

    @Override
    public void removeCountryTranslate(String name) {
        countryService.removeCountry(name);
    }

    @Override
    public void addHotelTranslate(String name, int stars, String description, String city) {
        City city3 = cityRepository.findByName(city);
        hotelService.addHotel(name, stars, description, city3);
    }

    @Override
    public void removeHotelTranslate(String name) {
        hotelService.removeHotel(name);
    }

    //    TODO czy rozdzielać metodę addTour w obrębie TourService
    @Override
    public void addTour(String name, String departureCity, String departureAirport,
                        String arrivalCity, String arrivalAirport,
                        String arrivalHotel, Date departureDate,
                        Date arrivalDate, int numberOfTourDays, Type typoOfTour,
                        double priceForAdult, double priceForChild,
                        boolean isPromoted, int allPlacesForAdults,
                        int allPlacesForChildren) {
    }

    @Override
    public void removeTour(String name) {
        tourService.removeTour(name);
    }

    @Override
    public Tour findTour(String name) {
        return null;
    }

    @Override
    public List<Tour> findAllTours() {
        return null;
    }


}
