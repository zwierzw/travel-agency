package com.example.travelagency.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class City {
    private String name;
    private Country country;
}
