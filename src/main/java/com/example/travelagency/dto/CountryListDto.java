package com.example.travelagency.dto;

import com.example.travelagency.entity.Country;
import lombok.Data;

import java.util.List;

@Data
public class CountryListDto {
    private List<Country> countryList;
}
