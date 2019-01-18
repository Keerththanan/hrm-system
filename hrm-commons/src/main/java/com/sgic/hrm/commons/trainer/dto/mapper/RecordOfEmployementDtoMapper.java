package com.sgic.hrm.commons.trainer.dto.mapper;

//done by_Sujaany
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.RecordOfEmployment;
import com.sgic.hrm.commons.trainer.dto.RecordOfEmploymentDto;

public class RecordOfEmployementDtoMapper {
	public static RecordOfEmployment mapToRecordOfEmployment(RecordOfEmploymentDto recordOfEmploymentDto) {
		RecordOfEmployment recordOfEmployment = new RecordOfEmployment();
		if (recordOfEmploymentDto != null) {
			recordOfEmployment.setFromYear(recordOfEmploymentDto.getFromYear());
			recordOfEmployment.setToYear(recordOfEmploymentDto.getToYear());
			recordOfEmployment.setPeriod(recordOfEmploymentDto.getPeriod());
			recordOfEmployment.setWorkPlaceName(recordOfEmploymentDto.getWorkPlaceName());
			recordOfEmployment.setWorkPlaceAddress(recordOfEmploymentDto.getWorkPlaceAddress());
			recordOfEmployment.setPosition(recordOfEmploymentDto.getPosition());
			recordOfEmployment.setTypeOfWork(recordOfEmploymentDto.getTypeOfWork());
		}
		return recordOfEmployment;
	}

	public static List<RecordOfEmployment> mapToRecordOfEmploymentList(
			List<RecordOfEmploymentDto> recordOfEmploymentDTOList) {

		if (recordOfEmploymentDTOList != null) {
			List<RecordOfEmployment> recordOfEmploymentList = new ArrayList<RecordOfEmployment>();
			for (RecordOfEmploymentDto recordOfEmploymentDto : recordOfEmploymentDTOList) {
				recordOfEmploymentList.add(mapToRecordOfEmployment(recordOfEmploymentDto));
			}
			return recordOfEmploymentList;
		}
		return null;
	}
}
