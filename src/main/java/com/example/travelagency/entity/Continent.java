package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "continent")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Continent {
    @Id
    private UUID id;
    private String name;

    public Continent(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }
}
