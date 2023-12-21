package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.myEntity.Skill;
import com.example.demo.repo.SkillRepository;



// SkillService.java
@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Skill getSkillById(Long skillid) {
        return skillRepository.findById(skillid)
                .orElseThrow();
    }

    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public void deleteSkill(Long skillid) {
        skillRepository.deleteById(skillid);
    }
}
