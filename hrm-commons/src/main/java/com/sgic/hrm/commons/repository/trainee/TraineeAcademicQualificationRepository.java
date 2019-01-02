package com.sgic.hrm.commons.repository.trainee;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.entity.trainee.TraineeAcademicQualification;

public interface TraineeAcademicQualificationRepository extends JpaRepository<TraineeAcademicQualification,Integer>{
	List<TraineeAcademicQualification> findTraineeAcademicQualificationByTrainee(Trainee trainee);
}
