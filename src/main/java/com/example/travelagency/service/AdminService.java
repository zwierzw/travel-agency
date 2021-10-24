package com.example.travelagency.service;

import com.example.travelagency.dto.*;
import com.example.travelagency.entity.*;
import com.example.travelagency.repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class AdminService implements AdminTour, AdminContinent, AdminCountry, AdminCity, AdminAirport, AdminHotel {

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




    @Override
    public void addAirport(String name, City city) {

    }

    @Override
    public void removeAirport(String name, City city) {

    }

    @Override
    public void addCity(String name, Country country) {

    }

    @Override
    public void removeCity(String name) {

    }

    @Override
    public void addContinent(String name) { //to jest połączenie metody addContinent z bazą
        //tu chcesz dodać kontynent do bazy danych, czyli chyba musisz napisać Query SQLowe?
    }

    @Override
    public void removeContinent(String name) {

    }

    @Override
    public void addCountry(String name, Continent continent) {

    }

    @Override
    public void removeCountry(String name) {

    }

    @Override
    public void addHotel(String name, int stars, String description, City city) {

    }

    @Override
    public void removeHotel(String name) {

    }

    @Override
    public void addTour(String name, String departureCity, String departureAirport, String arrivalCity, String arrivalAirport, String arrivalHotel, Date departureDate, Date arrivalDate, int numberOfTourDays, Type typoOfTour, double priceForAdult, double priceForChild, boolean isPromoted, int allPlacesForAdults, int allPlacesForChildren) {

    }
}
