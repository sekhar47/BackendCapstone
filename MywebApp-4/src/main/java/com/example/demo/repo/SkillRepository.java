package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.myEntity.Skill;



// SkillRepository.java
public interface SkillRepository extends JpaRepository<Skill, Long> {
    // Custom queries if needed
}


