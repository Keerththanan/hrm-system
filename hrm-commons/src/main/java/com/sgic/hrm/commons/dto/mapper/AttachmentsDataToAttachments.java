package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.AttachmentsData;
import com.sgic.hrm.commons.entity.Attachments;

public class AttachmentsDataToAttachments {
	
	public static Attachments mapToAttachments(AttachmentsData attachmentsData ) {
		Attachments attachments = new Attachments();
		if (attachmentsData != null) {
			attachments.setId(attachmentsData.getId());
			attachments.setAttachment(attachmentsData.getAttachment());
			
			
			attachments.setTerminationRecord(TerminationRecordDataToTerminationRecord.mapToTerminationRecord(attachmentsData.getTerminationRecord()));
			return attachments;
		}
		return null;
	}
	
	
	public static List<Attachments> mapToAttachmentsDataList(List<AttachmentsData> attachmentsDataList) {
		List<Attachments> attachments = new ArrayList<Attachments>();

		if (attachmentsDataList != null) {
			for (AttachmentsData attachmentsData : attachmentsDataList) {
				attachments.add(mapToAttachments(attachmentsData));
			}
			return attachments;
			
		}
		return null;
		
}

}
