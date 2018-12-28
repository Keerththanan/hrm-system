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

import com.sgic.hrm.commons.entity.trainer.TrainingHistory;
import com.sgic.hrm.commons.trainer.dto.TrainingHistoryData;
import com.sgic.hrm.commons.trainer.dto.mapper.TrainingHistoryDataToTrainingHistory;
import com.sgic.hrm.commons.trainer.entity.mapper.TrainingHistoryToTrainingHistoryData;
import com.sgic.hrm.trainer.service.TrainingHistoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
public class TrainingHistoryController {
	@Autowired
	private TrainingHistoryService trainingHistoryService;

	@PostMapping("/trainingHistory")
	public HttpStatus trainingHistory(@RequestBody TrainingHistoryData trainingHistoryData) {
		TrainingHistory trainingHistory = TrainingHistoryDataToTrainingHistory
				.TrainingHistoryDataToTrainingHistory(trainingHistoryData);
		if (trainingHistoryService.addTrainingHistory(trainingHistory)) {
			return HttpStatus.OK;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/trainingHistory")
	public ResponseEntity<List<TrainingHistoryData>> getTrainingHistory() {
		List<TrainingHistory> trainingHistoryList = trainingHistoryService.getAllTrainingHistory();
		return new ResponseEntity<>(
				TrainingHistoryToTrainingHistoryData.TrainingHistoryToTrainingHistoryData(trainingHistoryList),
				HttpStatus.OK);
	}

	@GetMapping("/trainingHistory/{id}")
	public ResponseEntity<TrainingHistoryData> getOneTrainingHistory(@PathVariable(name = "id") Integer id) {
		TrainingHistory trainingHistory = trainingHistoryService.getOneTrainingHistory(id);
		return new ResponseEntity<>(
				TrainingHistoryToTrainingHistoryData.TrainingHistoryToTrainingHistoryData(trainingHistory),
				HttpStatus.OK);
	}

	@PutMapping("/trainingHistory/{id}")
	public HttpStatus updateTrainingHistory(@PathVariable(name = "id") Integer id,
			@RequestBody TrainingHistoryData trainingHistoryData) {
		TrainingHistory trainingHistory = TrainingHistoryDataToTrainingHistory
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
