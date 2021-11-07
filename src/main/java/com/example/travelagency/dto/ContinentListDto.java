package com.example.travelagency.dto;

import com.example.travelagency.entity.Continent;
import com.example.travelagency.repository.ContinentRepository;
import lombok.Data;

import java.util.List;

@Data
public class ContinentListDto {
    private List<Continent> continentList;
}
