package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.DeniedPromotion;

public interface DeniedPromotionRepository extends JpaRepository<DeniedPromotion, Integer> {
	@Query("select dp from DeniedPromotion as dp where dp.userId.id=?1")
	List<DeniedPromotion> findByUserId(int id);
}
