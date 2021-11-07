package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tour")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tour {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "departure_city")
    private City departureCity;

    @ManyToOne
    @JoinColumn(name = "departure_airport")
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_city")
    private City arrivalCity;

    @ManyToOne
    @JoinColumn(name = "arrival_airport")
    private Airport arrivalAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_hotel")
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

    public Tour(String name, City departureCity, Airport departureAirport, City arrivalCity,
                Airport arrivalAirport, Hotel arrivalHotel, Date departureDate, Date arrivalDate, int numberOfTourDays,
                Type typeOfTour, double priceForAdult, double priceForChild, boolean isPromoted, int allPlacesForAdults,
                int allPlacesForChildren) {
        this.name = name;
        this.departureCity = departureCity;
        this.departureAirport = departureAirport;
        this.arrivalCity = arrivalCity;
        this.arrivalAirport = arrivalAirport;
        this.arrivalHotel = arrivalHotel;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.numberOfTourDays = numberOfTourDays;
        this.typeOfTour = typeOfTour;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.isPromoted = isPromoted;
        this.allPlacesForAdults = allPlacesForAdults;
        this.allPlacesForChildren = allPlacesForChildren;
    }
}
