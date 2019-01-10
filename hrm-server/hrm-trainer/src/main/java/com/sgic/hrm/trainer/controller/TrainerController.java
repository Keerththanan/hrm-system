package com.sgic.hrm.trainer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.trainer.dto.TrainerData;
import com.sgic.hrm.commons.trainer.dto.mapper.TrainerDataMapper;
import com.sgic.hrm.commons.trainer.entity.mapper.TrainerMapper;
import com.sgic.hrm.trainer.service.TrainerService;

@RestController
@CrossOrigin(origins = "*")
public class TrainerController {
	@Autowired
	TrainerService trainerService;
	
	
	@GetMapping("/trainer/{id}")
	public ResponseEntity<TrainerData> getById(@PathVariable(name = "id") Integer id) {
		return new ResponseEntity<>(
				TrainerMapper.maptoTrainerData(trainerService.getById(id)),
				HttpStatus.OK);
	}

	@GetMapping("/trainer")
	public ResponseEntity<List<TrainerData>> getAllTrainer(){

		return new ResponseEntity<>(TrainerMapper
				.mapToTrainerDataList(trainerService.getAllTrainer()), HttpStatus.OK);
	}
	
//	@GetMapping("/trainerget/{fullName}")
//	  public UserDto getUserByName(@PathVariable String fullName) {
//	    return UserMapper.mapUserToUserDto(UserService.findByUserName(fullName));
//	  }
	
	@PostMapping("/trainer")
	public ResponseEntity<String> createTrainer(@RequestBody TrainerData trainerData) {

		if (trainerService
				.createTrainer(TrainerDataMapper.mapToTrainer(trainerData))) {
			return new ResponseEntity<>("Trainer Creation Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("Trainer Creation Failed ", HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/trainer/{id}")
	public ResponseEntity<String> updateTrainer(@PathVariable(name = "id") Integer id,
			@RequestBody TrainerData trainerData) {
		if (trainerService.updateTrainer(
				TrainerDataMapper.mapToTrainer(trainerData), id)) {
			return new ResponseEntity<>("Trainer Update Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("Trainer Update Failed ", HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/trainer/{id}")
	public ResponseEntity<String> deleteTrainer(@PathVariable(name = "id") Integer id) {
		if (trainerService.deleteTrainer(id)) {
			return new ResponseEntity<>("Trainer Delete Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("Trainer Delete Failed ", HttpStatus.BAD_REQUEST);

	}

}

