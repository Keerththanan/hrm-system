package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.AttachmentData;
import com.sgic.hrm.commons.entity.Attachment;

public class AttachmentDataToAttachment {

  public static Attachment mapToAttachments(AttachmentData attachmentsData) {
    Attachment attachments = new Attachment();
    if (attachmentsData != null) {
      attachments.setId(attachmentsData.getId());
      attachments.setAttachment(attachmentsData.getAttachment());
      attachments.setTerminationRecord(TerminationRecordDataToTerminationRecord
          .mapToTerminationRecord(attachmentsData.getTerminationRecord()));
    }
    return attachments;
  }

  public static List<Attachment> mapToAttachmentsDataList(
      List<AttachmentData> attachmentsDataList) {
    List<Attachment> attachments = new ArrayList<Attachment>();

    if (attachmentsDataList != null) {
      for (AttachmentData attachmentsData : attachmentsDataList) {
        attachments.add(mapToAttachments(attachmentsData));
      }
    }
    return attachments;
  }
}
