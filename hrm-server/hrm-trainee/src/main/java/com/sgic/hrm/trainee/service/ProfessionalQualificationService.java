package com.sgic.hrm.trainee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.trainee.ProfessionalQualification;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface ProfessionalQualificationService {

	List<ProfessionalQualification> getAllProofessionalQualificstion();
	public boolean addProfessionalQualification(ProfessionalQualification professionalQualification,Trainee trainee);
	public boolean editProfessionalQualification(Integer id,ProfessionalQualification professionalQualification,Trainee trainee);
	public boolean deleteProfessionalQualification(Integer id);
	
	Optional<ProfessionalQualification> getProfessionalQualificationalById(int id);
	List<ProfessionalQualification> getProfessionalQualificationByTraineeId(int tid);
}
