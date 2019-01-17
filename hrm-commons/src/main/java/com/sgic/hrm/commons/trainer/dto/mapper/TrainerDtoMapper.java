package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.trainer.dto.TrainerDto;

public class TrainerDtoMapper {
	public static Trainer mapToTrainer(TrainerDto trainerDto) {
		Trainer trainer = new Trainer();
		if (trainerDto != null) {
			trainer.setId(trainerDto.getId());
			trainer.setFullName(trainerDto.getFullName());
			trainer.setNationality(trainerDto.getNationality());
			trainer.setNic(trainerDto.getNic());
			trainer.setGender(trainerDto.getGender());
			trainer.setDateOfBirth(trainerDto.getDateOfBirth());
			trainer.setReligion(trainerDto.getReligion());
			trainer.setPermenentAddress(trainerDto.getPermenentAddress());
			trainer.setResidentialAddress(trainerDto.getResidentialAddress());
			trainer.setTelephoneNumber(trainerDto.getTelephoneNumber());
			trainer.setMobileNumber(trainerDto.getMobileNumber());
			trainer.setEmail(trainerDto.getEmail());
			trainer.setMaritalStatus(trainerDto.getMaritalStatus());
			trainer.setPosition(trainerDto.getPosition());
			trainer.setSpecializedArea(trainerDto.getSpecializedArea());
		}
		return trainer;
	}

	public static List<Trainer> mapToTrainerList(List<TrainerDto> trainerDtoList) {
		if (trainerDtoList != null) {
			List<Trainer> trainerList = new ArrayList<Trainer>();
			for (TrainerDto trainerDto : trainerDtoList) {
				trainerList.add(mapToTrainer(trainerDto));
			}
			return trainerList;
		}
		return null;
	}
}
