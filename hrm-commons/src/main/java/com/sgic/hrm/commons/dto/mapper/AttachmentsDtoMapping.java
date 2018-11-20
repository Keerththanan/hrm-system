package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.AttachmentsData;
import com.sgic.hrm.commons.entity.Attachments;

public class AttachmentsDtoMapping {
	
	public static AttachmentsData attachmentsToattachmentsDto(Attachments attachments ) {
		AttachmentsData attachmentsDto = new AttachmentsData();
		
		if(attachments != null) {
			attachmentsDto.setId(attachments.getId());
			//attachmentsDto.setTerminationRecord(attachments.getTerminationRecord());		
			attachmentsDto.setAttachment(attachments.getAttachments());
			
			return attachmentsDto;
			
		}
		return null;
	}

}
