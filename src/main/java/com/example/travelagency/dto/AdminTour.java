package com.example.travelagency.dto;

import com.example.travelagency.entity.*;

import java.util.Date;

public interface AdminTour {
    void addTour (String name,City departureCity, Airport departureAirport, City arrivalCity, Airport arrivalAirport,
                  Hotel arrivalHotel, Date departureDate, Date arrivalDate, int numberOfTourDays, Type typoOfTour,
                  double priceForAdult, double priceForChild, boolean isPromoted, int allPlacesForAdults,
                  int allPlacesForChildren);
}
