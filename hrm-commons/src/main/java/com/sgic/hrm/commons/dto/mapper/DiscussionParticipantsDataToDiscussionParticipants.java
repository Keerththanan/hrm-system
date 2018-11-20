package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.DiscussionParticipantsData;
import com.sgic.hrm.commons.entity.DiscussionParticipants;

public class DiscussionParticipantsDataToDiscussionParticipants {
	
	public static DiscussionParticipants mapToDiscussionPaticipants(DiscussionParticipantsData discussionParticipantsData ) {
		DiscussionParticipants discussionParticipants = new DiscussionParticipants();
		if (discussionParticipantsData != null) {
			discussionParticipants.setId(discussionParticipantsData.getId());
			discussionParticipants.setParticipant(UserDataToUser.mapToUser(discussionParticipantsData.getEmployee()));
			discussionParticipants.setDiscussionSchedule(DiscussionScheduleDataToDiscussionSchedule.mapToDiscussionSchedule(discussionParticipantsData.getDiscussionSchedule()));
			return discussionParticipants;
		}
		return null;
	}
	
	public static List<DiscussionParticipants> mapToDiscussionParticipantsList(List<DiscussionParticipantsData> discussionParticipantsList) {
		List<DiscussionParticipants> discussionParticipants = new ArrayList<DiscussionParticipants>();

		if (discussionParticipantsList != null) {
			for (DiscussionParticipantsData discussionParticipantsData : discussionParticipantsList) {
				discussionParticipants.add(mapToDiscussionPaticipants(discussionParticipantsData));
			}
			return discussionParticipants;
			
		}
		return null;
		
}
	

}
