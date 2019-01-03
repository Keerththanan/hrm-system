package com.sgic.hrm.trainee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.trainee.ProfessionalMembership;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.repository.trainee.ProfessionalMembershipRepository;
import com.sgic.hrm.commons.repository.trainee.TraineeRepository;
import com.sgic.hrm.trainee.service.ProfessionalMembershipService;

@Service
public class ProfessionalMembershipServiceImpl implements ProfessionalMembershipService {
	
	@Autowired
	private ProfessionalMembershipRepository professionalMembershipRepository;
	@Autowired
	private TraineeRepository traineeRepository;
	
	
	@Override
	public List<ProfessionalMembership> getAllProfessionalMembership() {
		return professionalMembershipRepository.findAll();
	}

	@Override
	public boolean addProfessionalMembership(ProfessionalMembership professionalMembership, Trainee trainee) {
		professionalMembership.setTrainee(trainee);
		professionalMembershipRepository.save(professionalMembership);
		return true;
	}

	@Override
	public boolean editProfessionalMembership(ProfessionalMembership professionalMembership, Trainee trainee,
			Integer id) {
		if(professionalMembershipRepository.getOne(id) !=null){
			professionalMembership.setTrainee(trainee);
			professionalMembership.setId(id);
			professionalMembershipRepository.save(professionalMembership);
			return true;
			
		}
		return false;
	}

	@Override
	public boolean deleteProfessionalMembership(Integer id) {
		if(professionalMembershipRepository.getOne(id)!=null) {
			professionalMembershipRepository.deleteById(id);
			return true;
			
		}
			return false;
	}

	@Override
	public Optional<ProfessionalMembership> getProfessionalMembershipById(Integer id) {
		// TODO Auto-generated method stub
		return professionalMembershipRepository.findById(id);
	}

	@Override
	public List<ProfessionalMembership> getProfessionalMembershipByTraineeId(Integer tid) {
		// TODO Auto-generated method stub
		return professionalMembershipRepository.findProfessionalMembershipByTrainee(traineeRepository.findTraineeById(tid));
	}

}
