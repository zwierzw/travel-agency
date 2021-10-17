package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tour {
    private City departureCity;
    private Airport departureAirport;
    private City arrivalCity;
    private Airport arrivalAirport;
    private Hotel arrivalHotel;
    private Date departureDate;
    private Date arrivalDate;
    private int numberOfTourDays;
    private Type typeOfTour;
    private double priceForAdult;
    private double priceForChild;
    private boolean isPromoted;
    private int allPlacesForAdults;
    private int allPlacesForChildren;



}
