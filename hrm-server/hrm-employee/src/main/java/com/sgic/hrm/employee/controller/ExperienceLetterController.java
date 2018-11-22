package com.sgic.hrm.employee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.commons.entity.ExperienceLetter;
import com.sgic.hrm.employee.service.ExperienceLetterService;

@RestController
public class ExperienceLetterController {

  @Autowired
  private ExperienceLetterService experienceLetterService;

  @GetMapping("/experience-letter")
  public List<ExperienceLetter> getGenerateLetter() {
    return experienceLetterService.getExperienceLetter();
  }

  @PostMapping("/experience-letter")
  public void postRejectReason(@RequestBody ExperienceLetter generateLetter) {
    experienceLetterService.createExperienceLetter(generateLetter);
  }

  @PutMapping("/experience-letter/{id}")
  public void editGenerateLetter(@RequestBody ExperienceLetter experienceLetter,
      @PathVariable Integer id) {
    experienceLetterService.updateExperienceLetter(experienceLetter, id);
  }
  
}
