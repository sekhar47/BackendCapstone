package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.myEntity.Employee;
import com.example.demo.repo.EmployeeRepository;


import jakarta.persistence.EntityNotFoundException;

// EmployeeService.java
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long empid) {
        return employeeRepository.findById(empid)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + empid));
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long empid) {
        employeeRepository.deleteById(empid);
    }

		@Autowired
	private EmployeeRepository repo;
	
	public Employee saveEmp(Employee emp) {
		return repo.save(emp);
	}
	
	
	public List<Employee> findUsers() {
		return repo.findAll();
	}
}
