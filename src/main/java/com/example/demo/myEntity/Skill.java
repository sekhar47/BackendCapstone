package com.example.demo.myEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Skill.java
@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillid;

  //  private String skillname;
    private String areadomain;
    private String subdomain;
    private String topic;
	public Long getSkillid() {
		return skillid;
	}
	public void setSkillid(Long skillid) {
		this.skillid = skillid;
	}
//	public String getSkillname() {
//		return skillname;
//	}
//	public void setSkillname(String skillname) {
//		this.skillname = skillname;
//	}
	public String getAreadomain() {
		return areadomain;
	}
	public void setAreadomain(String areadomain) {
		this.areadomain = areadomain;
	}
	public String getSubdomain() {
		return subdomain;
	}
	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

    // Getters and setters
}

