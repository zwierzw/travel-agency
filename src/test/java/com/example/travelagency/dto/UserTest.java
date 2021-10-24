package com.example.travelagency.dto;

import com.example.travelagency.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Test
    void shouldFindTourByContinent() {
        //Given
        final Continent europa = new Continent("Europa");

        final Country polska = new Country("Polska", europa);
        final Country niemcy = new Country("Niemcy", europa);
        final Country hiszpania = new Country("Hiszpania", europa);
        final Country francja = new Country("Francja", europa);


        final City warszawa = new City("Warszawa", polska);
        final City berlin = new City("Berlin", niemcy);
        final City madryt = new City("Warszawa", hiszpania);
        final City paris = new City("Warszawa", francja);


        final Hotel ibis = new Hotel("Ibis", 5, "Piękny hotel Ibis", warszawa);
        final Hotel interContinental = new Hotel("Intercontinental", 5, "Piękny hotel Intercontinental", berlin);
        final Hotel mariot = new Hotel("Mariot", 5, "Piękny hotel Mariot", paris);
        final Hotel hilton = new Hotel("Hilton", 5, "Piękny hotel Hilton", madryt);

        final Airport tempelhof = new Airport("Tempelhof",berlin);
        final Airport modlin = new Airport("Modlin", warszawa);
        final Airport barajas = new Airport("Barajas", madryt);
        final Airport beauvais = new Airport("Beauvais", paris);


        final var Tour = new Tour("Polska-Niemcy", warszawa, modlin, berlin, tempelhof, ibis, new Date(2021,12,12), new Date(2021,12, 20), 8,
                Type.AI, 1500.50, 1000.70, false, 20, 20);
        //When

        //Then

    }

    @Test
    void shouldFindTourByCountry() {
    }

    @Test
    void shouldFindTourByCity() {
    }

    @Test
    void shouldFinTourByAirport() {
    }

    @Test
    void shouldFindTourByHotel() {
    }
}