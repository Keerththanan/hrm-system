package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.Promotion;

public interface PromotionRepository extends JpaRepository<Promotion, Integer> {

	@Query("select pr from Promotion as pr where pr.userId.id=?1")
	List<Promotion> findByUserId(int id);
}
