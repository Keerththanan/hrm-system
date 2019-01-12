package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.trainer.dto.TrainerDto;

public class TrainerMapper {
	public static TrainerDto mapToTrainerDTO(Trainer trainer) {
		TrainerDto trainerDto = new TrainerDto();
		if (trainer != null) {
			trainerDto.setId(trainer.getId());
			trainerDto.setFullName(trainer.getFullName());
			trainerDto.setNationality(trainer.getNationality());
			trainerDto.setNic(trainer.getNic());
			trainerDto.setGender(trainer.getGender());
			trainerDto.setDateOfBirth(trainer.getDateOfBirth());
			trainerDto.setReligion(trainer.getReligion());
			trainerDto.setPermenentAddress(trainer.getPermenentAddress());
			trainerDto.setResidentialAddress(trainer.getResidentialAddress());
			trainerDto.setTelephoneNumber(trainer.getTelephoneNumber());
			trainerDto.setMobileNumber(trainer.getMobileNumber());
			trainerDto.setEmail(trainer.getEmail());
			trainerDto.setMaritalStatus(trainer.getMaritalStatus());
			trainerDto.setPosition(trainer.getPosition());
			trainerDto.setSpecializedArea(trainer.getSpecializedArea());
		}
		return trainerDto;
	}

	public static List<TrainerDto> mapToTrainerDTOList(List<Trainer> trainerList) {
		List<TrainerDto> trainerDto = new ArrayList<TrainerDto>();
		if (trainerList != null) {

			for (Trainer trainer : trainerList) {
				trainerDto.add(mapToTrainerDTO(trainer));
			}
		}
		return trainerDto;
	}
}
