package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.trainer.dto.TrainerDTO;

public class TrainerDTOMapper {

	public static Trainer mapToGeneralInformation(TrainerDTO trainerDTO) {
		Trainer generalInformation = new Trainer();
		if (trainerDTO != null) {
			generalInformation.setId(trainerDTO.getId());
			generalInformation.setFullName(trainerDTO.getFullName());
			generalInformation.setNationality(trainerDTO.getNationality());
			generalInformation.setNic(trainerDTO.getNic());
			generalInformation.setGender(trainerDTO.getGender());
			generalInformation.setDateOfBirth(trainerDTO.getDateOfBirth());
			generalInformation.setReligion(trainerDTO.getReligion());
			generalInformation.setPermenentAddress(trainerDTO.getPermenentAddress());
			generalInformation.setResidentialAddress(trainerDTO.getResidentialAddress());
			generalInformation.setTelephoneNumber(trainerDTO.getTelephoneNumber());
			generalInformation.setMobileNumber(trainerDTO.getMobileNumber());
			generalInformation.setEmail(trainerDTO.getEmail());
			generalInformation.setMaritalStatus(trainerDTO.getMaritalStatus());
			generalInformation.setPosition(trainerDTO.getPosition());
			generalInformation.setSpecializedArea(trainerDTO.getSpecializedArea());
		}

		return generalInformation;
	}

	public static List<Trainer> mapToGeneralInformationList(
			List<TrainerDTO> generalInformationDTOList) {

		if (generalInformationDTOList != null) {
			List<Trainer> generalInformationList = new ArrayList<Trainer>();
			for (TrainerDTO trainerDTO : generalInformationDTOList) {
				generalInformationList.add(mapToGeneralInformation(trainerDTO));
			}
			return generalInformationList;
		}
		return null;
	}
}

