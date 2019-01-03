package com.sgic.hrm.commons.dto.trainee;

public class RefereeSaveDto {
	private Integer id;
	private String refereeName;
	private Integer trainee;
	private String email;
	private String address;
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

	public Integer getTrainee() {
		return trainee;
	}

	public void setTrainee(Integer trainee) {
		this.trainee = trainee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
