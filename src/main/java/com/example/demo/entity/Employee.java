package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id",nullable = false)
    private Integer employee_id;

    @Column(name="first_name",length = 20)
    private String first_name;

    @Column(name="last_name",length = 25)
    private String last_name;

    @Column(name="email",length = 25)
    private String email;

    @Column(name="job_id",nullable = false)
    private Integer job_id;

    @Column(name="department_id")
    private Integer department_id;
}
