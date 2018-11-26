package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.IndividualWelfare;
import com.sgic.hrm.employee.service.IndividualWelfareService;



@RestController
public class IndividualWelfareController {
	
@Autowired
IndividualWelfareService individualWelfareService;

@GetMapping("/individualWelfare")
public List<IndividualWelfare> viewIndividualWelfare() {
return individualWelfareService.getIndividualWelfare();
}



//@PostMapping("/individualWelfare")
//public void createIndividualWelfare(@RequestBody IndividualWelfare individualWelfare) {
//	individualWelfareService.createIndividualWelfare(individualWelfare);
//}

@PutMapping("/individualWelfare/{id}")
public void updateIndividualWelfare(@RequestBody IndividualWelfare individualWelfare, @PathVariable Integer id) {
	individualWelfareService.updateIndividualWelfare(individualWelfare, id);

}

@DeleteMapping("/individualWelfare/{id}")
public void deleteIndividualWelfare(@PathVariable Integer id) {
	individualWelfareService.deleteIndividualWelfare(id);
	
}
}









