package com.example.travelagency.service;

import com.example.travelagency.dto.AdminContinent;
import com.example.travelagency.entity.Continent;
import com.example.travelagency.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinentService implements AdminContinent {

    @Autowired
    private ContinentRepository continentRepository;

    @Override
    public void add(String name) {
        final Continent continent = new Continent(name);
        continentRepository.save(continent);
    }

    @Override
    public void remove(String name) {
        Continent continent = continentRepository.findByName(name);
        continentRepository.delete(continent);
    }


}
