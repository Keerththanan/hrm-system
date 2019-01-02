package com.sgic.hrm.commons.entity.trainee;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "attend_type", schema = "trainee")
public class AttendType implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6893112632166995105L;
	@Id
	private Integer id;
	private String attendType;
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

	public String getAttendType() {
		return attendType;
	}

	public void setAttendType(String attendType) {
		this.attendType = attendType;
	}

}
