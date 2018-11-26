package com.sgic.hrm.commons.dto;

import java.io.File;
import java.sql.Date;



import com.sgic.hrm.commons.dto.DistrictData;

public class ApplicantData {
	
	 Integer id;
	 HighestQualificationData highestQualificationDataid;
	 DistrictData districtDataid;
	 JobData jobDataid;
	 String fullName;
	 String nic;
	 String email;
	 Date dateOfBirth;
	 String address;
	 File cvFile;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	public HighestQualificationData getHighestQualificationDataid() {
		return highestQualificationDataid;
	}
	public void setHighestQualificationDataid(HighestQualificationData highestQualificationDataid) {
		this.highestQualificationDataid = highestQualificationDataid;
	}
	public JobData getJobDataid() {
		return jobDataid;
	}
	public void setJobDataid(JobData jobDataid) {
		this.jobDataid = jobDataid;
	}
	public DistrictData getDistrictDataid() {
		return districtDataid;
	}
	public void setDistrictDataid(DistrictData districtDataid) {
		this.districtDataid = districtDataid;
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
	

}
