package com.sgic.hrm.commons.dto;

import java.sql.Date;

import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.WelfareEvent;

public class IndividualWelfareDto {

	private Integer Id;
	private User user;
	private WelfareEvent welfareEvent;
	private Integer amount;
	private Date date ;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public WelfareEvent getWelfareEvent() {
		return welfareEvent;
	}
	public void setWelfareEvent(WelfareEvent welfareEvent) {
		this.welfareEvent = welfareEvent;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
