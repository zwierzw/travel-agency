package com.example.travelagency.dto;

import com.example.travelagency.entity.*;

import java.util.Date;
import java.util.List;

public interface AdminTour {


    void addTour (String name, String departureCity, String departureAirport, String arrivalCity, String arrivalAirport,
                  String arrivalHotel, Date departureDate, Date arrivalDate, int numberOfTourDays, Type typoOfTour,
                  double priceForAdult, double priceForChild, boolean isPromoted, int allPlacesForAdults,
                  int allPlacesForChildren);

    void removeTour (String name);
    Tour findTour (String name);
    List<Tour> findAllTours();
}
