package com.sgic.hrm.commons.trainer.dto;

//done by_Sujaany
import com.sgic.hrm.commons.dto.UserData;

public class UserTrainerData {
	private int id;
	private UserData user;
	private String position;
	private String specializedArea;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserData getUser() {
		return user;
	}

	public void setUser(UserData user) {
		this.user = user;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSpecializedArea() {
		return specializedArea;
	}

	public void setSpecializedArea(String specializedArea) {
		this.specializedArea = specializedArea;
	}
}
