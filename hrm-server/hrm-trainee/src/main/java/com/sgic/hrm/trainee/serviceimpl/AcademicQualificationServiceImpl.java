package com.sgic.hrm.trainee.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.hrm.commons.entity.trainee.TraineeAcademicQualification;
import com.sgic.hrm.commons.entity.trainee.ExamType;
import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.repository.trainee.TraineeAcademicQualificationRepository;
import com.sgic.hrm.commons.repository.trainee.TraineeRepository;
import com.sgic.hrm.trainee.service.AcademicQualificationService;

@Service
public class AcademicQualificationServiceImpl implements AcademicQualificationService {
  @Autowired
  private TraineeAcademicQualificationRepository traineeAcademicQualificationRepository;
  @Autowired
  private TraineeRepository traineeRepository;

  @Override
  public List<TraineeAcademicQualification> getAllAcademicQualification() {

    return traineeAcademicQualificationRepository.findAll();
  }

  @Override
  public boolean editAcademicQualification(TraineeAcademicQualification traineeAcademicQualification,
      ExamType examType, Trainee trainee, Integer id) {
    boolean editsucess = false;
    if (traineeAcademicQualificationRepository.getOne(id) != null) {
      traineeAcademicQualification.setExamType(examType);
      traineeAcademicQualification.setTrainee(trainee);
      traineeAcademicQualification.setId(id);
      traineeAcademicQualificationRepository.save(traineeAcademicQualification);
      editsucess = true;
    }
    return editsucess;
  }

  @Override
  public boolean deleteAcademicQualification(Integer id) {
    TraineeAcademicQualification traineeAcademicQualification = traineeAcademicQualificationRepository.getOne(id);
    if (traineeAcademicQualification.getId() == id) {
      traineeAcademicQualificationRepository.deleteById(id);
      return true;
    }
    return false;
  }

  @Override
  public TraineeAcademicQualification getAcademicQualificationById(int id) {
    return traineeAcademicQualificationRepository.getOne(id);
  }

  @Override
  public List<TraineeAcademicQualification> getAcademicQualificationByTraineeId(Integer uid) {
    return traineeAcademicQualificationRepository
        .findTraineeAcademicQualificationByTrainee(traineeRepository.findTraineeById(uid));
  }

  @Override
  public boolean addAcademicQualification(TraineeAcademicQualification academicqualification,
      ExamType examType, Trainee trainee) {
    academicqualification.setTrainee(trainee);
    academicqualification.setExamType(examType);
    traineeAcademicQualificationRepository.save(academicqualification);
    return true;
  }

}

