package com.sgic.hrm.commons.trainee.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
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
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "trainee_id")
	private Trainee trainee;
	private Date startDate;
	private Date endDate;
	@UpdateTimestamp
	private Date updateAt;
	@ManyToOne
	@JoinColumn(name = "status_id")
	private AttendStatus attendantStatus;

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
}
