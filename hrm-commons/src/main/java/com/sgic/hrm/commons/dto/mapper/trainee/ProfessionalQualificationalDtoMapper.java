package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.ProfessionalQualificationalDto;
import com.sgic.hrm.commons.dto.trainee.ProfessionalQualificationalSaveDto;
import com.sgic.hrm.commons.entity.trainee.ProfessionalQualification;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class ProfessionalQualificationalDtoMapper {

	public static ProfessionalQualification mapProfessionalQualificationalSaveDtoToProfessionalQualification(ProfessionalQualificationalSaveDto professionalQualificationalSaveDto) {
		ProfessionalQualification professionalQualification=new ProfessionalQualification();
		Trainee trainee=new Trainee();
		
		trainee.setId(professionalQualificationalSaveDto.getId());
		
		professionalQualification.setId(professionalQualificationalSaveDto.getId());
		professionalQualification.setCourseName(professionalQualificationalSaveDto.getCourseName());
		professionalQualification.setCourseType(professionalQualificationalSaveDto.getCourseType());
		professionalQualification.setExaminationYear(professionalQualificationalSaveDto.getExaminationYear());
		professionalQualification.setGpa(professionalQualificationalSaveDto.getGpa());
		professionalQualification.setInsituteName(professionalQualificationalSaveDto.getInsituteName());
		professionalQualification.setPeriodYearFrom(professionalQualificationalSaveDto.getPeriodYearFrom());
		professionalQualification.setPeriodYearTo(professionalQualificationalSaveDto.getPeriodYearTo());
		professionalQualification.setResult(professionalQualificationalSaveDto.getResult());
		professionalQualification.setTrainee(trainee);
		
		return professionalQualification;
		
	}
	
	public static ProfessionalQualification mapProfessionalQualificationalDtoToProfessionalQualification(ProfessionalQualificationalDto professionalQualificationalDto) {
		ProfessionalQualification professionalQualification=new ProfessionalQualification();
		
		professionalQualification.setId(professionalQualificationalDto.getId());
		professionalQualification.setCourseName(professionalQualificationalDto.getCourseName());
		professionalQualification.setCourseType(professionalQualificationalDto.getCourseType());
		professionalQualification.setExaminationYear(professionalQualificationalDto.getExaminationYear());
		professionalQualification.setGpa(professionalQualificationalDto.getGpa());
		professionalQualification.setInsituteName(professionalQualificationalDto.getInsituteName());
		professionalQualification.setPeriodYearFrom(professionalQualificationalDto.getPeriodYearFrom());
		professionalQualification.setPeriodYearTo(professionalQualificationalDto.getPeriodYearTo());
		professionalQualification.setResult(professionalQualificationalDto.getResult());
		professionalQualification.setTrainee(professionalQualificationalDto.getTrainee());
		
		return professionalQualification;
		
	}
	
}
