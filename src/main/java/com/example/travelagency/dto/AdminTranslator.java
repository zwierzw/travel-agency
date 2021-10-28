package com.example.travelagency.dto;

import com.example.travelagency.entity.City;
import com.example.travelagency.entity.Continent;
import com.example.travelagency.entity.Country;

public interface AdminTranslator {

    public void addAirportTranslate(String name, String city);

    public void removeAirportTranslate(String name, String city);

    public void addCityTranslate(String name, String country);

    public void removeCityTranslate(String name);

    public void addContinentTranslate(String name);

    public void removeContinentTranslate(String name);

    public void addCountryTranslate(String name, String continent);

    public void removeCountryTranslate(String name);

    public void addHotelTranslate(String name, int stars, String description, String city);

    public void removeHotelTranslate(String name);

}
