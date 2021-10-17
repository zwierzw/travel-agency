package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoughtTour {
    private Tour tour;
    // private List<Person> personList; ?????
    private double price;
}
