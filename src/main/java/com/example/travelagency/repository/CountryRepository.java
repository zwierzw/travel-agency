package com.example.travelagency.repository;

import com.example.travelagency.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByName(String name);

    @Modifying
    @Query("delete from Country c where c.name=:name")
    void deleteByName(@Param("name") String name);
}
