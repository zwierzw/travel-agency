package com.example.travelagency.service;

import com.example.travelagency.dto.Admin;
import com.example.travelagency.entity.*;
import com.example.travelagency.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements Admin {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public void add() {
        final Continent europa = new Continent("Europa");
        final Country polska = new Country("Polska", europa);
        final City warszawa = new City("Warszawa", polska);

        Hotel ibis = new Hotel("Ibis", 5, "Piękny hotel Ibis", warszawa);

        hotelRepository.save(ibis);
    }

    @Override
    public void modify() {

    }

    @Override
    public void show() {

    }

    @Override
    public void remove() {

    }


}
