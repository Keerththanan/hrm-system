package com.sgic.hrm.commons.trainer.entity.mapper;

//done by_Sujaany
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.RecordOfEmployment;
import com.sgic.hrm.commons.trainer.dto.RecordOfEmploymentDto;

public class RecordOfEmploymentMapper {
	public static RecordOfEmploymentDto mapToRecordOfEmploymentDTO(RecordOfEmployment recordOfEmployment) {
		RecordOfEmploymentDto recordOfEmploymentDto = new RecordOfEmploymentDto();
		if (recordOfEmployment != null) {
			recordOfEmploymentDto.setFromYear(recordOfEmployment.getFromYear());
			recordOfEmploymentDto.setToYear(recordOfEmployment.getToYear());
			recordOfEmploymentDto.setPeriod(recordOfEmployment.getPeriod());
			recordOfEmploymentDto.setWorkPlaceName(recordOfEmployment.getWorkPlaceName());
			recordOfEmploymentDto.setWorkPlaceAddress(recordOfEmployment.getWorkPlaceAddress());
			recordOfEmploymentDto.setPosition(recordOfEmployment.getPosition());
			recordOfEmploymentDto.setTypeOfWork(recordOfEmployment.getTypeOfWork());
		}
		return recordOfEmploymentDto;
	}

	public static List<RecordOfEmploymentDto> mapToRecordOfEmploymentDTOList(
			List<RecordOfEmployment> recordOfEmploymentList) {
		List<RecordOfEmploymentDto> recordOfEmploymentDto = new ArrayList<RecordOfEmploymentDto>();

		if (recordOfEmploymentList != null) {
			for (RecordOfEmployment recordOfEmployment : recordOfEmploymentList) {
				recordOfEmploymentDto.add(mapToRecordOfEmploymentDTO(recordOfEmployment));
			}
		}
		return recordOfEmploymentDto;
	}
}
