package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ScheduleParTraineeAppraisor", schema = "par")
public class ScheduleParTraineeAppraisor {
	
	@Id
	private String id;
	
	@ManyToOne
	@JoinColumn(name="par_id")
	private Par parId;
	
	@ManyToOne
	@JoinColumn(name="ParAppraisor_id")
	private ParAppraisor parAppraisor;
	
	public ScheduleParTraineeAppraisor(String id) {
		this.id = id;
	}

	public ScheduleParTraineeAppraisor() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Par getParId() {
		return parId;
	}

	public void setParId(Par parId) {
		this.parId = parId;
	}

	public ParAppraisor getParAppraisor() {
		return parAppraisor;
	}

	public void setParAppraisor(ParAppraisor parAppraisor) {
		this.parAppraisor = parAppraisor;
	}

}
