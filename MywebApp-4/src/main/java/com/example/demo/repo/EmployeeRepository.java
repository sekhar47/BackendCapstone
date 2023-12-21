package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.myEntity.Employee;


// EmployeeRepository.java
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom queries if needed
//	Employee findByEmpid(Long empid);
//
//	Employee findByEmpIdAndEmpPass(Long empid, String emppass);

		Optional<Employee> findById(Long empId);

		Employee findByEmpidAndEmppass(Long empid, String emppass);
}