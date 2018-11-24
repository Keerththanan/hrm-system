package com.sgic.hrm.commons.dto;

import com.sgic.hrm.commons.entity.Department;

public class UserDto {

  private Integer id;
  private String userName;
  private Department department;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

}
