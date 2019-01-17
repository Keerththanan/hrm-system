package com.sgic.hrm.commons.dto.trainee;

import java.util.Date;
import com.sgic.hrm.commons.entity.trainee.TraineeExamType;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class TraineeAcademicQualificationDto {
	private Integer id;
	private Trainee trainee;
	private TraineeExamType traineeExamType;
	private Integer periodYearFrom;
	private Integer periodYearTo;
	private String schoolName;
	private String result;
	private Integer examinationYear;
	private Date createdAt;
	private Date updatedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public TraineeExamType getExamType() {
		return traineeExamType;
	}

	public void setExamType(TraineeExamType traineeExamType) {
		this.traineeExamType = traineeExamType;
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

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getExaminationYear() {
		return examinationYear;
	}

	public void setExaminationYear(Integer examinationYear) {
		this.examinationYear = examinationYear;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
