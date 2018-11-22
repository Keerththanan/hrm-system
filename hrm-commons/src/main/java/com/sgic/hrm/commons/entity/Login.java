package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "login", schema = "employee")
public class Login implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -3992467423727977421L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  @Column(name = "user_name", unique = true)
  @NaturalId
  String userName;

  @OneToOne
  @JoinColumn(name = "user_id")
  User user;

  @Column(name = "password")
  String password;

  @CreationTimestamp
  @Column(name = "created_at", updatable = false, nullable = false)
  ZonedDateTime createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at", nullable = false)
  ZonedDateTime updatedAt;

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

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ZonedDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(ZonedDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
