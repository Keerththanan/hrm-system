package com.sgic.hrm.commons.entity.trainee;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "attend_status", schema = "trainee")
public class AttendStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8219141855019063420L;
	@Id
	private Integer id;
	private String statusName;
	@UpdateTimestamp
	private Date updateAt;

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}
