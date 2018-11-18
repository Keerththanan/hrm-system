package com.sgic.hrm.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.hrm.entity.ExperienceLetter;
import com.sgic.hrm.repository.ExperienceLetterRepository;

@Service
public class ExperienceLetterServiceImpl implements ExperienceLetterService{
  
  @Autowired
  ExperienceLetterRepository experienceLetterRepository;

  
  public List<ExperienceLetter> getExperienceLetter(){
    return experienceLetterRepository.findAll();
  }
}
