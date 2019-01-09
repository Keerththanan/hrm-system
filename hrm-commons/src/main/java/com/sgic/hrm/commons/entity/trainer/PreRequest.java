package com.sgic.hrm.commons.entity.trainer;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "preRequest", schema = "trainer")

public class PreRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8474525908984115530L;
	@Id
	@GeneratedValue
	
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "resourceName")
	private String resourceName;
	
	@Column(name = "resource")
	private File  resource;
	
	@Column(name = "link")
	private String link;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trainingSchedule_id")
	private TrainingSchedule trainingSchedule;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trainer_id")
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

	

	public TrainingSchedule getTrainingSchedule() {
		return trainingSchedule;
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
