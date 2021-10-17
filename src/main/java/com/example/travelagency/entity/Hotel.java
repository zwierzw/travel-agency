package com.example.travelagency.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Hotel {
    private String name;
    private int stars;
    private String description;
    private City city;
}
