package com.example.travelagency.dto;

import com.example.travelagency.entity.Continent;
import com.example.travelagency.entity.Tour;

import java.util.List;

public interface Admin {

     void addContinent(String name);
     void addCountry (String name, Continent continent);
     void remove(String name);

}
