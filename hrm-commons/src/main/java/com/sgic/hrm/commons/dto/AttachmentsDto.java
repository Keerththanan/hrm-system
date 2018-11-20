package com.sgic.hrm.commons.dto;

import java.io.File;

public class AttachmentsDto {

  Integer id;
  TerminationRecordDto terminationRecord;
  File attachment;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TerminationRecordDto getTerminationRecord() {
    return terminationRecord;
  }

  public void setTerminationRecord(TerminationRecordDto terminationRecord) {
    this.terminationRecord = terminationRecord;
  }

  public File getAttachment() {
    return attachment;
  }

  public void setAttachment(File attachment) {
    this.attachment = attachment;
  }

}
