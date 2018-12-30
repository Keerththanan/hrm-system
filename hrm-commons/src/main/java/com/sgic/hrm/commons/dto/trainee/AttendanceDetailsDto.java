package com.sgic.hrm.commons.dto.trainee;

import java.util.Date;

public class AttendanceDetailsDto {
	private Integer id;
	private Integer trainee;
	private Date startDate;
	private Date endDate;
	private Date updateAt;
	private Integer attendantStatus;
	private Integer attendType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTrainee() {
		return trainee;
	}
	public void setTrainee(Integer trainee) {
		this.trainee = trainee;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Integer getAttendantStatus() {
		return attendantStatus;
	}
	public void setAttendantStatus(Integer attendantStatus) {
		this.attendantStatus = attendantStatus;
	}
	public Integer getAttendType() {
		return attendType;
	}
	public void setAttendType(Integer attendType) {
		this.attendType = attendType;
	}

	
}
