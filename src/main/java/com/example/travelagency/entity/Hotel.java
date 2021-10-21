package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table (name = "hotel")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hotel {
    @Id
    private UUID id;
    private String name;
    private int stars;
    private String description;

    @ManyToOne
    private City city;

    public Hotel(String name, int stars, String description, City city) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.stars = stars;
        this.description = description;
        this.city = city;
    }
}
