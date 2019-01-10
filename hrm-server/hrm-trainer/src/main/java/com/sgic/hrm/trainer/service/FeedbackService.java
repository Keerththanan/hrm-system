package com.sgic.hrm.trainer.service;

import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Feedback;
import com.sgic.hrm.commons.entity.trainer.Trainer;

public interface FeedbackService {
public List<Feedback> getFeedback();
public boolean createFeedback(Feedback feedback);
public List<Feedback> getTraineeByTraineeId(Integer id);
//public List<Feedback> getTrainerByTrainerId(Integer id);
//List<Feedback> getTrainerByUsername(String username);
public List<Trainer> getTrainer();
}
