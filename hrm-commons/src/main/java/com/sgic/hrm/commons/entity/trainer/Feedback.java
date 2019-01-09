package com.sgic.hrm.commons.entity.trainer;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.sgic.hrm.commons.entity.trainee.Trainee;

@Entity
@Table(name="feedback",schema="trainer")

public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String suggestions;
	private String feedback1;
	private Integer Rate1;
	private String feedback2;
	private Integer Rate2;
	private String feedback3;
	private Integer Rate3;
	private String feedback4;
	private Integer Rate4;
	private String feedback5;
	private Integer Rate5;
	private String feedback6;
	private Integer Rate6;
	private String feedback7;
	private Integer Rate7;
	private String feedback8;
	private Integer Rate8;
	private String feedback9;
	private Integer Rate9;
	private String feedback10;
	private Integer Rate10;
	private String feedback11;
	private Integer Rate11;
	private String feedback12;
	private Integer Rate12;
	private String feedback13;
	private Integer Rate13;
	private String feedback14;
	private Integer Rate14;
	private String feedback15;
	private Integer Rate15;
	
	
	@CreationTimestamp
	private Date createdAt;
	
	@ManyToOne
	@JoinColumn(name="trainer")
	private Trainer trainer;
	
	@ManyToOne
	@JoinColumn(name="trainee")
	private Trainee trainee;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	public String getFeedback1() {
		return feedback1;
	}

	public void setFeedback1(String feedback1) {
		this.feedback1 = feedback1;
	}

	public Integer getRate1() {
		return Rate1;
	}

	public void setRate1(Integer rate1) {
		Rate1 = rate1;
	}

	public String getFeedback2() {
		return feedback2;
	}

	public void setFeedback2(String feedback2) {
		this.feedback2 = feedback2;
	}

	public Integer getRate2() {
		return Rate2;
	}

	public void setRate2(Integer rate2) {
		Rate2 = rate2;
	}

	public String getFeedback3() {
		return feedback3;
	}

	public void setFeedback3(String feedback3) {
		this.feedback3 = feedback3;
	}

	public Integer getRate3() {
		return Rate3;
	}

	public void setRate3(Integer rate3) {
		Rate3 = rate3;
	}

	public String getFeedback4() {
		return feedback4;
	}

	public void setFeedback4(String feedback4) {
		this.feedback4 = feedback4;
	}

	public Integer getRate4() {
		return Rate4;
	}

	public void setRate4(Integer rate4) {
		Rate4 = rate4;
	}

	public String getFeedback5() {
		return feedback5;
	}

	public void setFeedback5(String feedback5) {
		this.feedback5 = feedback5;
	}

	public Integer getRate5() {
		return Rate5;
	}

	public void setRate5(Integer rate5) {
		Rate5 = rate5;
	}

	public String getFeedback6() {
		return feedback6;
	}

	public void setFeedback6(String feedback6) {
		this.feedback6 = feedback6;
	}

	public Integer getRate6() {
		return Rate6;
	}

	public void setRate6(Integer rate6) {
		Rate6 = rate6;
	}

	public String getFeedback7() {
		return feedback7;
	}

	public void setFeedback7(String feedback7) {
		this.feedback7 = feedback7;
	}

	public Integer getRate7() {
		return Rate7;
	}

	public void setRate7(Integer rate7) {
		Rate7 = rate7;
	}

	public String getFeedback8() {
		return feedback8;
	}

	public void setFeedback8(String feedback8) {
		this.feedback8 = feedback8;
	}

	public Integer getRate8() {
		return Rate8;
	}

	public void setRate8(Integer rate8) {
		Rate8 = rate8;
	}

	public String getFeedback9() {
		return feedback9;
	}

	public void setFeedback9(String feedback9) {
		this.feedback9 = feedback9;
	}

	public Integer getRate9() {
		return Rate9;
	}

	public void setRate9(Integer rate9) {
		Rate9 = rate9;
	}

	public String getFeedback10() {
		return feedback10;
	}

	public void setFeedback10(String feedback10) {
		this.feedback10 = feedback10;
	}

	public Integer getRate10() {
		return Rate10;
	}

	public void setRate10(Integer rate10) {
		Rate10 = rate10;
	}

	public String getFeedback11() {
		return feedback11;
	}

	public void setFeedback11(String feedback11) {
		this.feedback11 = feedback11;
	}

	public Integer getRate11() {
		return Rate11;
	}

	public void setRate11(Integer rate11) {
		Rate11 = rate11;
	}

	public String getFeedback12() {
		return feedback12;
	}

	public void setFeedback12(String feedback12) {
		this.feedback12 = feedback12;
	}

	public Integer getRate12() {
		return Rate12;
	}

	public void setRate12(Integer rate12) {
		Rate12 = rate12;
	}

	public String getFeedback13() {
		return feedback13;
	}

	public void setFeedback13(String feedback13) {
		this.feedback13 = feedback13;
	}

	public Integer getRate13() {
		return Rate13;
	}

	public void setRate13(Integer rate13) {
		Rate13 = rate13;
	}

	public String getFeedback14() {
		return feedback14;
	}

	public void setFeedback14(String feedback14) {
		this.feedback14 = feedback14;
	}

	public Integer getRate14() {
		return Rate14;
	}

	public void setRate14(Integer rate14) {
		Rate14 = rate14;
	}

	public String getFeedback15() {
		return feedback15;
	}

	public void setFeedback15(String feedback15) {
		this.feedback15 = feedback15;
	}

	public Integer getRate15() {
		return Rate15;
	}

	public void setRate15(Integer rate15) {
		Rate15 = rate15;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
	
	

}
