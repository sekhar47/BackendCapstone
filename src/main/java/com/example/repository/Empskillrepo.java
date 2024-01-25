package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dto.EmployeeDetailsDTO;
import com.example.entity.EmpID;
import com.example.entity.EmployeeSkill;
import com.example.entity.Skills;
import com.example.entity.User;




@Repository
public interface Empskillrepo extends JpaRepository<EmployeeSkill, EmpID>{
	
	
	
	 List<EmployeeSkill> findByUser(User user);

	    Optional<EmployeeSkill> findByUserAndSkills(User user, Skills skills);

	    
//	    for search and filter module


    List<EmployeeSkill> findByUserEmpid(String empid);
//
//	    List<EmployeeSkill> findBySkillsSkillname(String skillname);
//
//	    List<EmployeeSkill> findBySkillsDomain(String domain);
//
//	    List<EmployeeSkill> findBySkillsSubdomain(String subdomain);
//
//	    List<EmployeeSkill> findByProficiency(String proficiency);
	    
//	    filter
    List<EmployeeSkill> findByUserEmpidIgnoreCaseContainingAndSkillsSkillnameIgnoreCaseContainingAndSkillsDomainIgnoreCaseContainingAndSkillsSubdomainIgnoreCaseContainingAndProficiencyIgnoreCaseContaining(
    	    String empid, String skillname, String domain, String subdomain, String proficiency
    	);

	    
	    
	//for report generation
	    List<EmployeeSkill> findByUserEmpidIgnoreCase(String empid);




}
