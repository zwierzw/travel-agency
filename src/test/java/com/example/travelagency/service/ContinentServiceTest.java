package com.example.travelagency.service;

import com.example.travelagency.entity.Continent;
import com.example.travelagency.repository.ContinentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ContinentServiceTest {

    @Autowired
    private ContinentRepository continentRepository;

    @Autowired
    private ContinentService continentService;

    @Test
    void add() {
        //given
        final String europa = "Europa";
        //when
        continentService.add(europa);
        List<Continent> continentList = continentRepository.findAll();
        //then
        assertEquals(1, continentList.size());
    }

    @Test
    void remove(){
        //given
        final String europa = "Europa";
        continentService.add(europa);
        //when
        continentService.remove(europa);
        List<Continent> continentList = continentRepository.findAllByName(europa);
        //then
        assertEquals(0, continentList.size());
    }
}