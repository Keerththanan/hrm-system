package com.sgic.hrm.commons.trainer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.trainer.Suggestion;


public interface SuggestionRepository extends JpaRepository<Suggestion, Integer> {
	List<Suggestion> findReleventIndividualByUser(User user);

}
