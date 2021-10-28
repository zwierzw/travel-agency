package com.example.travelagency.service;

import com.example.travelagency.dto.AdminTour;
import com.example.travelagency.entity.*;
import com.example.travelagency.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TourService implements AdminTour {

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private HotelRepository hotelRepository;

//TODO metoda addTour ma funkcjonalność translatora i dodawania do bazy, czy rozdzielać to?
    @Override
    public void addTour(String name, String departureCity, String departureAirport,
                        String arrivalCity, String arrivalAirport,
                        String arrivalHotel, Date departureDate,
                        Date arrivalDate, int numberOfTourDays, Type typoOfTour,
                        double priceForAdult, double priceForChild,
                        boolean isPromoted, int allPlacesForAdults,
                        int allPlacesForChildren) {
        City city = cityRepository.findByName(departureCity);
        Airport airport = airportRepository.findByName(departureAirport);
        City city2 = cityRepository.findByName(arrivalCity);
        Airport airport2 = airportRepository.findByName(arrivalAirport);
        Hotel hotel = hotelRepository.findByName(arrivalHotel);



        final Tour tour = new Tour(name, city, airport, city2,airport2,hotel,departureDate,
                arrivalDate,numberOfTourDays,typoOfTour,priceForAdult,priceForChild,isPromoted,allPlacesForAdults,allPlacesForChildren);

        tourRepository.save(tour);
    }
}
