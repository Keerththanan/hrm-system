package com.sgic.hrm.commons.dto.par;

public class ScheduleParAppraisorsDtoGet {

	private Integer appraiserId;
	private String appraiserName;

	public ScheduleParAppraisorsDtoGet(Integer appraiserId, String appraiserName) {
		this.appraiserId = appraiserId;
		this.appraiserName = appraiserName;
	}

	public ScheduleParAppraisorsDtoGet() {

	}

	public Integer getAppraiserId() {
		return appraiserId;
	}

	public void setAppraiserId(Integer appraiserId) {
		this.appraiserId = appraiserId;
	}

	public String getAppraiserName() {
		return appraiserName;
	}

	public void setAppraiserName(String appraiserName) {
		this.appraiserName = appraiserName;
	}

}
