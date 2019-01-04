package com.sgic.hrm.commons.repository.trainee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainee.TraineeDepartment;

public interface TraineeDepartmentRepository extends JpaRepository<TraineeDepartment, Integer> {
	TraineeDepartment findDepartmentById(Integer id);
}
