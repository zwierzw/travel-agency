package com.example.travelagency.dto;

import com.example.travelagency.entity.Airport;
import lombok.Data;

import java.util.List;

@Data
public class AirportListDto {
    private List<Airport> airportList;
}
