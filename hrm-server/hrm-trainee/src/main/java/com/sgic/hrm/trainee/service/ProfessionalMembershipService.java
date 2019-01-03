package com.sgic.hrm.trainee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.trainee.ProfessionalMembership;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface ProfessionalMembershipService {
	List<ProfessionalMembership> getAllProfessionalMembership();
	boolean addProfessionalMembership(ProfessionalMembership professionalMembership,Trainee trainee);
	boolean editProfessionalMembership(ProfessionalMembership professionalMembership,Trainee trainee,Integer id);
	boolean deleteProfessionalMembership(Integer id);
	
	Optional<ProfessionalMembership> getProfessionalMembershipById(Integer id);
	List<ProfessionalMembership> getProfessionalMembershipByTraineeId(Integer tid);
}
