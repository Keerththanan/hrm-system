package com.sgic.hrm.commons.repository.privilege;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.privilege.Privilege;
import com.sgic.hrm.commons.enums.RoleName;

public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {
	
	@Query("SELECT p FROM Privilege p WHERE p.authorizeType.authorizeTypeName = ?1 AND p.module.moduleName = ?2 AND p.role.name = ?3")
	public Privilege getPrivilegeState(String authorizationTypeName, String moduleName, RoleName roleName);

}
