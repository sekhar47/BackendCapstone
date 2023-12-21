package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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
  
    public boolean authenticate(Long empid, String emppass) {
        Employee employee = employeeRepository.findByEmpidAndEmppass(empid, emppass);
        return employee != null;
    }
    
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
 
   
   
}
