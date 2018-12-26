package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.GeneralInformation;
import com.sgic.hrm.commons.trainer.dto.GeneralInformationDTO;

public class GeneralInformationMapper {
	public static GeneralInformationDTO mapToGeneralInformationDTO(GeneralInformation generalInformation) {
		GeneralInformationDTO generalInformationDTO = new GeneralInformationDTO();
		if (generalInformation !=null) {
			generalInformationDTO.setId(generalInformation.getId());
			generalInformationDTO.setFullName(generalInformation.getFullName());
			generalInformationDTO.setNationality(generalInformation.getNationality());
			generalInformationDTO.setNic(generalInformation.getNic());
			generalInformationDTO.setGender(generalInformation.getGender());
			generalInformationDTO.setDateOfBirth(generalInformation.getDateOfBirth());
			generalInformationDTO.setReligion(generalInformation.getReligion());
			generalInformationDTO.setPermenentAddress(generalInformation.getPermenentAddress());
			generalInformationDTO.setResidentialAddress(generalInformation.getResidentialAddress());
			generalInformationDTO.setTelephoneNumber(generalInformation.getTelephoneNumber());
			generalInformationDTO.setMobileNumber(generalInformation.getMobileNumber());
			generalInformationDTO.setEmail(generalInformation.getEmail());
			generalInformationDTO.setMaritalStatus(generalInformation.getMaritalStatus());
			generalInformationDTO.setPosition(generalInformation.getPosition());
			generalInformationDTO.setSpecializedArea(generalInformation.getSpecializedArea());
			
		}
		
		return generalInformationDTO;
		
	}
	
	public static List<GeneralInformationDTO> mapToGeneralInformationDTOList(
			List<GeneralInformation> generalInformationList){
		List<GeneralInformationDTO> generalInformationDTO = new ArrayList<GeneralInformationDTO>();
		
		if (generalInformationList != null) {
			
			  for (GeneralInformation generalInformation : generalInformationList) {
			        generalInformationDTO.add(mapToGeneralInformationDTO(generalInformation));
			      }
			    }
			    return generalInformationDTO;
			  }
			}


