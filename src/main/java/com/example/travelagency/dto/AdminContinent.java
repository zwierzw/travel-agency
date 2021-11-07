package com.example.travelagency.dto;

import com.example.travelagency.entity.Continent;
import com.example.travelagency.entity.Tour;

import java.util.List;

public interface AdminContinent {

     void addContinent(String name);;
     void removeContinent(String name);
     Continent findContinent(String name);
     List<Continent> findAllContinents();

}
