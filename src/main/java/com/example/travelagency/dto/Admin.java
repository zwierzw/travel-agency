package com.example.travelagency.dto;

import com.example.travelagency.entity.Tour;

import java.util.List;

public interface Admin {

     void addTour();
     void removeTour();
     List<Tour> showAllTours();

}
