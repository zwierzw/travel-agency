package com.example.travelagency.dto;

import com.example.travelagency.entity.City;
import lombok.Data;

import java.util.List;

@Data
public class CityListDto {
    private List<City> cityList;
}
