package com.example.travelagency.repository;

import com.example.travelagency.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

    Continent findByName(String name);
    List<Continent> findAllByName(String name);

    @Modifying
    @Query("delete from Continent c where c.name=:name")
    void deleteByName(@Param("name") String name);
}
