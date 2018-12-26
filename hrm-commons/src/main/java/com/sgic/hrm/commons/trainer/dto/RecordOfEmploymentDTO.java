package com.sgic.hrm.commons.trainer.dto;

import java.sql.Date;

public class RecordOfEmploymentDTO {

	private Integer id;
	private Date fromYear;
	private Date toYear;
	private String period;
	private String workPlaceName;
	private String workPlaceAddress;
	private String position;
	private String typeOfWork;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFromYear() {
		return fromYear;
	}
	public void setFromYear(Date fromYear) {
		this.fromYear = fromYear;
	}
	public Date getToYear() {
		return toYear;
	}
	public void setToYear(Date toYear) {
		this.toYear = toYear;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getWorkPlaceName() {
		return workPlaceName;
	}
	public void setWorkPlaceName(String workPlaceName) {
		this.workPlaceName = workPlaceName;
	}
	public String getWorkPlaceAddress() {
		return workPlaceAddress;
	}
	public void setWorkPlaceAddress(String workPlaceAddress) {
		this.workPlaceAddress = workPlaceAddress;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTypeOfWork() {
		return typeOfWork;
	}
	public void setTypeOfWork(String typeOfWork) {
		this.typeOfWork = typeOfWork;
	}
	
	
}
