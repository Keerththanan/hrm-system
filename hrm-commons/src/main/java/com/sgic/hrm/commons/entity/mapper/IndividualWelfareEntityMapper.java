package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.IndividualWelfareDto;
import com.sgic.hrm.commons.entity.IndividualWelfare;

public class IndividualWelfareEntityMapper {

	public static IndividualWelfareDto mapIndividualWelfareEntityToIndividualWelfareDto(
			IndividualWelfare individualWelfare) {
		IndividualWelfareDto individualWelfareDto = new IndividualWelfareDto();

		individualWelfareDto.setId(individualWelfare.getId());
		individualWelfareDto.setAmount(individualWelfare.getAmount());
		individualWelfareDto.setDate(individualWelfare.getDate());
		individualWelfareDto.setUser(individualWelfare.getUser());
		individualWelfareDto.setWelfareEvent(individualWelfare.getWelfareEvent());

		return individualWelfareDto;
	}

	public static List<IndividualWelfareDto> mapIndividualWelfareEntityListToIndividualWelfareDtoList(
			List<IndividualWelfare> individualWelfareList) {

		List<IndividualWelfareDto> individualWelfareDtoList = new ArrayList<IndividualWelfareDto>();

		if (individualWelfareList != null) {
			for (IndividualWelfare individualWelfare : individualWelfareList) {
				individualWelfareDtoList.add(mapIndividualWelfareEntityToIndividualWelfareDto(individualWelfare));
			}
		}
		return individualWelfareDtoList;
	}
}
