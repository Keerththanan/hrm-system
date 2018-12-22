package com.sgic.hrm.commons.dto.profile;

import com.sgic.hrm.commons.entity.Job;
import com.sgic.hrm.commons.entity.KeyActivity;
import com.sgic.hrm.commons.entity.Location;
import com.sgic.hrm.commons.entity.User;

public class RolesAndResponsibilityDto {
	private Integer id;
	private User user;
	private Job job;
	private Location location;
	private KeyActivity keyActivity;
	private String responsibility;
	private String overAllPurpose;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public KeyActivity getKeyActivity() {
		return keyActivity;
	}
	public void setKeyActivity(KeyActivity keyActivity) {
		this.keyActivity = keyActivity;
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
