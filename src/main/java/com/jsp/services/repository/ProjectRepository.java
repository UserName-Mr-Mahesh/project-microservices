package com.jsp.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.services.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
	Project findByProjectCode(long employeeAssignedProject);
}
