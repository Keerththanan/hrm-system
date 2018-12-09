package com.sgic.hrm.commons.dto.par;

import java.util.Date;
import java.util.List;

public class ScheduleParDtoPost {

	private String empId;
	private Date scheduleDate;

	private List<ScheduleParAppraisorsDtoPost> scheduleParAppraisorsList;
	private List<ScheduleParContentDtoPost> scheduleParContentList;

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