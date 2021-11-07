package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name= "city")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class City {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private Country country;


    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }
}
