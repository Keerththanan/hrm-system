package com.sgic.hrm.commons.entity;

import java.io.File;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "applicant")
public class Applicant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4074861151643128233L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="highestQualification_id")
	private HighestQualification highestQualificationid;
	@ManyToOne
	@JoinColumn(name="district_id")
	private District districtid;
	@ManyToOne
	@JoinColumn(name="job_id")
	private Job jobid;
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
	public HighestQualification getHighestQualificationid() {
		return highestQualificationid;
	}
	public void setHighestQualificationid(HighestQualification highestQualificationid) {
		this.highestQualificationid = highestQualificationid;
	}
	public District getDistrictid() {
		return districtid;
	}
	public void setDistrictid(District districtid) {
		this.districtid = districtid;
	}
	public Job getJobid() {
		return jobid;
	}
	public void setJobid(Job jobid) {
		this.jobid = jobid;
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
