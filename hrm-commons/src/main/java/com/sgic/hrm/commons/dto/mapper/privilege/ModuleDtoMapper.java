package com.sgic.hrm.commons.dto.mapper.privilege;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.privilege.ModuleDto;
import com.sgic.hrm.commons.entity.privilege.Module;

public class ModuleDtoMapper {
	public static Module mapModuleDtoToModule(ModuleDto moduleDto) {
		Module module = new Module();

		module.setId(moduleDto.getId());
		module.setModuleName(moduleDto.getModuleName());

		return module;
	}

	public static List<Module> mapModuleDtoListToModuleList(List<ModuleDto> moduleDtoList) {
		List<Module> moduleList = new ArrayList<Module>();

		if (moduleDtoList != null) {
			for (ModuleDto moduleDto : moduleDtoList) {
				moduleList.add(mapModuleDtoToModule(moduleDto));
			}
		}
		return moduleList;
	}
}
