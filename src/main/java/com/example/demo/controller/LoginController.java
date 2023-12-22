package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.myEntity.Employee;
import com.example.demo.service.EmployeeService;



@RestController
public class LoginController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/adduser")
	public Employee addUser(@RequestBody Employee emp) {
		return service.saveEmp(emp);
	}

	@PostMapping("/login")
    public String loginUser(@RequestBody Employee emp) {
        List<Employee> saved = service.findUsers();

        // Check if email is provided
        if (emp.getEmpemail() != null && !emp.getEmpemail().isEmpty()) {
            for (Employee detail : saved) {
                if (emp.getEmpemail().equals(detail.getEmpemail())) {
                    if (emp.getEmppass().equals(detail.getEmppass())) {
                        return "Login successful with the email " + emp.getEmpemail();
                    } else {
                        return "Login failed due to incorrect password for email " + emp.getEmpemail();
                    }
                }
            }
            return "Login failed. No user found with email " + emp.getEmpemail();
        }

        // Check if empid is provided
        if (emp.getEmpid() != 0) {
            for (Employee detail : saved) {
                if (emp.getEmpid() == detail.getEmpid()) {
                    if (emp.getEmppass().equals(detail.getEmppass())) {
                        return "Login successful with Employee ID " + emp.getEmpid();
                    } else {
                        return "Login failed due to incorrect password for Employee ID " + emp.getEmpid();
                    }
                }
            }
            return "Login failed. No user found with Employee ID " + emp.getEmpid();
        }

        // No email or empid provided
        return "Enter email or Employee ID";
    }
      
	}
	
