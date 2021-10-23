package com.example.travelagency.service;

import com.example.travelagency.dto.Admin;
import com.example.travelagency.entity.Continent;
import com.example.travelagency.entity.Country;
import com.example.travelagency.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements Admin {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public void addCountry (String name, Continent continent) {
        final Country country = new Country(name, continent);
        countryRepository.save(country);
    }

    @Override
    public void remove(String name) {


    }
}
