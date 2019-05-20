package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.SalaryDetailsEmpViewEntity;

public interface SalaryDetailsEmpViewRepository extends JpaRepository<SalaryDetailsEmpViewEntity, Integer>{

	@Query("SELECT sd FROM SalaryDetailsEmpViewEntity sd WHERE sd.empName=?1")
	SalaryDetailsEmpViewEntity findDetailsByEmpId(Integer id);
}
