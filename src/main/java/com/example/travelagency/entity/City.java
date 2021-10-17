package com.example.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name= "city")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class City {

    @Id
    private UUID id;
    private String name;

    @OneToOne
    private Country country;

    @OneToMany
    private Collection<Hotel> hotelCollection;

    @OneToOne
    private Airport airport;

}
