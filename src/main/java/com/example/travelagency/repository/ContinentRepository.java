package com.example.travelagency.repository;

import com.example.travelagency.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

    Continent findByName(String name);
    List<Continent> findAllByName(String name);
}
