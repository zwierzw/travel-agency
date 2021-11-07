package com.example.travelagency.repository;

import com.example.travelagency.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
    Airport findByName(String name);

    @Modifying
    @Query("delete from Airport a where a.name=:name")
    void deleteByName(@Param("name") String name);
}
