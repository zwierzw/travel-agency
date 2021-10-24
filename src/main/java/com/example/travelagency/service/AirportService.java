package com.example.travelagency.service;

import com.example.travelagency.dto.AdminAirport;
import com.example.travelagency.entity.Airport;
import com.example.travelagency.entity.City;
import com.example.travelagency.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService implements AdminAirport {

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public void addAirport(String name, City city) {
        final Airport airport = new Airport(name, city);
        airportRepository.save(airport);
    }

    @Override
    public void removeAirport(String name, City city) {
        Airport airport = airportRepository.findByName(name);
        airportRepository.delete(airport);
    }
}
