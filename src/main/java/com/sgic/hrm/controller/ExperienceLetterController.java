package com.sgic.hrm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.entity.ExperienceLetter;
import com.sgic.hrm.service.ExperienceLetterService;

@RestController
public class ExperienceLetterController {

  @Autowired
  ExperienceLetterService experienceLetterService;
  
  @GetMapping("/exletter")
  public List<ExperienceLetter> getExperienceLetter(){
    return experienceLetterService.getExperienceLetter();
  }
}
