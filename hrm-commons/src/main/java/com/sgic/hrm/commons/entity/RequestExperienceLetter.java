package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "request_experience_letter", schema = "employee")
public class RequestExperienceLetter implements Serializable{

  private static final long serialVersionUID = 4064807072781709213L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
    
    @OneToOne
    @JoinColumn(name="user_id")
    User user;
    Integer noOfCopy;
    String reason;
    String competency;
    ZonedDateTime createdAt;
    String status;

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public User getUser() {
      return user;
    }

    public void setUser(User user) {
      this.user = user;
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