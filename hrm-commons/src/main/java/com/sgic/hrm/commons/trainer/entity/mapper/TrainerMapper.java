package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.trainer.dto.TrainerDTO;

public class TrainerMapper {
	public static TrainerDTO mapToTrainerDTO(Trainer trainer) {
		TrainerDTO trainerDTO = new TrainerDTO();
		if (trainer != null) {
			trainerDTO.setId(trainer.getId());
			trainerDTO.setFullName(trainer.getFullName());
			trainerDTO.setNationality(trainer.getNationality());
			trainerDTO.setNic(trainer.getNic());
			trainerDTO.setGender(trainer.getGender());
			trainerDTO.setDateOfBirth(trainer.getDateOfBirth());
			trainerDTO.setReligion(trainer.getReligion());
			trainerDTO.setPermenentAddress(trainer.getPermenentAddress());
			trainerDTO.setResidentialAddress(trainer.getResidentialAddress());
			trainerDTO.setTelephoneNumber(trainer.getTelephoneNumber());
			trainerDTO.setMobileNumber(trainer.getMobileNumber());
			trainerDTO.setEmail(trainer.getEmail());
			trainerDTO.setMaritalStatus(trainer.getMaritalStatus());
			trainerDTO.setPosition(trainer.getPosition());
			trainerDTO.setSpecializedArea(trainer.getSpecializedArea());

		}

		return trainerDTO;

	}

	public static List<TrainerDTO> mapToTrainerDTOList(List<Trainer> trainerList) {
		List<TrainerDTO> trainerDTO = new ArrayList<TrainerDTO>();

		if (trainerList != null) {

			for (Trainer trainer : trainerList) {
				trainerDTO.add(mapToTrainerDTO(trainer));
			}
		}
		return trainerDTO;
	}
}
