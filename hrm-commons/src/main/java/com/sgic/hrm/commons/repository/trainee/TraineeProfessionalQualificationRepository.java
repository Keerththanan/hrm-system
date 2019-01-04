package com.sgic.hrm.commons.repository.trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.trainee.TraineeProfessionalQualification;
import com.sgic.hrm.commons.entity.trainee.Trainee;

@Repository
public interface TraineeProfessionalQualificationRepository extends JpaRepository<TraineeProfessionalQualification, Integer> {
	List<TraineeProfessionalQualification> findProfessionalQualificationByTrainee(Trainee trainee);
}
