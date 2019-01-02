package com.sgic.hrm.commons.repository.trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.entity.trainee.TraineeWorkExperience;
@Repository
public interface WorkExperienceRepository  extends JpaRepository<TraineeWorkExperience, Integer>{
	List<TraineeWorkExperience>findWorkExperienceByTrainee(Trainee trainee);
}
