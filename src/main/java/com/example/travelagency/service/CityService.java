package com.example.travelagency.service;

import com.example.travelagency.dto.AdminCity;
import com.example.travelagency.entity.City;
import com.example.travelagency.entity.Country;
import com.example.travelagency.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService implements AdminCity {

    @Autowired
    private CityRepository cityRepository;


    @Override
    public void addCity(String name, Country country) {
        final City city = new City(name, country);
        cityRepository.save(city);
    }

    @Override
    public void removeCity(String name) {
       cityRepository.deleteByName(name);
    }

    @Override
    public City findCity(String name){
        return cityRepository.findByName(name);
    }

    @Override
    public List<City> findAllCities(){
        return cityRepository.findAll();
    }
}
