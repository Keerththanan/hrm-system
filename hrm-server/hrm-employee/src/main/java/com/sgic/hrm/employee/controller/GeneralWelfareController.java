package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sgic.hrm.commons.entity.GeneralWelfare;
import com.sgic.hrm.employee.service.GeneralWelfareService;


public class GeneralWelfareController {
	@Autowired
	private GeneralWelfareService generalWelfareService;

@GetMapping("/general")
public List<GeneralWelfare> viewGeneralWelfare() {
return generalWelfareService.getGeneralWelfare();
}

@PostMapping("/general")
public void createGeneralWelfare(@RequestBody GeneralWelfare generalWelfare) {
	generalWelfareService.createGeneralWelfare(generalWelfare);
}

@PutMapping("/general/{id}")
public void updateGeneralWelfare(@RequestBody GeneralWelfare generalWelfare, @PathVariable Integer id) {
	generalWelfareService.updateGeneralWelfare(generalWelfare, id);

}

@DeleteMapping("/general/{id}")
public void deleteGeneralWelfare(@PathVariable Integer id) {
	generalWelfareService.deleteGeneralWelfare(id);
	
}
}






