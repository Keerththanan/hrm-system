package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.DepartmentData;
import com.sgic.hrm.commons.entity.Department;

public class DepartmentMapper {
	
	public static DepartmentData departmentMapper(Department department) {
		
		DepartmentData departmentData = new DepartmentData();

		if (department != null) {
			departmentData.setId(department.getId());
			departmentData.setDepartmentName(department.getDepartmentName());
			
			return departmentData;
		}
		return null;

	}
}
