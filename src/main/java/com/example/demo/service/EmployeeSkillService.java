package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.myEntity.EmployeeSkill;
import com.example.demo.repo.EmployeeSkillRepository;

// EmployeeSkillService.java
@Service
public class EmployeeSkillService {

    @Autowired
    private EmployeeSkillRepository employeeSkillRepository;

    public List<EmployeeSkill> getAllEmployeeSkills() {
        return employeeSkillRepository.findAll();
    }

    public EmployeeSkill getEmployeeSkillById(Long skillid) {
        return employeeSkillRepository.findById(skillid)
                .orElseThrow();
    }

    public EmployeeSkill saveEmployeeSkill(EmployeeSkill employeeSkill) {
        return employeeSkillRepository.save(employeeSkill);
    }

    public void deleteEmployeeSkill(Long skillid) {
        employeeSkillRepository.deleteById(skillid);
    }
}
