package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.ApplicantData;
import com.sgic.hrm.commons.entity.Applicant;

public class ApplicantDataMapper {
public ApplicantDataMapper() {
		
	}
	public static Applicant applicantDataMapper(ApplicantData applicantData) {
		Applicant applicant = new Applicant();

		applicant.setId(applicantData.getId());
		applicant.setFullName(applicantData.getFullName());
		applicant.setNic(applicantData.getNic());
		applicant.setEmail(applicantData.getEmail());
		applicant.setDateOfBirth(applicantData.getDateOfBirth());
		applicant.setAddress(applicantData.getAddress());
		applicant.setCvFile(applicantData.getCvFile());
	    
		applicant.setHighestQualificationid(HighestQualificationDataMapper.highestQualificationDataMapper(applicantData.getHighestQualificationDataid()));
		applicant.setDistrictid(DistrictDataMapper.districtDataMapper(applicantData.getDistrictDataid()));
		applicant.setJobid(JobDataMapper.jobDataMapper(applicantData.getJobDataid()));
		
	    return applicant;
	  }


}
