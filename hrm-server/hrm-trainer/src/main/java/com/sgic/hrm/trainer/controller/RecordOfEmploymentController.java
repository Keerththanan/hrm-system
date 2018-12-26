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

import com.sgic.hrm.commons.trainer.dto.RecordOfEmploymentDTO;
import com.sgic.hrm.commons.trainer.dto.mapper.RecordOfEmployementDTOMapper;
import com.sgic.hrm.commons.trainer.entity.mapper.RecordOfEmploymentMapper;
import com.sgic.hrm.trainer.service.RecordOfEmploymentService;


@RestController
@CrossOrigin(origins = "*")
public class RecordOfEmploymentController {

	@Autowired
	RecordOfEmploymentService recordOfEmploymentService;
	
	@GetMapping("/recordOfEmployment/{id}")
	public ResponseEntity<RecordOfEmploymentDTO> getById(@PathVariable(name = "id") Integer id) {
		return new ResponseEntity<>(
				RecordOfEmploymentMapper.mapToRecordOfEmploymentDTO(recordOfEmploymentService.getById(id)),
				HttpStatus.OK);
	}

	@GetMapping("/recordOfEmployment")
	public ResponseEntity<List<RecordOfEmploymentDTO>> getAllRecordOfEmployment(){

		return new ResponseEntity<>(RecordOfEmploymentMapper
				.mapToRecordOfEmploymentDTOList(recordOfEmploymentService.getAllRecordOfEmployment()), HttpStatus.OK);
	}

	@PostMapping("/recordOfEmployment")
	public ResponseEntity<String> createRecordOfEmployement(@RequestBody RecordOfEmploymentDTO recordOfEmploymentDTO) {

		if (recordOfEmploymentService
				.createRecordOfEmployment(RecordOfEmployementDTOMapper.mapToRecordOfEmployment(recordOfEmploymentDTO))) {
			return new ResponseEntity<>("Record of Employment Create Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("Record of Employment Create Failed ", HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/recordOfEmployment/{id}")
	public ResponseEntity<String> updateRecordOfEmployement(@PathVariable(name = "id") Integer id,
			@RequestBody RecordOfEmploymentDTO recordOfEmploymentDTO) {
		if (recordOfEmploymentService.updateRecordOfEmployment(
				RecordOfEmployementDTOMapper.mapToRecordOfEmployment(recordOfEmploymentDTO), id)) {
			return new ResponseEntity<>("Record of Employment Update Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("Record of Employment Update Failed ", HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/recordOfEmployment/{id}")
	public ResponseEntity<String> deleteRecordOfEmployment(@PathVariable(name = "id") Integer id) {
		if (recordOfEmploymentService.deleteRecordOfEmployment(id)) {
			return new ResponseEntity<>("Record of Employment Delete Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("Record of Employment Delete Failed ", HttpStatus.BAD_REQUEST);

	}

}
