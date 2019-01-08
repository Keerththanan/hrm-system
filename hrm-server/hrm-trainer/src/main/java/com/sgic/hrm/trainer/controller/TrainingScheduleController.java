package com.sgic.hrm.trainer.controller;
//done by daminiya
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

import com.sgic.hrm.commons.entity.trainer.TrainingSchedule;
import com.sgic.hrm.commons.trainer.dto.TrainingScheduleData;
import com.sgic.hrm.commons.trainer.dto.mapper.TrainingScheduleDataToTrainingSchedule;
import com.sgic.hrm.commons.trainer.entity.mapper.TrainingScheduleToTrainingScheduleData;
import com.sgic.hrm.trainer.service.TrainingScheduleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
public class TrainingScheduleController {
	@Autowired
	private TrainingScheduleService trainingHistoryService;

	@PostMapping("/trainingHistory")
	public HttpStatus trainingHistory(@RequestBody TrainingScheduleData trainingHistoryData) {
		TrainingSchedule trainingHistory = TrainingScheduleDataToTrainingSchedule
				.TrainingHistoryDataToTrainingHistory(trainingHistoryData);
		if (trainingHistoryService.addTrainingHistory(trainingHistory)) {
			return HttpStatus.OK;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/trainingHistory")
	public ResponseEntity<List<TrainingScheduleData>> getTrainingHistory() {
		List<TrainingSchedule> trainingHistoryList = trainingHistoryService.getAllTrainingHistory();
		return new ResponseEntity<>(
				TrainingScheduleToTrainingScheduleData.TrainingHistoryToTrainingHistoryData(trainingHistoryList),
				HttpStatus.OK);
	}
//get by id method
	@GetMapping("/trainingHistory/{id}")
	public ResponseEntity<TrainingScheduleData> getOneTrainingHistory(@PathVariable(name = "id") Integer id) {
		TrainingSchedule trainingHistory = trainingHistoryService.getOneTrainingHistory(id);
		return new ResponseEntity<>(
				TrainingScheduleToTrainingScheduleData.TrainingHistoryToTrainingHistoryData(trainingHistory),
				HttpStatus.OK);
	}

	@PutMapping("/trainingHistory/{id}")
	public HttpStatus updateTrainingHistory(@PathVariable(name = "id") Integer id,
			@RequestBody TrainingScheduleData trainingHistoryData) {
		TrainingSchedule trainingHistory = TrainingScheduleDataToTrainingSchedule
				.TrainingHistoryDataToTrainingHistory(trainingHistoryData);
		if (trainingHistoryService.updateTrainingHistory(id, trainingHistory)) {
			return HttpStatus.OK;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@DeleteMapping("/trainingHistory/{id}")
	public HttpStatus deleteTrainingHistory(@PathVariable(name = "id") Integer id) {
		if (trainingHistoryService.deleteTrainingHistory(id)) {
			return HttpStatus.OK;
		}
		return HttpStatus.BAD_REQUEST;
	}

}
