package com.example.travelagency.dto;

import com.example.travelagency.entity.Continent;
import com.example.travelagency.entity.Country;

public interface AdminCountry {

    void addCountry(String name, Continent continent);
    void removeCountry(String name);
    Country findCountry(String name);
}
