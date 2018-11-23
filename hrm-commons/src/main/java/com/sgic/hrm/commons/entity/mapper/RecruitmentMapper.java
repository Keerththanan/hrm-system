package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.RecruitmentData;
import com.sgic.hrm.commons.entity.Recruitment;

public class RecruitmentMapper {
	private RecruitmentMapper() {}
	public static RecruitmentData recruitmentMapper(Recruitment recruitment) {
		RecruitmentData recruitmentData = new RecruitmentData();

		if (recruitment != null) {
			recruitmentData.setId(recruitment.getId());
			recruitmentData.setRecruitmentTypeName(recruitment.getRecruitmentTypeName());
			
			return recruitmentData;
		}
		return null;

	}
}
