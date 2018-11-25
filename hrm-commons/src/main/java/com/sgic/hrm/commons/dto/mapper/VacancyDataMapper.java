package com.sgic.hrm.commons.dto.mapper;


import com.sgic.hrm.commons.dto.VacancyData;
import com.sgic.hrm.commons.entity.Vacancy;

public class VacancyDataMapper {
	private VacancyDataMapper() {}
	public static Vacancy  vacancyDataMapper(VacancyData vacancyData) {
		Vacancy vacancy = new Vacancy();

		vacancy.setId(vacancyData.getId());
//		vacancy.setHiring_officer(vacancyDto.getHiring_officer());
		vacancy.setNoOfVacancy(vacancyData.getNoOfVacancy());
		vacancy.setSalaryScale(vacancyData.getSalaryScale());
		vacancy.setVacancyOpenDate(vacancyData.getVacancyOpenDate());
		vacancy.setVacancyCloseDate(vacancyData.getVacancyCloseDate());
		vacancy.setInterviewDate(vacancyData.getInterviewDate());
		vacancy.setKeyRecuitment(vacancyData.getKeyRecuitment());
		

		vacancy.setUserid(UserDataMapper.userDataMapper(vacancyData.getUserid()));
		vacancy.setJobid(JobDataMapper.jobDataMapper(vacancyData.getJobid()));
		vacancy.setDepartmentid(DepartmentDataMapper.departmentDataMapper(vacancyData.getDepartmentid()));
		vacancy.setRecruitmentid(RecruitmentTypeDataMapper.recruitmentDataMapper(vacancyData.getRecruitmentid()));
		
		
		return vacancy;
	    
}
	
}
