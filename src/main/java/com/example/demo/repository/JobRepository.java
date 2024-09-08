package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Job;
import com.example.demo.entity.Employee;



@Repository
public interface JobRepository extends JpaRepository<Job, String>{
}

/*
public interface JobRepository extends JpaRepository<Job, String> {
}


 */