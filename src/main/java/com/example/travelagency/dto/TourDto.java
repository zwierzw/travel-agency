package com.example.travelagency.dto;


import com.example.travelagency.entity.Airport;
import com.example.travelagency.entity.City;
import com.example.travelagency.entity.Hotel;
import com.example.travelagency.entity.Type;
import lombok.Data;

import java.util.Date;

@Data
public class TourDto {
    private String name;
    private String departureCity;
    private String departureAirport;
    private String arrivalCity;
    private String arrivalAirport;
    private String arrivalHotel;
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
