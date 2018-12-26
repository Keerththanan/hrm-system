package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.RecordOfEmployment;
import com.sgic.hrm.commons.trainer.dto.RecordOfEmploymentDTO;

public class RecordOfEmployementDTOMapper {
	
	public static RecordOfEmployment mapToRecordOfEmployment(RecordOfEmploymentDTO recordOfEmploymentDTO) {
		RecordOfEmployment recordOfEmployment = new RecordOfEmployment();
		if (recordOfEmploymentDTO != null) {
			recordOfEmployment.setFromYear(recordOfEmploymentDTO.getFromYear());
			recordOfEmployment.setToYear(recordOfEmploymentDTO.getToYear());
			recordOfEmployment.setPeriod(recordOfEmploymentDTO.getPeriod());
			recordOfEmployment.setWorkPlaceName(recordOfEmploymentDTO.getWorkPlaceName());
			recordOfEmployment.setWorkPlaceAddress(recordOfEmploymentDTO.getWorkPlaceAddress());
			recordOfEmployment.setPosition(recordOfEmploymentDTO.getPosition());
			recordOfEmployment.setTypeOfWork(recordOfEmploymentDTO.getTypeOfWork());
			
		}
		return recordOfEmployment;
	}
		  public static List<RecordOfEmployment> mapToRecordOfEmploymentList(
			      List<RecordOfEmploymentDTO> recordOfEmploymentDTOList) {
			    
			    if (recordOfEmploymentDTOList != null) {
			    	List<RecordOfEmployment> recordOfEmploymentList = new ArrayList<RecordOfEmployment>();
			      for (RecordOfEmploymentDTO recordOfEmploymentDTO : recordOfEmploymentDTOList) {
			    	  recordOfEmploymentList.add(mapToRecordOfEmployment(recordOfEmploymentDTO));
			   
			    }
			    return recordOfEmploymentList;
			}
			return null;
		}
	}





