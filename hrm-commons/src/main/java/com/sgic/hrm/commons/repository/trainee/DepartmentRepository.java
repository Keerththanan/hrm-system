package com.sgic.hrm.commons.repository.trainee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainee.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	Department findDepartmentById(Integer id);
}
