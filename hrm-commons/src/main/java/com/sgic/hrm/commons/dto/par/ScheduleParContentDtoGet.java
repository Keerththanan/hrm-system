package com.sgic.hrm.commons.dto.par;

public class ScheduleParContentDtoGet {

	private Integer parContentId;
	private String parContentName;

	public ScheduleParContentDtoGet(Integer parContentId, String parContentName) {
		this.parContentId = parContentId;
		this.parContentName = parContentName;
	}

	public ScheduleParContentDtoGet() {

	}



	public Integer getParContentId() {
		return parContentId;
	}

	public void setParContentId(Integer parContentId) {
		this.parContentId = parContentId;
	}

	public String getParContentName() {
		return parContentName;
	}

	public void setParContentName(String parContentName) {
		this.parContentName = parContentName;
	}

}
