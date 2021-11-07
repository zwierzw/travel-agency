package com.example.travelagency.repository;

import com.example.travelagency.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findByName(String name);

    @Modifying
    @Query("delete from City c where c.name=:name")
    void deleteByName(@Param("name") String name);
}
