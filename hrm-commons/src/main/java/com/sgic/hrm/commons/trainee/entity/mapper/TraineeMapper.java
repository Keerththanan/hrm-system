package com.sgic.hrm.commons.trainee.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.trainee.dto.TraineeDto;
import com.sgic.hrm.commons.trainee.entity.Trainee;

public class TraineeMapper {

	public static TraineeDto mapTraineeToTraineeDto(Trainee trainee) {
		TraineeDto traineeDto=new TraineeDto();
		
		traineeDto.setId(trainee.getId());
		traineeDto.setDateOfBirth(trainee.getDateOfBirth());
		traineeDto.setDepartment(trainee.getDepartment());
		traineeDto.setEmail(trainee.getEmail());
		traineeDto.setEmployment(trainee.getEmployment());
		traineeDto.setFullName(trainee.getFullName());
		traineeDto.setGender(trainee.getGender());
		traineeDto.setJoinDate(trainee.getJoinDate());
		traineeDto.setMaritalStatus(trainee.getMaritalStatus());
		traineeDto.setMobileNumber(trainee.getMobileNumber());
		traineeDto.setName(trainee.getName());
		traineeDto.setNationality(trainee.getNationality());
		traineeDto.setNic(trainee.getNic());
		traineeDto.setOccupation(trainee.getOccupation());
		traineeDto.setPermenentAddress(trainee.getPermenentAddress());
		traineeDto.setProfilePhoto(trainee.getProfilePhoto());
		traineeDto.setReligion(trainee.getReligion());
		traineeDto.setResidentialAddress(trainee.getResidentialAddress());
		traineeDto.setServicePeriod(trainee.getServicePeriod());
		traineeDto.setTelephoneNumber(trainee.getTelephoneNumber());
		traineeDto.setUpdateAt(trainee.getUpdateAt());
		
		return traineeDto;	
	}
	public static List<TraineeDto> mapTraineeListToTraineeDtoList(List<Trainee> traineeList) {
		List<TraineeDto> traineeDtoList=new ArrayList<TraineeDto>();
		
		if(traineeList !=null) {
			for(Trainee trainee:traineeList) {
				traineeDtoList.add(mapTraineeToTraineeDto(trainee));
			}
		}
		return traineeDtoList;
	}
}
