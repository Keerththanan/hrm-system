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

import com.sgic.hrm.commons.trainer.dto.GeneralInformationDTO;
import com.sgic.hrm.commons.trainer.dto.mapper.GeneralInformationDTOMapper;
import com.sgic.hrm.commons.trainer.entity.mapper.GeneralInformationMapper;
import com.sgic.hrm.trainer.service.GeneralInformationService;

@RestController
@CrossOrigin(origins = "*")
public class GeneralInformationController {
	@Autowired
	GeneralInformationService generalInformationService;
	
	
	@GetMapping("/generalInformation/{id}")
	public ResponseEntity<GeneralInformationDTO> getById(@PathVariable(name = "id") Integer id) {
		return new ResponseEntity<>(
				GeneralInformationMapper.mapToGeneralInformationDTO(generalInformationService.getById(id)),
				HttpStatus.OK);
	}

	@GetMapping("/generalInformation")
	public ResponseEntity<List<GeneralInformationDTO>> getAllTerminationType() {

		return new ResponseEntity<>(GeneralInformationMapper
				.mapToGeneralInformationDTOList(generalInformationService.getAllGeneralInformation()), HttpStatus.OK);
	}

	@PostMapping("/generalInformation")
	public ResponseEntity<String> createGeneralInformation(@RequestBody GeneralInformationDTO generalInformationDTO) {

		if (generalInformationService
				.createGeneralInformation(GeneralInformationDTOMapper.mapToGeneralInformation(generalInformationDTO))) {
			return new ResponseEntity<>("General Information Create Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("General Information Create Failed ", HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/generalInformation/{id}")
	public ResponseEntity<String> updateGeneralInformation(@PathVariable(name = "id") Integer id,
			@RequestBody GeneralInformationDTO generalInformationDTO) {
		if (generalInformationService.updateGeneralInformation(
				GeneralInformationDTOMapper.mapToGeneralInformation(generalInformationDTO), id)) {
			return new ResponseEntity<>("General Information Update Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("General Information Update Failed ", HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/generalInformation/{id}")
	public ResponseEntity<String> deleteGeneralInformation(@PathVariable(name = "id") Integer id) {
		if (generalInformationService.deleteGeneralInformation(id)) {
			return new ResponseEntity<>("General Information Delete Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("General Information Delete Failed ", HttpStatus.BAD_REQUEST);

	}

}

