package com.example.travelagency.dto;

import com.example.travelagency.entity.City;
import com.example.travelagency.entity.Country;

public interface AdminCity {

    void addCity (String name, Country country);
    void removeCity (String name);
    City findCity(String name);
}
