package com.example.travelagency.service;

import com.example.travelagency.dto.AdminContinent;
import com.example.travelagency.dto.AdminHotel;
import com.example.travelagency.entity.*;
import com.example.travelagency.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService implements AdminHotel {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public void addHotel(String name, int stars, String description, City city) {
        final Hotel hotel = new Hotel(name, stars, description, city);
        hotelRepository.save(hotel);
    }

    @Override
    public void removeHotel(String name) {
        Hotel hotel = hotelRepository.findByName();
        hotelRepository.delete(hotel);

    }
}
