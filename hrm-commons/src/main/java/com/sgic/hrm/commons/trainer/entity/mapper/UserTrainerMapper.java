package com.sgic.hrm.commons.trainer.entity.mapper;

//done by_Sujaany
import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.mapper.UserToUserData;
import com.sgic.hrm.commons.entity.trainer.UserTrainer;
import com.sgic.hrm.commons.trainer.dto.UserTrainerData;

public class UserTrainerMapper {
	public static UserTrainerData maptoUserTrainerData(UserTrainer userTrainer) {
		UserTrainerData userTrainerData = new UserTrainerData();

		if (userTrainer != null) {
			userTrainerData.setId(userTrainer.getId());
			userTrainerData.setUser(UserToUserData.mapToUserData(userTrainer.getUser()));
			userTrainerData.setSpecializedArea(userTrainer.getSpecializedArea());
			userTrainerData.setPosition(userTrainer.getPosition());
		}
		return userTrainerData;
	}

	public static List<UserTrainerData> mapToUserTrainerDataList(List<UserTrainer> userTrainerList) {
		List<UserTrainerData> userTrainerDataList = new ArrayList<UserTrainerData>();

		if (userTrainerList != null) {
			for (UserTrainer userTrainer : userTrainerList) {
				userTrainerDataList.add(maptoUserTrainerData(userTrainer));
			}
		}
		return userTrainerDataList;
	}
}
