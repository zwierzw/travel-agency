package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table (name = "airport")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Airport {
    @Id
    private UUID id;
    private String name;

    @OneToOne
    private City city;

    public Airport(String name, City city) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.city = city;
    }
}
