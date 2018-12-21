package com.sgic.hrm.profile.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Role;
import com.sgic.hrm.commons.repository.RoleRepository;
import com.sgic.hrm.profile.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
	private RoleRepository roleRepository;
	@Override
	public List<Role> getRoles() {
		return roleRepository.findAll();
	}
	
}
