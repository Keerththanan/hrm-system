//code done by ragulan
package com.sgic.hrm.commons.entity.trainer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback_fields", schema = "trainer")

public class FeedbackFields {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String feedback1;
  private String feedback2;
  private String feedback3;
  private String feedback4;
  private String feedback5;
  private String feedback6;
  private String feedback7;
  private String feedback8;
  private String feedback9;
  private String feedback10;
  private String feedback11;
  private String feedback12;
  private String feedback13;
  private String feedback14;
  private String feedback15;

}
