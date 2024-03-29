package com.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee", uniqueConstraints = @UniqueConstraint(columnNames = "empemail"))
@Entity
public class User {
	

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String empid;
	private String name;
	private String empemail; 
	private String password;
	private String empmobile;
//	private String domain;
	private Boolean availability;
	private String privilage;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmpmobile() {
		return empmobile;
	}
	public void setEmpmobile(String empmobile) {
		this.empmobile = empmobile;
	}
//	public String getDomain() {
//		return domain;
//	}
//	public void setDomain(String domain) {
//		this.domain = domain;
//	}
	public Boolean getAvailability() {
		return availability;
	}
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	public String getPrivilage() {
		return privilage;
	}
	public void setPrivilage(String privilage) {
		this.privilage = privilage;
	}
	public User(String empid, String name, String empemail, String password, String empmobile, 
			Boolean availability, String privilage) {
		super();
		this.empid = empid;
		this.name = name;
		this.empemail = empemail;
		this.password = password;
		this.empmobile = empmobile;
//		this.domain = domain;
		this.availability = availability;
		this.privilage = privilage;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	

}
