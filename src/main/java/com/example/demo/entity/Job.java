package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="jobs")

public class Job {
    @Id
    @Column(name="job_id",nullable=false,length=10)
    private String job_id;

    @Column(name="job_title",nullable=false,length=35)
    private String job_title;

}
