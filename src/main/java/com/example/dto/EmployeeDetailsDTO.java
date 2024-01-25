package com.example.dto;

public class EmployeeDetailsDTO {
    private String empid;
    private String name;
    private String empemail;
    private String empmobile;
    private String skillname;
    private String domain;
    private String subdomain;
    private String proficiency;
   
    private boolean availability;
    
    private boolean reviewed;
    private int trainingdays;
    private String password;
    private String privilage;
    
	
	public boolean isReviewed() {
		return reviewed;
	}
	public void setReviewed(boolean reviewed) {
		this.reviewed = reviewed;
	}
	public int getTrainingdays() {
		return trainingdays;
	}
	public void setTrainingdays(int trainingdays) {
		this.trainingdays = trainingdays;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
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
	public String getEmpmobile() {
		return empmobile;
	}
	public void setEmpmobile(String empmobile) {
		this.empmobile = empmobile;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getSubdomain() {
		return subdomain;
	}
	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	public String getProficiency() {
		return proficiency;
	}
	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrivilage() {
		return privilage;
	}
	public void setPrivilage(String privilage) {
		this.privilage = privilage;
	}
	
	public EmployeeDetailsDTO(String empid, String name, String empemail, String empmobile, String skillname,
			String domain, String subdomain, String proficiency, boolean availability, boolean reviewed,
			int trainingdays, String password, String privilage) {
		super();
		this.empid = empid;
		this.name = name;
		this.empemail = empemail;
		this.empmobile = empmobile;
		this.skillname = skillname;
		this.domain = domain;
		this.subdomain = subdomain;
		this.proficiency = proficiency;
		this.availability = availability;
		this.reviewed = reviewed;
		this.trainingdays = trainingdays;
		this.password = password;
		this.privilage = privilage;
	}
	public EmployeeDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Constructors, getters, and setters
    
}
