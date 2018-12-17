package com.sgic.hrm.commons.entity.par;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ReportParAppraise", schema = "par")
public class ReportParAppraise {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="par_id")
	private Par par;

//	@OneToMany(mappedBy="reportParAppraise",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JsonIgnore
//	private List<ScoreParAppraisee> scoreParAppraiseeList;

	public ReportParAppraise(String id) {
		this.id =id;
	}
	public ReportParAppraise() {
		
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

//	public List<ScoreParAppraisee> getScoreParAppraiseeList() {
//		return scoreParAppraiseeList;
//	}
//
//	public void setScoreParAppraiseeList(List<ScoreParAppraisee> scoreParAppraiseeList) {
//		this.scoreParAppraiseeList = scoreParAppraiseeList;
//	}

}
