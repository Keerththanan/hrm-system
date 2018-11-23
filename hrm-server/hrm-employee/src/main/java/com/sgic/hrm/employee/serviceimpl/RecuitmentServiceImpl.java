package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Recruitment;
import com.sgic.hrm.commons.repository.RecruitmentRepository;
import com.sgic.hrm.employee.service.RecruitmentService;



@Service
public class RecuitmentServiceImpl implements RecruitmentService {
	@Autowired
	private RecruitmentRepository recruitmentRepository;

	@Override
	public boolean addRecruitment(Recruitment recruitment) {
		recruitmentRepository.save(recruitment);
		return true;
	}

	@Override
	public List<Recruitment> getAllRecruitment() {
		return recruitmentRepository.findAll();
	}

	@Override
	public boolean editRecruitment(Recruitment recruitment, Integer id) {
		boolean success = false;
		if (recruitmentRepository.getOne(id) != null) {
			recruitment.setId(id);
			recruitmentRepository.save(recruitment);
			success = true;
			return success;
		}
		return success;
	}

	@Override
	public boolean deleteRecruitment(Integer id) {
		Recruitment recuitment = recruitmentRepository.getOne(id);
		if (recuitment.getId() == (id)) {
			recruitmentRepository.deleteById(id);
			return true;
		}
		return false;
	}

	
}
