package com.sgic.hrm.commons.entity.mapper.privilege;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.privilege.ModuleDto;
import com.sgic.hrm.commons.entity.privilege.Module;

public class ModuleMapper {

	public static ModuleDto mapModuleToModuleDto(Module module) {
		ModuleDto moduleDto = new ModuleDto();

		moduleDto.setId(module.getId());
		moduleDto.setModuleName(module.getModuleName());
		moduleDto.setPrivileges(module.getPrivileges());

		return moduleDto;
	}

	public static List<ModuleDto> mapModuleListToModuleDtoList(List<Module> moduleList) {
		List<ModuleDto> moduleDtoList = new ArrayList<ModuleDto>();

		if (moduleList != null) {
			for (Module module : moduleList) {
				moduleDtoList.add(mapModuleToModuleDto(module));
			}
		}
		return moduleDtoList;
	}
}
