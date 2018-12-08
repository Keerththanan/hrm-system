package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.SalaryDetailsHRViewEntity;

public interface SalaryDetailsHRViewRepository extends JpaRepository<SalaryDetailsHRViewEntity, Integer>{

	@Query("SELECT sd FROM SalaryDetailsHRViewEntity sd WHERE sd.empName LIKE ?1%")
	List<SalaryDetailsHRViewEntity> findSalaryDetailsByEmpName(String name);
}
