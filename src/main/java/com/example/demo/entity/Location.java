package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="locations")
public class Location {
    @Id
    @Column(name="location_id", nullable=false)
    private Integer location_id;

    @Column(name="city",nullable=false,length=30)
    private String city;
}
