package com.example.travelagency.service;

import com.example.travelagency.dto.AdminAirport;
import com.example.travelagency.entity.Airport;
import com.example.travelagency.entity.City;
import com.example.travelagency.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AirportService implements AdminAirport {

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public void addAirport(String name, City city) {
        final Airport airport = new Airport(name, city);
        airportRepository.save(airport);
    }

    @Override
    public void removeAirport(String name) {
       airportRepository.deleteByName(name);
    }

    @Override
    public Airport findAirport (String name){
        return airportRepository.findByName(name);
    }

    @Override
    public List<Airport> findAllAirports() {
        return airportRepository.findAll();
    }
}
