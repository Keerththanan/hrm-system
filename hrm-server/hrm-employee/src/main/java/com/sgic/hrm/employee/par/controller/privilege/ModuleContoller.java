package com.sgic.hrm.employee.par.controller.privilege;

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

import com.sgic.hrm.commons.dto.mapper.privilege.ModuleDtoMapper;
import com.sgic.hrm.commons.dto.privilege.ModuleDto;
import com.sgic.hrm.commons.entity.mapper.privilege.ModuleMapper;
import com.sgic.hrm.employee.service.privilege.ModuleService;

@RestController
@RequestMapping("/module")
public class ModuleContoller {
	@Autowired
	private ModuleService moduleService;

	@GetMapping
	public ResponseEntity<List<ModuleDto>> getAllModules() {
		return new ResponseEntity<>(
				ModuleMapper.mapModuleListToModuleDtoList(moduleService.getAllModules()), HttpStatus.OK);
	}
	
	@PostMapping
	public HttpStatus addModule(@RequestBody ModuleDto moduleDto) {
		boolean flag = moduleService.createModule(ModuleDtoMapper.mapModuleDtoToModule(moduleDto));
		if(flag) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@PutMapping("/{id}")
	public HttpStatus editModule(@RequestBody ModuleDto moduleDto, @PathVariable Integer id) {
		boolean flag = moduleService.editModule((ModuleDtoMapper.mapModuleDtoToModule(moduleDto)), id);
		if(flag) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteModule(@PathVariable Integer id) {
		boolean flag = moduleService.deleteModule(id);
		if(flag) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

}
