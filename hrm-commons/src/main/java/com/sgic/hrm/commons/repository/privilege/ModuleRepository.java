package com.sgic.hrm.commons.repository.privilege;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.privilege.Module;

public interface ModuleRepository extends JpaRepository<Module, Integer>{

//	@Query("select mp from module mp where mp.permissions.authorizeType='create'")
//	public Module getAllPrivileges();
}
