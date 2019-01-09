package com.sgic.hrm.commons.trainer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.entity.trainer.Feedback;
import com.sgic.hrm.commons.entity.trainer.Trainer;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>
{
List<Feedback> findTraineeByTrainee(Trainee trainee);
List<Feedback> findTrainerByTrainer(Trainer trainer);
}
