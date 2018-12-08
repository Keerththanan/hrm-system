package com.sgic.hrm.commons.dto;

import java.io.File;
import java.sql.Date;

public class ApplicantData {
	
	private Integer id;
	private HighestQualificationData highestQualificationId;
	 //DistrictData district;
	private JobData jobId;
	private String fullName;
	private String nic;
	private String email;
	private Date dateOfBirth;
	private String address;
	private File cvFile;
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
		
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public File getCvFile() {
		return cvFile;
	}
	public void setCvFile(File cvFile) {
		this.cvFile = cvFile;
	}
	public HighestQualificationData getHighestQualificationId() {
		return highestQualificationId;
	}
	public void setHighestQualificationId(HighestQualificationData highestQualificationId) {
		this.highestQualificationId = highestQualificationId;
	}
	public JobData getJobId() {
		return jobId;
	}
	public void setJobId(JobData jobId) {
		this.jobId = jobId;
	}
	
	
	
}
