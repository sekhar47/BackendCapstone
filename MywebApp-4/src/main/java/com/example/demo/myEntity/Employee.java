package com.example.demo.myEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Employee.java
@Entity
@Table(name = "employee")
public class Employee {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long empid;

 private String empname;
 private String empemail;
 private String emppass;
 private String empmobile;
 private String domain;
 private String privilege;
 private Boolean availability;
public Long getEmpid() {
	return empid;
}
public void setEmpid(Long empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpemail() {
	return empemail;
}
public void setEmpemail(String empemail) {
	this.empemail = empemail;
}
public String getEmppass() {
	return emppass;
}
public void setEmppass(String emppass) {
	this.emppass = emppass;
}
public String getEmpmobile() {
	return empmobile;
}
public void setEmpmobile(String empmobile) {
	this.empmobile = empmobile;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getPrivilege() {
	return privilege;
}
public void setPrivilege(String privilege) {
	this.privilege = privilege;
}
public Boolean getAvailability() {
	return availability;
}
public void setAvailability(Boolean availability) {
	this.availability = availability;
}

 // Getters and setters
}