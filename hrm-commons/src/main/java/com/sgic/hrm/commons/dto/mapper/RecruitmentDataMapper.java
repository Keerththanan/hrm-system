package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.RecruitmentData;
import com.sgic.hrm.commons.entity.Recruitment;

public class RecruitmentDataMapper {
	private RecruitmentDataMapper() {}
	public static Recruitment recruitmentDataMapper(RecruitmentData recuitmentData) {
		Recruitment recruitment = new Recruitment();

		recruitment.setId(recuitmentData.getId());
		recruitment.setRecruitmentTypeName(recuitmentData.getRecruitmentTypeName());
		return recruitment;
	}
}
