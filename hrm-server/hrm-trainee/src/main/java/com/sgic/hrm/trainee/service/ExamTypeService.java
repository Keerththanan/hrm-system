package com.sgic.hrm.trainee.service;

import java.util.List;
import com.sgic.hrm.commons.entity.trainee.ExamType;

public interface ExamTypeService {
  boolean addExamType(ExamType examtype);

  List<ExamType> getAllExamType();

  ExamType findByExamTypeId(Integer id);

  boolean editExamType(ExamType examtype, Integer id);

  boolean deleteExamType(Integer id);
}
