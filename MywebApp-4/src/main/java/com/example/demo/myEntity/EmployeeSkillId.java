package com.example.demo.myEntity;

import java.io.Serializable;

import jakarta.persistence.Column;

public class EmployeeSkillId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "empid")
	private Long empid;
	
	@Column(name = "skillid")
    private Long skillid;
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public Long getSkillid() {
		return skillid;
	}
	public void setSkillid(Long skillid) {
		this.skillid = skillid;
	}
}
