package com.example.travelagency.service;

import com.example.travelagency.dto.Admin;
import com.example.travelagency.entity.Continent;
import com.example.travelagency.entity.Tour;
import com.example.travelagency.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContinentService implements Admin {

    @Autowired
    private ContinentRepository continentRepository;

    @Override
    public void add() {
        final Continent europa = new Continent("Europa");
        continentRepository.save(europa);

    }

    @Override
    public void modify() {

    }

    @Override
    public void show() {

    }

    @Override
    public void remove() {
        Continent europa = new Continent("continent");
        continentRepository.delete(europa);

    }

}
