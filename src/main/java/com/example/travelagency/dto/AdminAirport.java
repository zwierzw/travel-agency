package com.example.travelagency.dto;

import com.example.travelagency.entity.City;

public interface AdminAirport {

    void addAirport (String name, City city);
    void removeAirport (String name, City city);
}
