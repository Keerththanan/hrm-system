package com.sgic.hrm.commons.dto.trainee;

public class TraineeProfessionalMembershipSaveDto {
	private Integer id;
	private String organizationName;
	private String eventName;
	private String eventType;
	private Integer periodYearFrom;
	private Integer periodYearTo;
	private Integer award;
	private Integer trainee;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Integer getPeriodYearFrom() {
		return periodYearFrom;
	}
	public void setPeriodYearFrom(Integer periodYearFrom) {
		this.periodYearFrom = periodYearFrom;
	}
	public Integer getPeriodYearTo() {
		return periodYearTo;
	}
	public void setPeriodYearTo(Integer periodYearTo) {
		this.periodYearTo = periodYearTo;
	}
	public Integer getAward() {
		return award;
	}
	public void setAward(Integer award) {
		this.award = award;
	}
	public Integer getTrainee() {
		return trainee;
	}
	public void setTrainee(Integer trainee) {
		this.trainee = trainee;
	}
	
	
}
