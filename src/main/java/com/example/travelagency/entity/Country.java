package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Country {

    @Id
    private UUID id;
    private String name;

    @ManyToOne
    private Continent continent;

    public Country(String name, Continent continent) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.continent = continent;
    }
}
