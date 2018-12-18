package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ParTraineeAppraisor", schema = "par")
public class ParTraineeAppraisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appraiserId;
	private String empId;
	private String empName;

	public ParTraineeAppraisor(Integer id, String empId,String empName) {

		this.appraiserId = id;
		this.empId = empId;
		this.empName=empName;
	}

	public ParTraineeAppraisor() {

	}

	public Integer getAppraiserId() {
		return appraiserId;
	}

	public void setAppraiserId(Integer appraiserId) {
		this.appraiserId = appraiserId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
