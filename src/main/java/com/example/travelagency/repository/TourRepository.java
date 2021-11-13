package com.example.travelagency.repository;

import com.example.travelagency.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<Tour, Long> {
    Tour findByName(String name);

    @Modifying
    @Query("delete from Tour t where t.name=:name")
    void deleteByName(@Param("name") String name);
}
