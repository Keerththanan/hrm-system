/*
 * this dto only include request experience letter table fields only.
 * this dto will not include any foreign key related information. 
 * only foreign key id created in this dto.
 * using for POST HttpMethod
 */
package com.sgic.hrm.commons.dto;

import java.time.ZonedDateTime;

public class RequestExperienceLetterDto {

  private Integer id;
  private Integer userId;
  private Integer noOfCopy;
  private String reason;
  private String competency;
  private ZonedDateTime createdAt;
  private String status;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getNoOfCopy() {
    return noOfCopy;
  }

  public void setNoOfCopy(Integer noOfCopy) {
    this.noOfCopy = noOfCopy;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public String getCompetency() {
    return competency;
  }

  public void setCompetency(String competency) {
    this.competency = competency;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
