package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.SalaryDetailsEmpDto;
import com.sgic.hrm.commons.entity.SalaryDetailsEmpViewEntity;

public class SalaryDetailsEmpEntityMapper {

	public static SalaryDetailsEmpDto mapSalaryDetailsEmpEntityToSalaryDetailsEmpDto(
			SalaryDetailsEmpViewEntity salaryDetailsEmpViewEntity) {
		SalaryDetailsEmpDto salaryDetailsEmpDto = new SalaryDetailsEmpDto();

		salaryDetailsEmpDto.setAllowances(salaryDetailsEmpViewEntity.getAllowances());
		salaryDetailsEmpDto.setAppointmentDate(salaryDetailsEmpViewEntity.getAppointmentDate());
		salaryDetailsEmpDto.setBasicSalary(salaryDetailsEmpViewEntity.getBasicSalary());
		salaryDetailsEmpDto.setDeductions(salaryDetailsEmpViewEntity.getDeductions());
		salaryDetailsEmpDto.setEmpName(salaryDetailsEmpViewEntity.getEmpName());
		salaryDetailsEmpDto.setId(salaryDetailsEmpViewEntity.getId());
		salaryDetailsEmpDto.setIncrement(salaryDetailsEmpViewEntity.getIncrement());
		salaryDetailsEmpDto.setNetSalary(salaryDetailsEmpViewEntity.getNetSalary());
		salaryDetailsEmpDto.setStatutoryPayment(salaryDetailsEmpViewEntity.getStatutoryPayment());
		return salaryDetailsEmpDto;
	}

	public static List<SalaryDetailsEmpDto> mapSalaryDetailsEmpDtoListToSalaryDetailsEntityList(
			List<SalaryDetailsEmpViewEntity> salaryDetailsEmpViewEntityList) {
		List<SalaryDetailsEmpDto> salaryDetailsDtoList = new ArrayList<SalaryDetailsEmpDto>();
		if(salaryDetailsEmpViewEntityList != null) {
			for(SalaryDetailsEmpViewEntity salaryDetailsEmpViewEntity:salaryDetailsEmpViewEntityList) {
				salaryDetailsDtoList.add(mapSalaryDetailsEmpEntityToSalaryDetailsEmpDto(salaryDetailsEmpViewEntity));
			}
		}
		return salaryDetailsDtoList;
	}
}
