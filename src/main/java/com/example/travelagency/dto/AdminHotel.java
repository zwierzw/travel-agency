package com.example.travelagency.dto;

import com.example.travelagency.entity.City;
import com.example.travelagency.entity.Hotel;

import java.util.List;

public interface AdminHotel {

    void addHotel(String name, int stars, String description, City city);
    void removeHotel(String name);
    Hotel findHotel(String name);
    List<Hotel> findAllHotels();
}
