package com.example.travelagency.repository;


import com.example.travelagency.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository  extends JpaRepository<Hotel, Long> {
    Hotel findByName(String name);

    @Modifying
    @Query("delete from Hotel h where h.name=:name")
    void deleteByName(@Param("name") String name);
}
