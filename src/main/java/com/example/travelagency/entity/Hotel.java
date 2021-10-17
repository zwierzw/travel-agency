package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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

    @OneToOne
    private City city;
}
