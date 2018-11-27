package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(schema="employee", name="vacancy")
public class Vacancy implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8213173494157503310L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
//	private String hiring_officer;
	private Integer noOfVacancy;
	private Integer salaryScale;
	private ZonedDateTime vacancyOpenDate;
	private ZonedDateTime vacancyCloseDate;
	private ZonedDateTime interviewDate;
	private String keyRecuitment;

	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userid;

	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job jobid;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department departmentid;

	@ManyToOne
	@JoinColumn(name = "recuitment_id")
	private RecruitmentType recruitmentid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNoOfVacancy() {
		return noOfVacancy;
	}

	public void setNoOfVacancy(Integer noOfVacancy) {
		this.noOfVacancy = noOfVacancy;
	}

	public Integer getSalaryScale() {
		return salaryScale;
	}

	public void setSalaryScale(Integer salaryScale) {
		this.salaryScale = salaryScale;
	}

	public ZonedDateTime getVacancyOpenDate() {
		return vacancyOpenDate;
	}

	public void setVacancyOpenDate(ZonedDateTime vacancyOpenDate) {
		this.vacancyOpenDate = vacancyOpenDate;
	}

	public ZonedDateTime getVacancyCloseDate() {
		return vacancyCloseDate;
	}

	public void setVacancyCloseDate(ZonedDateTime vacancyCloseDate) {
		this.vacancyCloseDate = vacancyCloseDate;
	}

	public ZonedDateTime getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(ZonedDateTime interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getKeyRecuitment() {
		return keyRecuitment;
	}

	public void setKeyRecuitment(String keyRecuitment) {
		this.keyRecuitment = keyRecuitment;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	public Job getJobid() {
		return jobid;
	}

	public void setJobid(Job jobid) {
		this.jobid = jobid;
	}

	public Department getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Department departmentid) {
		this.departmentid = departmentid;
	}

	public RecruitmentType getRecruitmentid() {
		return recruitmentid;
	}

	public void setRecruitmentid(RecruitmentType recruitmentid) {
		this.recruitmentid = recruitmentid;
	}
	
	

}
