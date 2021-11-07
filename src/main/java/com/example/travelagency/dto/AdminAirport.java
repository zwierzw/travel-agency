package com.example.travelagency.dto;

import com.example.travelagency.entity.Airport;
import com.example.travelagency.entity.City;

import java.util.List;

public interface AdminAirport {

    void addAirport (String name, City city);
    void removeAirport (String name);
    Airport findAirport (String name);
    List<Airport> findAllAirports();
}
