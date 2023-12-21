package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.myEntity.EmployeeSkill;



// EmployeeSkillRepository.java
public interface EmployeeSkillRepository extends JpaRepository<EmployeeSkill, Long> {
    // Custom queries if needed
}

