package com.sgic.hrm.commons.dto.trainee;

import java.sql.Time;
import java.time.Duration;
import java.util.Date;

public class AttendanceDetailsDto {
	private Integer id;
	private Integer trainee;
	private Time startTime;
	private Time endTime;
	private Date updateAt;
	private Integer attendantStatus;
	private Integer attendType;
	private Date attendDate;
	private Duration duration;

	public Date getAttendDate() {
		return attendDate;
	}

	public void setAttendDate(Date attendDate) {
		this.attendDate = attendDate;
	}

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

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
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
