package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.InterviewScheduleData;
import com.sgic.hrm.commons.entity.InterviewSchedule;


public class InterviewScheduleMapper {

	
	public static InterviewScheduleData interviewScheduleMapper(InterviewSchedule interviewSchedule) {
		InterviewScheduleData interviewScheduleData = new InterviewScheduleData();

		if (interviewScheduleData != null) {
			interviewScheduleData.setId(interviewSchedule.getId());
			interviewScheduleData.setInterviewVenue(interviewSchedule.getInterviewVenue());
			interviewScheduleData.setInterviewTime(interviewSchedule.getInterviewTime());
			interviewScheduleData.setInterviewDate(interviewSchedule.getInterviewDate());
			
			interviewScheduleData.setApplicantDataid(ApplicantMapper.applicantMapper(interviewSchedule.getApplicantid()));
			
			return interviewScheduleData;
		}
		return null;

	}
}
