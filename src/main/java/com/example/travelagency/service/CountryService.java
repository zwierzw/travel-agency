package com.example.travelagency.service;

import com.example.travelagency.dto.AdminCountry;
import com.example.travelagency.entity.Continent;
import com.example.travelagency.entity.Country;
import com.example.travelagency.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //na poziomie serwisów komunikujących się z Repo zawsze dodaj Transactionala
public class CountryService implements AdminCountry {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public void addCountry(String name, Continent continent) {
        final Country country = new Country(name, continent);
        countryRepository.save(country);
    }

    @Override
    public void removeCountry(String name) {
        countryRepository.deleteByName(name);
    }

    @Override
    public Country findCountry(String name) {
        return countryRepository.findByName(name);
    }

    @Override
    public List<Country> findAllCountries(){
        return countryRepository.findAll();
    }
}
