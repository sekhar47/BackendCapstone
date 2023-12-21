package com.example.demo.myEntity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeskill")
public class EmployeeSkill {

    @EmbeddedId
    private EmployeeSkillId id;

    @ManyToOne
    @JoinColumn(name = "empid", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "skillid", insertable = false, updatable = false)
    private Skill skill;

    @Column(name = "proficiency")
    private String proficiency;

    @Column(name = "certified")
    private boolean certified;

    @Column(name = "certificationname")
    private String certificationName;

    @Column(name = "trainingdays")
    private int trainingDays;

    @Column(name = "reviewed")
    private boolean reviewed;

    // Getters and setters
}
