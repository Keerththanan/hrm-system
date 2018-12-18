package com.sgic.hrm.commons.entity.par;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ReportParTraineeAppraise", schema = "par")
public class ReportParTraineeAppraise {
	@Id
	private String id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="par_id")
	private Par par;


	public ReportParTraineeAppraise(String id) {
		this.id =id;
	}
	public ReportParTraineeAppraise() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Par getPar() {
		return par;
	}
	public void setPar(Par par) {
		this.par = par;
	}

	
}
