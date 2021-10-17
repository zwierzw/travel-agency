package com.example.travelagency.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@RequiredArgsConstructor
@Data
public class Airport {
    private String name;
    private City city;
}
