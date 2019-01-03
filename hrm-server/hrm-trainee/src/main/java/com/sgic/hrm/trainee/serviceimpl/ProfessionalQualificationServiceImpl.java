package com.sgic.hrm.trainee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.trainee.ProfessionalQualification;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.repository.trainee.ProfessionalQualificationRepository;
import com.sgic.hrm.commons.repository.trainee.TraineeRepository;
import com.sgic.hrm.trainee.service.ProfessionalQualificationService;

@Service
public class ProfessionalQualificationServiceImpl implements ProfessionalQualificationService {
	@Autowired
	private  ProfessionalQualificationRepository professionalQualificationRepository;
	@Autowired
	private TraineeRepository traineeRepository;
	@Override
	public List<ProfessionalQualification> getAllProofessionalQualificstion() {
		return professionalQualificationRepository.findAll();
	}

	@Override
	public boolean addProfessionalQualification(ProfessionalQualification professionalQualification, Trainee trainee) {
		professionalQualification.setTrainee(trainee);
		professionalQualificationRepository.save(professionalQualification);
		return true;
	}

	@Override
	public boolean editProfessionalQualification(Integer id, ProfessionalQualification professionalQualification,
			Trainee trainee) {
		if(professionalQualificationRepository.getOne(id) !=null) {
			professionalQualification.setTrainee(trainee);
			professionalQualification.setId(id);
			professionalQualificationRepository.save(professionalQualification);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteProfessionalQualification(Integer id) {
		if(professionalQualificationRepository.getOne(id) !=null) {
			professionalQualificationRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Optional<ProfessionalQualification> getProfessionalQualificationalById(int id) {
		return professionalQualificationRepository.findById(id);
	}

	@Override
	public List<ProfessionalQualification> getProfessionalQualificationByTraineeId(int tid) {
		return professionalQualificationRepository.findProfessionalQualificationByTrainee(traineeRepository.findTraineeById(tid));
	}

}
