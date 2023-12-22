package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.myEntity.Employee;


// EmployeeRepository.java
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom queries if needed
}