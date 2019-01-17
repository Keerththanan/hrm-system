// code done by ragulan
package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.entity.trainer.Feedback;
import com.sgic.hrm.commons.trainer.dto.FeedbackDto;

public class FeedbackMapper {
  public static FeedbackDto mapFeedbackToFeedbackDto(Feedback feedback) {
    FeedbackDto feedbackDto = new FeedbackDto();
    feedbackDto.setId(feedback.getId());
    feedbackDto.setCreatedAt(feedback.getCreatedAt());
    feedbackDto.setSuggestions(feedback.getSuggestions());
    feedbackDto.setFeedback1(feedback.getFeedback1());
    feedbackDto.setFeedback2(feedback.getFeedback2());
    feedbackDto.setFeedback3(feedback.getFeedback3());
    feedbackDto.setFeedback4(feedback.getFeedback4());
    feedbackDto.setFeedback5(feedback.getFeedback5());
    feedbackDto.setFeedback6(feedback.getFeedback6());
    feedbackDto.setFeedback7(feedback.getFeedback7());
    feedbackDto.setFeedback8(feedback.getFeedback8());
    feedbackDto.setFeedback9(feedback.getFeedback9());
    feedbackDto.setFeedback10(feedback.getFeedback10());
    feedbackDto.setFeedback11(feedback.getFeedback11());
    feedbackDto.setFeedback12(feedback.getFeedback12());
    feedbackDto.setFeedback13(feedback.getFeedback13());
    feedbackDto.setFeedback14(feedback.getFeedback14());
    feedbackDto.setFeedback15(feedback.getFeedback15());
    feedbackDto.setRate1(feedback.getRate1());
    feedbackDto.setRate2(feedback.getRate2());
    feedbackDto.setRate3(feedback.getRate3());
    feedbackDto.setRate4(feedback.getRate4());
    feedbackDto.setRate5(feedback.getRate5());
    feedbackDto.setRate6(feedback.getRate6());
    feedbackDto.setRate7(feedback.getRate7());
    feedbackDto.setRate8(feedback.getRate8());
    feedbackDto.setRate9(feedback.getRate9());
    feedbackDto.setRate10(feedback.getRate10());
    feedbackDto.setRate11(feedback.getRate11());
    feedbackDto.setRate12(feedback.getRate12());
    feedbackDto.setRate13(feedback.getRate13());
    feedbackDto.setRate14(feedback.getRate14());
    feedbackDto.setRate15(feedback.getRate15());
    feedbackDto.setTrainer(feedback.getTrainer());
    feedbackDto.setTrainee(feedback.getTrainee());

    return feedbackDto;
  }

  public static List<FeedbackDto> mapFeedbackListToFeedbackDtoList(List<Feedback> feedbackList) {
    List<FeedbackDto> feedbackDtoList = new ArrayList<FeedbackDto>();

    if (feedbackList != null) {
      for (Feedback feedback : feedbackList) {
        feedbackDtoList.add(mapFeedbackToFeedbackDto(feedback));
      }
    }
    return feedbackDtoList;
  }
}
