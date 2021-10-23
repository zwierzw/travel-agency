package com.example.travelagency.dto;

import com.example.travelagency.entity.Tour;

import java.util.List;

public interface Admin {

     void add(String name);
     void remove(String name);
     void modify(String name);
     void show(String name);

}
