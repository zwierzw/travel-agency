package com.example.travelagency.dto;

import com.example.travelagency.entity.Tour;

import java.util.List;

public interface User {
     List<Tour> findTourByContinent(String continent);
     List<Tour> findTourByCountry(String country);
     List<Tour> findTourByCity (String city);
     List<Tour> finTourByAirport (String airport);
     List<Tour> findTourByHotel (String hotel);
}
