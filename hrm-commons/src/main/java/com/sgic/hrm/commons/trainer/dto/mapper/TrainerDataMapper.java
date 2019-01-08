package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.mapper.UserDataToUser;
import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.trainer.dto.TrainerData;

public class TrainerDataMapper {

	public static Trainer mapToTrainer(TrainerData trainerData) {

		Trainer trainer = new Trainer();

		if (trainerData != null) {
			trainer.setId(trainerData.getId());
			trainer.setUser(UserDataToUser.mapToUser(trainerData.getUser()));
			trainer.setSpecializedArea(trainerData.getSpecializedArea());
			trainer.setPosition(trainerData.getPosition());
		}
		return trainer;
	}

	public static List<Trainer> mapToTrainerList(List<TrainerData> trainerDataList) {
		List<Trainer> trainerList = new ArrayList<Trainer>();

		if (trainerDataList != null) {
			for (TrainerData trainerData : trainerDataList) {
				trainerList.add(mapToTrainer(trainerData));
			}
		}
		return trainerList;
	}

}
