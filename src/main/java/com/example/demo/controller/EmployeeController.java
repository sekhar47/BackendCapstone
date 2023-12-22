package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.myEntity.Employee;
import com.example.demo.service.EmployeeService;



// EmployeeController.java
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{empid}")
    public Employee getEmployeeById(@PathVariable Long empid) {
        return employeeService.getEmployeeById(empid);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{empid}")
    public void deleteEmployee(@PathVariable Long empid) {
        employeeService.deleteEmployee(empid);
    }
}

//@RestController
//@RequestMapping("/")
//@Controller
//public class HomeController {
//
//	
//	@Autowired
//	private Repo repo;
//	
//	@GetMapping("/user")
//	public List<User> getAllUsers(){
//		return repo.findAll();
//		
//		
//	}
	
	
	