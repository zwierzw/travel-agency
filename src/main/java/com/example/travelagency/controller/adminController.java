package com.example.travelagency.controller;

import com.example.travelagency.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/travel-agency")
@RequiredArgsConstructor
public class adminController {

    private final AdminService adminService;

    /*to jest połączenie internet - admin service dla metody addContinent
    - treść po @GetMapping("/BLABLABLA") to jest właśnie ENDPOINT, którym wystawiamy na jakiś URL nasze dane, z którymi
    połączy się Mateusz
    */
    @GetMapping("/")
    public void addContinent(String name) {
        adminService.addContinent(name);
    }
}
