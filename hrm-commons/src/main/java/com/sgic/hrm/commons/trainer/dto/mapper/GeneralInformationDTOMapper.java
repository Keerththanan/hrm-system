package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.GeneralInformation;
import com.sgic.hrm.commons.trainer.dto.GeneralInformationDTO;

public class GeneralInformationDTOMapper {

	public static GeneralInformation mapToGeneralInformation(GeneralInformationDTO generalInformationDTO) {
		GeneralInformation generalInformation = new GeneralInformation();
		if (generalInformationDTO != null) {
			generalInformation.setId(generalInformationDTO.getId());
			generalInformation.setFullName(generalInformationDTO.getFullName());
			generalInformation.setNationality(generalInformationDTO.getNationality());
			generalInformation.setNic(generalInformationDTO.getNic());
			generalInformation.setGender(generalInformationDTO.getGender());
			generalInformation.setDateOfBirth(generalInformationDTO.getDateOfBirth());
			generalInformation.setReligion(generalInformationDTO.getReligion());
			generalInformation.setPermenentAddress(generalInformationDTO.getPermenentAddress());
			generalInformation.setResidentialAddress(generalInformationDTO.getResidentialAddress());
			generalInformation.setTelephoneNumber(generalInformationDTO.getTelephoneNumber());
			generalInformation.setMobileNumber(generalInformationDTO.getMobileNumber());
			generalInformation.setEmail(generalInformationDTO.getEmail());
			generalInformation.setMaritalStatus(generalInformationDTO.getMaritalStatus());
			generalInformation.setPosition(generalInformationDTO.getPosition());
			generalInformation.setSpecializedArea(generalInformationDTO.getSpecializedArea());
		}

		return generalInformation;
	}

	public static List<GeneralInformation> mapToGeneralInformationList(
			List<GeneralInformationDTO> generalInformationDTOList) {

		if (generalInformationDTOList != null) {
			List<GeneralInformation> generalInformationList = new ArrayList<GeneralInformation>();
			for (GeneralInformationDTO generalInformationDTO : generalInformationDTOList) {
				generalInformationList.add(mapToGeneralInformation(generalInformationDTO));
			}
			return generalInformationList;
		}
		return null;
	}
}

