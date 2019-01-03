package com.sgic.hrm.trainee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.trainee.Department;
import com.sgic.hrm.commons.repository.trainee.DepartmentRepository;
import com.sgic.hrm.trainee.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public boolean addDepartment(Department department) {
		departmentRepository.save(department);
		return true;
	}

	@Override
	public List<Department> getAllDepartment() {
		return departmentRepository.findAll();
	}

	@Override
	public boolean editDepartment(Department department, int id) {
		if (departmentRepository.getOne(id) != null) {
			departmentRepository.save(department);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteDepartment(int id) {
		if (departmentRepository.getOne(id) != null) {
			departmentRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Department findByDepartmentId(Integer id) {
		return departmentRepository.findDepartmentById(id);
	}

}
