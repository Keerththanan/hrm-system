package com.sgic.hrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.Project;
import com.sgic.hrm.repository.ProjectRepository;

@Service
public class ProjectServiceImp implements ProjectService{
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public List<Project> getProjects() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

}
