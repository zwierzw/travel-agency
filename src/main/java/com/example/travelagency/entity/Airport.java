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
@Table (name = "airport")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Airport {
    @Id
    private UUID id;
    private String name;

    @OneToOne
    private City city;
}
