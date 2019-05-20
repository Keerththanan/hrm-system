package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.RequestPromotion;

public interface RequestPromotionRepository extends JpaRepository<RequestPromotion, Integer>{
//	RequestPromotion findById(int id);
	
	@Query("select rp from RequestPromotion as rp where rp.userId.id=?1")
	List<RequestPromotion> findById(int id);
	 
}
