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

import com.example.demo.myEntity.Skill;
import com.example.demo.service.SkillService;



// SkillController.java
@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<Skill> getAllSkills() {
        return skillService.getAllSkills();
    }

    @GetMapping("/{skillid}")
    public Skill getSkillById(@PathVariable Long skillid) {
        return skillService.getSkillById(skillid);
    }

    @PostMapping
    public Skill saveSkill(@RequestBody Skill skill) {
        return skillService.saveSkill(skill);
    }

    @DeleteMapping("/{skillid}")
    public void deleteSkill(@PathVariable Long skillid) {
        skillService.deleteSkill(skillid);
    }
}
