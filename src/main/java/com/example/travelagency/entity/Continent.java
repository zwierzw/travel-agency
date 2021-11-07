package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "continent")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Continent {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Continent(String name) {
        this.name = name;
    }
}
