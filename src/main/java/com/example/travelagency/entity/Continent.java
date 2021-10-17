package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "continent")
@RequiredArgsConstructor
@Data
public class Continent {
    @Id
    private UUID id;
    private String name;
}
