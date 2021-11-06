package com.example.travelagency.controller;

import com.example.travelagency.dto.ContinentDto;
import com.example.travelagency.entity.Continent;
import com.example.travelagency.service.AdminService;
import com.example.travelagency.service.ContinentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/travel-agency")
@RequiredArgsConstructor
public class adminController {

    private final ContinentService continentService;

    /*to jest połączenie internet - admin service dla metody addContinent
    - treść po @GetMapping("/BLABLABLA") to jest właśnie ENDPOINT, którym wystawiamy na jakiś URL nasze dane, z którymi
    połączy się Mateusz
    */
//    @GetMapping("/")
//    public void addContinent(String name) {
//        adminService.addContinentTranslate(name);
//    }

    @PostMapping("/addContinent")
    public ResponseEntity<Continent> add(@RequestBody ContinentDto newContinent) {
        continentService.addContinent(newContinent.getName());
        Continent user = continentService.findContinent(newContinent.getName());
        if (user == null) {
            throw new IllegalStateException();
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }
}
