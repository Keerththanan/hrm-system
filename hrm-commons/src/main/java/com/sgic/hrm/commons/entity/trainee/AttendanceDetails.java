package com.sgic.hrm.commons.entity.trainee;

import java.io.Serializable;
import java.sql.Time;
import java.time.Duration;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "attendence_details", schema = "trainee")
public class AttendanceDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1382561378759436449L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "trainee_id")
	private Trainee trainee;
	private Time startTime;
	private Time endTime;
	private Date attendDate;
	@UpdateTimestamp
	private Date updateAt;
	@ManyToOne
	@JoinColumn(name = "status_id")
	private AttendStatus attendantStatus;
	@ManyToOne
	@JoinColumn(name = "attend_type_id")
	private AttendType attendType;
	private Duration duration;

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public AttendType getAttendType() {
		return attendType;
	}

	public void setAttendType(AttendType attendType) {
		this.attendType = attendType;
	}

	public AttendStatus getAttendantStatus() {
		return attendantStatus;
	}

	public void setAttendantStatus(AttendStatus attendantStatus) {
		this.attendantStatus = attendantStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
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

	public Date getAttendDate() {
		return attendDate;
	}

	public void setAttendDate(Date attendDate) {
		this.attendDate = attendDate;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
}
