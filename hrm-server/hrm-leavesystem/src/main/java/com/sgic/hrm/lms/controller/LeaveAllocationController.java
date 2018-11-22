package com.sgic.hrm.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.LeaveAllocationData;
import com.sgic.hrm.commons.dto.mapper.LeaveAllocationDataToLeaveAllocation;
import com.sgic.hrm.commons.entity.LeaveAllocation;
import com.sgic.hrm.commons.entity.mapper.LeaveAllocationToLeaveAllocationData;
import com.sgic.hrm.lms.service.LeaveAllocationService;

@RestController
@RequestMapping("/leaveallocation")
public class LeaveAllocationController {

	@Autowired
	LeaveAllocationService leaveAllocationService;

	@PostMapping
	public ResponseEntity<String> createLeaveAllocation(@RequestBody LeaveAllocationData leaveAllocationData) {
		if (leaveAllocationService.createLeaveAllocation(
				LeaveAllocationDataToLeaveAllocation.mapToLeaveAllocation(leaveAllocationData))) {
			return new ResponseEntity<>("LeaveAllocation created successfully", HttpStatus.CREATED);
		}
		return new ResponseEntity<>("Faild to create Leave Allocation", HttpStatus.BAD_REQUEST);
	}

	@GetMapping
	public ResponseEntity<List<LeaveAllocationData>> viewAllLeaveAllocation() {
		List<LeaveAllocation> leaveAllocationList = leaveAllocationService.viewAllLeaveAllocation();
		return new ResponseEntity<>(
				LeaveAllocationToLeaveAllocationData.mapToLeaveAllocationDataList(leaveAllocationList), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateLeaveAllocation(@PathVariable(name = "id") Integer id,
			@RequestBody LeaveAllocationData leaveAllocationData) {
		if (leaveAllocationService.updateLeaveAllocation(id,
				LeaveAllocationDataToLeaveAllocation.mapToLeaveAllocation(leaveAllocationData))) {
			return new ResponseEntity<>("LeaveAllocation updated successfully", HttpStatus.OK);
		}
		return new ResponseEntity<>("Faild to update Leave Allocation", HttpStatus.BAD_REQUEST);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteLeaveAllocation(@PathVariable(name = "id") Integer id) {
		if (leaveAllocationService.deleteLeaveAllocation(id)) {
			return new ResponseEntity<>("LeaveAllocation deleted successfully", HttpStatus.OK);
		}
		return new ResponseEntity<>("Faild to deleted Leave Allocation", HttpStatus.BAD_REQUEST);
	}

}
