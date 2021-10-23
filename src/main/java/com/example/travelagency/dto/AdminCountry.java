package com.example.travelagency.dto;

import com.example.travelagency.entity.Continent;

public interface AdminCountry {

    void addCountry(String name, Continent continent);
    void removeCountry(String name);
}
