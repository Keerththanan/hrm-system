package com.sgic.hrm.commons.entity.mapper.profile;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.profile.ProfessionalQualificationDto;
import com.sgic.hrm.commons.entity.ProfessionalQualification;

public class ProfessionalQualificationMapper {
	public static ProfessionalQualificationDto mapProfessionalQualificationToProfessionalDto(ProfessionalQualification professionalQualification) {
		ProfessionalQualificationDto professionalQualificationDto=new ProfessionalQualificationDto();
		
		professionalQualificationDto.setId(professionalQualification.getId());
		professionalQualificationDto.setCourseName(professionalQualification.getCourseName());
		professionalQualificationDto.setCourseType(professionalQualification.getInsituteName());
		professionalQualificationDto.setGpa(professionalQualification.getGpa());
		professionalQualificationDto.setInsituteName(professionalQualification.getInsituteName());
		professionalQualificationDto.setResult(professionalQualification.getResult());
		professionalQualificationDto.setPeriodYearFrom(professionalQualification.getPeriodYearFrom());
		professionalQualificationDto.setPeriodYearTo(professionalQualification.getPeriodYearTo());
		professionalQualificationDto.setExaminationYear(professionalQualification.getExaminationYear());
		professionalQualificationDto.setUser(professionalQualification.getUser());
		
		return professionalQualificationDto;
	}
	
	public static List<ProfessionalQualificationDto> mapProfessionalQualificationListToProfessionalQualificationDtoList(List<ProfessionalQualification> professionalQualificationList){
		List<ProfessionalQualificationDto> professionalQualificationDtoList=new ArrayList<ProfessionalQualificationDto>();
		if(professionalQualificationList !=null) {
			for(ProfessionalQualification professionalQualification:professionalQualificationList)
				professionalQualificationDtoList.add(mapProfessionalQualificationToProfessionalDto(professionalQualification));
		}
		return professionalQualificationDtoList;
	}
}
