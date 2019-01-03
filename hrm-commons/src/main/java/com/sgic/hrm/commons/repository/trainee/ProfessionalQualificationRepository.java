package com.sgic.hrm.commons.repository.trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.trainee.ProfessionalQualification;
import com.sgic.hrm.commons.entity.trainee.Trainee;

@Repository
public interface ProfessionalQualificationRepository extends JpaRepository<ProfessionalQualification, Integer> {
	List<ProfessionalQualification> findProfessionalQualificationByTrainee(Trainee trainee);
}
