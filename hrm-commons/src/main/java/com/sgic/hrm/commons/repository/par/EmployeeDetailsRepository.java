package com.sgic.hrm.commons.repository.par;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.par.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, String> {
	@Query("SELECT e FROM EmployeeDetails e WHERE lower(e.EmpName) LIKE lower(concat(?1,'%'))")
	 List<EmployeeDetails> findByEmpName(String empName);
}
