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

    @OneToOne
    private Continent continent;

    @OneToMany
    private Collection<City> cityCollection;



}
