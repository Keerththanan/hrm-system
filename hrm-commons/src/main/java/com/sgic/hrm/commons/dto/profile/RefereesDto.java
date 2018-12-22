package com.sgic.hrm.commons.dto.profile;

import com.sgic.hrm.commons.entity.User;

public class RefereesDto {
	private Integer id;
	private String refereeName;
	private User user;
	private String Address;
	private String email;
	private String contactNo;
	private String relationship;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRefereeName() {
		return refereeName;
	}
	public void setRefereeName(String refereeName) {
		this.refereeName = refereeName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	
}
