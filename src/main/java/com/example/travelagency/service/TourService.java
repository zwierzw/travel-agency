package com.example.travelagency.service;

import com.example.travelagency.dto.AdminTour;
import com.example.travelagency.entity.*;
import com.example.travelagency.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TourService implements AdminTour {

    @Autowired
    private TourRepository tourRepository;


    @Override
    public void addTour(String name, City departureCity, Airport departureAirport, City arrivalCity, Airport arrivalAirport,
                        Hotel arrivalHotel, Date departureDate, Date arrivalDate, int numberOfTourDays, Type typoOfTour,
                        double priceForAdult, double priceForChild, boolean isPromoted, int allPlacesForAdults,
                        int allPlacesForChildren) {
        final Tour tour = new Tour(name, departureCity, departureAirport, arrivalCity,arrivalAirport,arrivalHotel,departureDate,
                arrivalDate,numberOfTourDays,typoOfTour,priceForAdult,priceForChild,isPromoted,allPlacesForAdults,allPlacesForChildren);

        tourRepository.save(tour);
    }
}
