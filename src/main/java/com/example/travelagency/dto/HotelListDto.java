package com.example.travelagency.dto;

import com.example.travelagency.entity.Hotel;
import lombok.Data;

import java.util.List;

@Data
public class HotelListDto {
    private List<Hotel> hotelList;
}
