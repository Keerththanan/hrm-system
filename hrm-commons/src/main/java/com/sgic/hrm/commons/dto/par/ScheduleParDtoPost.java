package com.sgic.hrm.commons.dto.par;

import java.util.Date;
import java.util.List;

import com.sgic.hrm.commons.entity.par.EmployeeDetails;

public class ScheduleParDtoPost {

	private String empId;
	private Date scheduleDate;

	private List<ScheduleParAppraisorsDtoPost> scheduleParAppraisorsList;
	private List<ScheduleParContentDtoPost> scheduleParContentList;
	
	
	public ScheduleParDtoPost(String empId, Date scheduleDate) {
		this.empId = empId;
		this.scheduleDate = scheduleDate;
	}

	public ScheduleParDtoPost() {
		
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public List<ScheduleParAppraisorsDtoPost> getScheduleParAppraisorsList() {
		return scheduleParAppraisorsList;
	}

	public void setScheduleParAppraisorsList(List<ScheduleParAppraisorsDtoPost> scheduleParAppraisorsList) {
		this.scheduleParAppraisorsList = scheduleParAppraisorsList;
	}

	public List<ScheduleParContentDtoPost> getScheduleParContentList() {
		return scheduleParContentList;
	}

	public void setScheduleParContentList(List<ScheduleParContentDtoPost> scheduleParContentList) {
		this.scheduleParContentList = scheduleParContentList;
	}

}