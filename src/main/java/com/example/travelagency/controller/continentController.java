package com.example.travelagency.controller;


import com.example.travelagency.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/travel-agency")
@RequiredArgsConstructor
public class continentController {


    private final AdminService adminService;


    @GetMapping("/")
    public void addContinent(String name){
        adminService.addContinent(name);
    }

}
