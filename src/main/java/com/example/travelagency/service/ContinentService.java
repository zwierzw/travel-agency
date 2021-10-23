package com.example.travelagency.service;

import com.example.travelagency.dto.Admin;
import com.example.travelagency.entity.Continent;
import com.example.travelagency.entity.Tour;
import com.example.travelagency.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService implements Admin {

    @Autowired
    private ContinentRepository continentRepository;

    @Override
    public void add(String name) {
        final Continent continent = new Continent(name);
        continentRepository.save(continent);
    }

    @Override
    public void remove(String name) {
        List<Continent> continentList = continentRepository.findAll(continent.);
    }

    @Override
    public void modify(String name) {

    }

    @Override
    public void show(String name) {

    }
}
