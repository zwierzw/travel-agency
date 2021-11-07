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
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "city")
    private City city;

    public Airport(String name, City city) {
        this.name = name;
        this.city = city;
    }
}
