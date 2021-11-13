package com.example.travelagency.dto;

import com.example.travelagency.entity.Tour;
import lombok.Data;

import java.util.List;

@Data
public class TourListDto {
    private List<Tour> tourList;
}
