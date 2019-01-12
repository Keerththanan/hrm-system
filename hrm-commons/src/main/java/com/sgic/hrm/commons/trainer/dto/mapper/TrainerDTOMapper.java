package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.trainer.dto.TrainerDTO;

public class TrainerDTOMapper {

	public static Trainer mapToTrainer(TrainerDTO trainerDTO) {
		Trainer trainer = new Trainer();
		if (trainerDTO != null) {
			trainer.setId(trainerDTO.getId());
			trainer.setFullName(trainerDTO.getFullName());
			trainer.setNationality(trainerDTO.getNationality());
			trainer.setNic(trainerDTO.getNic());
			trainer.setGender(trainerDTO.getGender());
			trainer.setDateOfBirth(trainerDTO.getDateOfBirth());
			trainer.setReligion(trainerDTO.getReligion());
			trainer.setPermenentAddress(trainerDTO.getPermenentAddress());
			trainer.setResidentialAddress(trainerDTO.getResidentialAddress());
			trainer.setTelephoneNumber(trainerDTO.getTelephoneNumber());
			trainer.setMobileNumber(trainerDTO.getMobileNumber());
			trainer.setEmail(trainerDTO.getEmail());
			trainer.setMaritalStatus(trainerDTO.getMaritalStatus());
			trainer.setPosition(trainerDTO.getPosition());
			trainer.setSpecializedArea(trainerDTO.getSpecializedArea());
		}

		return trainer;
	}

	public static List<Trainer> mapToTrainerList(
			List<TrainerDTO> trainerDTOList) {

		if (trainerDTOList != null) {
			List<Trainer> trainerList = new ArrayList<Trainer>();
			for (TrainerDTO trainerDTO : trainerDTOList) {
				trainerList.add(mapToTrainer(trainerDTO));
			}
			return trainerList;
		}
		return null;
	}
}

