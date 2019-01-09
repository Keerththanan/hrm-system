package com.sgic.hrm.commons.trainer.dto;

import java.io.File;
import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;

public class PreRequestData {
	
	private Integer id;
	private String resourceName;
	private File  resource;
	private String link;
	
	private TrainingSchedule trainingSchedule;
	private Trainer trainer;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	public void setTrainingSchedule(TrainingSchedule trainingSchedule) {
		this.trainingSchedule = trainingSchedule;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	

}
