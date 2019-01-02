package com.sgic.hrm.trainee.service;

import java.util.List;
import com.sgic.hrm.commons.entity.trainee.TraineeAcademicQualification;
import com.sgic.hrm.commons.entity.trainee.ExamType;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public interface AcademicQualificationService {
  boolean addAcademicQualification(TraineeAcademicQualification traineeAcademicQualification, ExamType examType,
      Trainee trainee);

  List<TraineeAcademicQualification> getAllAcademicQualification();

  boolean editAcademicQualification(TraineeAcademicQualification traineeAcademicQualification, ExamType examType,
      Trainee trainee, Integer id);

  boolean deleteAcademicQualification(Integer id);

  TraineeAcademicQualification getAcademicQualificationById(int id);

  List<TraineeAcademicQualification> getAcademicQualificationByTraineeId(Integer uid);
}
