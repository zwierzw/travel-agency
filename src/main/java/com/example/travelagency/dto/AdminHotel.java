package com.example.travelagency.dto;

import com.example.travelagency.entity.City;

public interface AdminHotel {

    void addHotel(String name, int stars, String description, City city);
    void removeHotel(String name);
}
