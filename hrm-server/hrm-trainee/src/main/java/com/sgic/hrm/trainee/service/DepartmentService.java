package com.sgic.hrm.trainee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.trainee.Department;

public interface DepartmentService {
	boolean addDepartment(Department department);

	List<Department> getAllDepartment();

	boolean editDepartment(Department department, int id);

	Department findByDepartmentId(Integer id);

	boolean deleteDepartment(int id);

}
