package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.RecordOfEmployment;
import com.sgic.hrm.commons.trainer.dto.RecordOfEmploymentDTO;

public class RecordOfEmploymentMapper {
	
	public static RecordOfEmploymentDTO mapToRecordOfEmploymentDTO(RecordOfEmployment recordOfEmployment) {
		RecordOfEmploymentDTO recordOfEmploymentDTO = new RecordOfEmploymentDTO();
		if (recordOfEmployment != null) {
			recordOfEmploymentDTO.setFromYear(recordOfEmployment.getFromYear());
			recordOfEmploymentDTO.setToYear(recordOfEmployment.getToYear());
			recordOfEmploymentDTO.setPeriod(recordOfEmployment.getPeriod());
			recordOfEmploymentDTO.setWorkPlaceName(recordOfEmployment.getWorkPlaceName());
			recordOfEmploymentDTO.setWorkPlaceAddress(recordOfEmployment.getWorkPlaceAddress());
			recordOfEmploymentDTO.setPosition(recordOfEmployment.getPosition());
			recordOfEmploymentDTO.setTypeOfWork(recordOfEmployment.getTypeOfWork());
			
		}
		return recordOfEmploymentDTO;
	}
		  public static List<RecordOfEmploymentDTO> mapToRecordOfEmploymentDTOList(
			      List<RecordOfEmployment> recordOfEmploymentList) {
			    List<RecordOfEmploymentDTO> recordOfEmploymentDTO = new ArrayList<RecordOfEmploymentDTO>();
		
			    if (recordOfEmploymentList != null) {
			      for (RecordOfEmployment recordOfEmployment : recordOfEmploymentList) {
			    	  recordOfEmploymentDTO.add(mapToRecordOfEmploymentDTO(recordOfEmployment));
			      }
			    }
			    return recordOfEmploymentDTO;
			  }
			}


