package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="roles_and_responsibilites",schema="employee")

public class RolesAndResponsibilites  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;
	@ManyToOne
	@JoinColumn(name="job_id")
	private Job jobId;
	@ManyToOne
	@JoinColumn(name="location_id")
	private Location locatioId;
	@ManyToOne
	@JoinColumn(name="key_activity_id")
	private KeyActivity keyActivityId;
	private String responsibility;
	private String overAllPurpose;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public Job getJobId() {
		return jobId;
	}
	public void setJobId(Job jobId) {
		this.jobId = jobId;
	}
	public Location getLocatioId() {
		return locatioId;
	}
	public void setLocatioId(Location locatioId) {
		this.locatioId = locatioId;
	}
	public KeyActivity getKeyActivityId() {
		return keyActivityId;
	}
	public void setKeyActivityId(KeyActivity keyActivityId) {
		this.keyActivityId = keyActivityId;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String getOverAllPurpose() {
		return overAllPurpose;
	}
	public void setOverAllPurpose(String overAllPurpose) {
		this.overAllPurpose = overAllPurpose;
	}
	
	
	
}
