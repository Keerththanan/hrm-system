package com.sgic.hrm.trainer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.trainer.Feedback;
import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.repository.trainee.TraineeRepository;
import com.sgic.hrm.commons.trainer.repository.FeedbackRepository;
import com.sgic.hrm.commons.trainer.repository.TrainerRepository;
import com.sgic.hrm.trainer.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@Autowired
	private TraineeRepository traineeRepository;
	
	@Autowired
	private TrainerRepository trainerRepository;
	
	@Override
	public List<Feedback> getFeedback() {
		return feedbackRepository.findAll();
	}

	@Override
	public boolean createFeedback(Feedback feedback) {
		feedbackRepository.save(feedback);
		return true;
	}

	@Override
	public List<Feedback> getTraineeByTraineeId(Integer id) {
		return feedbackRepository.findTraineeByTrainee(traineeRepository.findTraineeById(id));
	}

	@Override
	public List<Trainer> getTrainer() {
		return trainerRepository.findAll();
	}

//	@Override
//	public List<Feedback> getTrainerByUsername(String username) {
//		return feedbackRepository.findTrainerByTrainer(trainerRepository.findTrainerByUserName(username));
//		
//	}

//	@Override
//	public List<Feedback> getTrainerByTrainerId(Integer id) {
//		return feedbackRepository.findTrainerByTrainer(trainerRepository.findTrainerById(id));
//	}

}
