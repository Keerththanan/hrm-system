package com.sgic.hrm.commons.dto.mapper.privilege;

import com.sgic.hrm.commons.dto.privilege.ModuleDto;
import com.sgic.hrm.commons.entity.privilege.Module;

public class ModuleDtoMapper {
	public static Module mapModuleDtoToModule(ModuleDto moduleDto) {
		Module module = new Module();

		module.setId(moduleDto.getId());
		module.setModuleName(moduleDto.getModuleName());

		return module;
	}
}
