package com.sgic.hrm.commons.dto;

import java.time.ZonedDateTime;

public class VacancyData {
	private Integer id;
	private Integer noOfVacancy;
	private Integer salaryScale;
	private ZonedDateTime vacancyOpenDate;
	private ZonedDateTime vacancyCloseDate;
	private ZonedDateTime interviewDate;
	private String keyRecuitment;
	
	private UserData userid;
	private JobData jobid;
	private DepartmentData departmentid;
	private RecruitmentTypeData recruitmentid;
	
	
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
	public UserData getUserid() {
		return userid;
	}
	public void setUserid(UserData userid) {
		this.userid = userid;
	}
	public JobData getJobid() {
		return jobid;
	}
	public void setJobid(JobData jobid) {
		this.jobid = jobid;
	}
	public DepartmentData getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(DepartmentData departmentid) {
		this.departmentid = departmentid;
	}
	public RecruitmentTypeData getRecruitmentid() {
		return recruitmentid;
	}
	public void setRecruitmentid(RecruitmentTypeData recruitmentid) {
		this.recruitmentid = recruitmentid;
	}
	
	
}
