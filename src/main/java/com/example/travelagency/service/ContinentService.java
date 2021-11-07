package com.example.travelagency.service;

import com.example.travelagency.dto.AdminContinent;
import com.example.travelagency.entity.Continent;
import com.example.travelagency.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ContinentService implements AdminContinent {

    @Autowired
    private ContinentRepository continentRepository;

    @Override
    public void addContinent(String name) {
        final Continent continent = new Continent(name);
        continentRepository.save(continent);
    }

    @Override
    public void removeContinent(String name) {
       continentRepository.deleteByName(name);
    }

    @Override
    public Continent findContinent(String name) {
        return continentRepository.findByName(name);
    }



}
