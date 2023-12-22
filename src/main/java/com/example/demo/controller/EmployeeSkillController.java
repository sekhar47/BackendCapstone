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

import com.example.demo.myEntity.EmployeeSkill;
import com.example.demo.service.EmployeeSkillService;


// EmployeeSkillController.java
@RestController
@RequestMapping("/employeeskills")
public class EmployeeSkillController {

    @Autowired
    private EmployeeSkillService employeeSkillService;

    @GetMapping
    public List<EmployeeSkill> getAllEmployeeSkills() {
        return employeeSkillService.getAllEmployeeSkills();
    }

    @GetMapping("/{skillid}")
    public EmployeeSkill getEmployeeSkillById(@PathVariable Long skillid) {
        return employeeSkillService.getEmployeeSkillById(skillid);
    }

    @PostMapping
    public EmployeeSkill saveEmployeeSkill(@RequestBody EmployeeSkill employeeSkill) {
        return employeeSkillService.saveEmployeeSkill(employeeSkill);
    }

    @DeleteMapping("/{skillid}")
    public void deleteEmployeeSkill(@PathVariable Long skillid) {
        employeeSkillService.deleteEmployeeSkill(skillid);
    }
}
