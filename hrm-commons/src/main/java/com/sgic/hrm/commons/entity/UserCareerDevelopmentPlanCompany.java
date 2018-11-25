package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserCareerDevelopmentPlanCompany implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = -4376620260289231972L;
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
//  @ManyToOne(cascade= {CascadeType.PERSIST})
//  @JoinColumn(name="cdp_Id")
  private String cdpName;
  
//  @ManyToOne(cascade= {CascadeType.PERSIST})
//  @JoinColumn(name="user_Id")
  private String userName;
  private String status;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  } 
  public String getCdpName() {
    return cdpName;
  }
  public void setCdpName(String cdpName) {
    this.cdpName = cdpName;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
}
