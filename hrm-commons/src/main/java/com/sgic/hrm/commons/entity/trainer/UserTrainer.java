package com.sgic.hrm.commons.entity.trainer;

//done by_Sujaany
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sgic.hrm.commons.entity.User;

@Entity
@Table(name = "userTrainer", schema = "trainer")

public class UserTrainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	private String position;
	private String specializedArea;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
