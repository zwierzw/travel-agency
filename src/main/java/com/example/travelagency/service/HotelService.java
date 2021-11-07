package com.example.travelagency.service;

import com.example.travelagency.dto.AdminContinent;
import com.example.travelagency.dto.AdminHotel;
import com.example.travelagency.entity.*;
import com.example.travelagency.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
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
        hotelRepository.deleteByName(name);
    }

    @Override
    public Hotel findHotel (String name){
        return hotelRepository.findByName(name);
    }

    @Override
    public List<Hotel> findAllHotels(){
        return hotelRepository.findAll();
    }
}
