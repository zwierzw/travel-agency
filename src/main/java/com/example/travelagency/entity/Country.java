package com.example.travelagency.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "country")
@RequiredArgsConstructor
@Data
public class Country {

    @Id
    private UUID id;
    private String name;

    private Continent continent;
}
