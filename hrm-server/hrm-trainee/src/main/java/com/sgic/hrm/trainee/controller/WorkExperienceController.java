package com.sgic.hrm.trainee.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.commons.dto.mapper.trainee.WorkExperienceDTOToWorkExperience;
import com.sgic.hrm.commons.dto.trainee.WorkExperienceDto;
import com.sgic.hrm.commons.dto.trainee.WorkExperienceSaveDto;
import com.sgic.hrm.commons.entity.mapper.trainee.WorkExperienceMapper;
import com.sgic.hrm.trainee.service.TraineeService;
import com.sgic.hrm.trainee.service.WorkExperienceService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class WorkExperienceController {
  @Autowired
  private WorkExperienceService workExperienceService;

  @Autowired
  private TraineeService traineeService;

  @PostMapping("/workexperience")
  public HttpStatus addWorkExperience(
      @Valid @RequestBody WorkExperienceSaveDto workExperienceSaveDto) {
    if (workExperienceService.addWorkExperience(
        WorkExperienceDTOToWorkExperience.map(workExperienceSaveDto),
        traineeService.findTraineeById(workExperienceSaveDto.getTrainee()))) {
      return HttpStatus.CREATED;
    }
    return HttpStatus.BAD_REQUEST;
  }

  @PutMapping("/workexperience/{id}")
  public HttpStatus modifyworkexperience(@PathVariable Integer id,
      @RequestBody WorkExperienceSaveDto workExperienceSaveDto) {
    if (workExperienceService.editWorkExperience(
        WorkExperienceDTOToWorkExperience.map(workExperienceSaveDto),
        traineeService.findTraineeById(workExperienceSaveDto.getTrainee()), id)) {
      return HttpStatus.CREATED;
    }
    return HttpStatus.BAD_REQUEST;
  }

  @GetMapping("/workexperience")
  public ResponseEntity<List<WorkExperienceDto>> getWorkExperience() {
    return new ResponseEntity<>(WorkExperienceMapper.mapWorkExperienceListToWorkExperienceDtoList(
        workExperienceService.getAllWorkExperience()), HttpStatus.OK);
  }

  @GetMapping("/workexperience/{uid}")
  public ResponseEntity<List<WorkExperienceDto>> getworkExperiencesByUserId(
      @PathVariable("uid") Integer id) {
    return new ResponseEntity<>(WorkExperienceMapper.mapWorkExperienceListToWorkExperienceDtoList(
        workExperienceService.getWorkExperienceByTraineeId(id)), HttpStatus.OK);
  }

  @DeleteMapping("/workexperience/{id}")
  public HttpStatus deleteWorkexperience(@PathVariable Integer id) {
    if (workExperienceService.deleteWorkExperience(id)) {
      return HttpStatus.ACCEPTED;
    }
    return HttpStatus.BAD_REQUEST;
  }

}
