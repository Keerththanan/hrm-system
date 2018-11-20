package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.AttachmentsDto;
import com.sgic.hrm.commons.entity.Attachments;

public class AttachmentsDtoMapping {
	
	public static AttachmentsDto attachmentsToattachmentsDto(Attachments attachments ) {
		AttachmentsDto attachmentsDto = new AttachmentsDto();
		
		if(attachments != null) {
			attachmentsDto.setId(attachments.getId());
			//attachmentsDto.setTerminationRecord(attachments.getTerminationRecord());		
			attachmentsDto.setAttachment(attachments.getAttachments());
			
			return attachmentsDto;
			
		}
		return null;
	}

}
