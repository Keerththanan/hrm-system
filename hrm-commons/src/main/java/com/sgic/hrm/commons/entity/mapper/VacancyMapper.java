package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.VacancyData;
import com.sgic.hrm.commons.entity.Vacancy;

public class VacancyMapper {
	
	public static VacancyData vacancyMapper(Vacancy vacancy) {
		VacancyData vacancyData = new VacancyData();

		if (vacancy != null) {
			
			vacancyData.setId(vacancy.getId());
			vacancyData.setNoOfVacancy(vacancy.getNoOfVacancy());
			vacancyData.setSalaryScale(vacancy.getSalaryScale());
			vacancyData.setVacancyOpenDate(vacancy.getVacancyOpenDate());
			vacancyData.setVacancyCloseDate(vacancy.getVacancyCloseDate());
			vacancyData.setInterviewDate(vacancy.getInterviewDate());
			vacancyData.setKeyRecuitment(vacancy.getKeyRecuitment());

			vacancyData.setUserid(UserMapper.userMapper(vacancy.getUserid()));
			vacancyData.setJobid(JobMapper.jobMapper(vacancy.getJobid()));
			vacancyData.setDepartmentid(DepartmentMapper.departmentMapper(vacancy.getDepartmentid()));
			vacancyData.setRecruitmentid(RecruitmentTypeMapper.recruitmentMapper(vacancy.getRecruitmentid()));
			
			return vacancyData;
		}
		return null;

	}
}
