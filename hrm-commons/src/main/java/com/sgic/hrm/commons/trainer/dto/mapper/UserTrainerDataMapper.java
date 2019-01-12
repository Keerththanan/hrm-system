package com.sgic.hrm.commons.trainer.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.mapper.UserDataToUser;
import com.sgic.hrm.commons.entity.trainer.UserTrainer;
import com.sgic.hrm.commons.trainer.dto.UserTrainerData;

public class UserTrainerDataMapper {

	public static UserTrainer mapToTrainer(UserTrainerData userTrainerData) {

		UserTrainer trainer = new UserTrainer();

		if (userTrainerData != null) {
			trainer.setId(userTrainerData.getId());
			trainer.setSpecializedArea(userTrainerData.getSpecializedArea());
			trainer.setPosition(userTrainerData.getPosition());
		}
		return trainer;
	}

	public static List<UserTrainer> mapToTrainerList(List<UserTrainerData> trainerDataList) {
		List<UserTrainer> trainerList = new ArrayList<UserTrainer>();

		if (trainerDataList != null) {
			for (UserTrainerData userTrainerData : trainerDataList) {
				trainerList.add(mapToTrainer(userTrainerData));
			}
		}
		return trainerList;
	}

}
