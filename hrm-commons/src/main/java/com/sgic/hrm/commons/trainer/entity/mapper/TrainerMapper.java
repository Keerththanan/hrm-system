package com.sgic.hrm.commons.trainer.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.entity.mapper.UserToUserData;
import com.sgic.hrm.commons.entity.trainer.Trainer;
import com.sgic.hrm.commons.trainer.dto.TrainerData;

public class TrainerMapper {
	
	public static TrainerData maptoTrainerData(Trainer trainer) {
		TrainerData trainerData = new TrainerData();

		if (trainer != null) {
			trainerData.setId(trainer.getId());
			trainerData.setUser(UserToUserData.mapToUserData(trainer.getUser()));
			trainerData.setSpecializedArea(trainer.getSpecializedArea());
			trainerData.setPosition(trainer.getPosition());
		}
		return trainerData;
	}	
	
	public static List<TrainerData> mapToTrainerDataList(
		      List<Trainer> trainerList) {
		    List<TrainerData> trainerDataList =
		        new ArrayList<TrainerData>();

		    if (trainerList != null) {
		      for (Trainer trainer : trainerList) {
		    	  trainerDataList.add(maptoTrainerData(trainer));
		      }
		    }
		    return trainerDataList;
		  }

		}



