//code done by jayapriya
package com.sgic.hrm.commons.trainer.dto;

import java.io.File;


public class PreRequestData {
	
	private Integer id;
	private TrainingScheduleData trainingSchedule;
	private String resourceName;
	private String resourceType;
	private File  resource;
	private String link;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public TrainingScheduleData getTrainingSchedule() {
		return trainingSchedule;
	}
	public void setTrainingSchedule(TrainingScheduleData trainingSchedule) {
		this.trainingSchedule = trainingSchedule;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public File getResource() {
		return resource;
	}
	public void setResource(File resource) {
		this.resource = resource;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
}
