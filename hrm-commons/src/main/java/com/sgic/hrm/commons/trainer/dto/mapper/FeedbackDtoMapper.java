//code done by ragulan
package com.sgic.hrm.commons.trainer.dto.mapper;

import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.entity.trainer.Feedback;
import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.trainer.dto.FeedbackDto;
import com.sgic.hrm.commons.trainer.dto.FeedbackSaveDto;

public class FeedbackDtoMapper {
	public static Feedback mapFeedbackSaveDtoToFeedback(FeedbackSaveDto feedbackSaveDto) {
		Feedback feedback = new Feedback();
		Trainer trainer = new Trainer();
		Trainee trainee = new Trainee();
		
		trainer.setId(feedbackSaveDto.getTrainer());
		trainee.setId(feedbackSaveDto.getTrainee());
		
		feedback.setId(feedbackSaveDto.getId());
		feedback.setCreatedAt(feedbackSaveDto.getCreatedAt());
		feedback.setSuggestions(feedbackSaveDto.getSuggestions());
		feedback.setFeedback1(feedbackSaveDto.getFeedback1());
		feedback.setFeedback2(feedbackSaveDto.getFeedback2());
		feedback.setFeedback3(feedbackSaveDto.getFeedback3());
		feedback.setFeedback4(feedbackSaveDto.getFeedback4());
		feedback.setFeedback5(feedbackSaveDto.getFeedback5());
		feedback.setFeedback6(feedbackSaveDto.getFeedback6());
		feedback.setFeedback7(feedbackSaveDto.getFeedback7());
		feedback.setFeedback8(feedbackSaveDto.getFeedback8());
		feedback.setFeedback9(feedbackSaveDto.getFeedback9());
		feedback.setFeedback10(feedbackSaveDto.getFeedback10());
		feedback.setFeedback11(feedbackSaveDto.getFeedback11());
		feedback.setFeedback12(feedbackSaveDto.getFeedback12());
		feedback.setFeedback13(feedbackSaveDto.getFeedback13());
		feedback.setFeedback14(feedbackSaveDto.getFeedback14());
		feedback.setFeedback15(feedbackSaveDto.getFeedback15());
		feedback.setRate1(feedbackSaveDto.getRate1());
		feedback.setRate2(feedbackSaveDto.getRate2());
		feedback.setRate3(feedbackSaveDto.getRate3());
		feedback.setRate4(feedbackSaveDto.getRate4());
		feedback.setRate5(feedbackSaveDto.getRate5());
		feedback.setRate6(feedbackSaveDto.getRate6());
		feedback.setRate7(feedbackSaveDto.getRate7());
		feedback.setRate8(feedbackSaveDto.getRate8());
		feedback.setRate9(feedbackSaveDto.getRate9());
		feedback.setRate10(feedbackSaveDto.getRate10());
		feedback.setRate11(feedbackSaveDto.getRate11());
		feedback.setRate12(feedbackSaveDto.getRate12());
		feedback.setRate13(feedbackSaveDto.getRate13());
		feedback.setRate14(feedbackSaveDto.getRate14());
		feedback.setRate15(feedbackSaveDto.getRate15());
		feedback.setTrainer(trainer);
		feedback.setTrainee(trainee);
		
		return feedback;
	}
	public static Feedback mapFeedbackDtoToFeedback(FeedbackDto feedbackDto) {
		Feedback feedback = new Feedback();
		
		feedback.setId(feedbackDto.getId());
		feedback.setCreatedAt(feedbackDto.getCreatedAt());
		feedback.setSuggestions(feedbackDto.getSuggestions());
		feedback.setFeedback1(feedbackDto.getFeedback1());
		feedback.setFeedback2(feedbackDto.getFeedback2());
		feedback.setFeedback3(feedbackDto.getFeedback3());
		feedback.setFeedback4(feedbackDto.getFeedback4());
		feedback.setFeedback5(feedbackDto.getFeedback5());
		feedback.setFeedback6(feedbackDto.getFeedback6());
		feedback.setFeedback7(feedbackDto.getFeedback7());
		feedback.setFeedback8(feedbackDto.getFeedback8());
		feedback.setFeedback9(feedbackDto.getFeedback9());
		feedback.setFeedback10(feedbackDto.getFeedback10());
		feedback.setFeedback11(feedbackDto.getFeedback11());
		feedback.setFeedback12(feedbackDto.getFeedback12());
		feedback.setFeedback13(feedbackDto.getFeedback13());
		feedback.setFeedback14(feedbackDto.getFeedback14());
		feedback.setFeedback15(feedbackDto.getFeedback15());
		feedback.setRate1(feedbackDto.getRate1());
		feedback.setRate2(feedbackDto.getRate2());
		feedback.setRate3(feedbackDto.getRate3());
		feedback.setRate4(feedbackDto.getRate4());
		feedback.setRate5(feedbackDto.getRate5());
		feedback.setRate6(feedbackDto.getRate6());
		feedback.setRate7(feedbackDto.getRate7());
		feedback.setRate8(feedbackDto.getRate8());
		feedback.setRate9(feedbackDto.getRate9());
		feedback.setRate10(feedbackDto.getRate10());
		feedback.setRate11(feedbackDto.getRate11());
		feedback.setRate12(feedbackDto.getRate12());
		feedback.setRate13(feedbackDto.getRate13());
		feedback.setRate14(feedbackDto.getRate14());
		feedback.setRate15(feedbackDto.getRate15());
		feedback.setTrainer(feedbackDto.getTrainer());
		feedback.setTrainee(feedbackDto.getTrainee());
		
		return feedback;
		
	}

}
