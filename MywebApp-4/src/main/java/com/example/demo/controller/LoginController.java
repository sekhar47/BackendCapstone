package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.myEntity.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.EmployeeService;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@RestController
public class LoginController {

//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestParam Long empId, @RequestParam String empPass) {
//        
//        Employee employee = employeeRepository.findById(empId).orElse(null);
//        
//        if (employee != null && employee.getEmppass().equals(empPass)) {
//            return ResponseEntity.ok("Login successful");
//        } else {
//            return ResponseEntity.status(401).body("Invalid credentials");
//        }
//    }
	
	  @Autowired
	    private EmployeeService employeeService;

	    @GetMapping("/login")
	    public String loginPage() {
	        return "login";
	    }

	    @PostMapping("/login")
	    public String loginSubmit(@RequestParam Long empid, @RequestParam String emppass, Model model) {
	        if (employeeService.authenticate(empid, emppass)) {
	            // Authentication successful
	            return "redirect:/dashboard";
	        } else {
	            // Authentication failed
	            model.addAttribute("error", "Invalid credentials");
	            return "login";
	        }
	    }
	
	
}





