package com.sgic.hrm.commons.repository.trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.trainee.ProfessionalMembership;
import com.sgic.hrm.commons.entity.trainee.Trainee;

@Repository
public interface ProfessionalMembershipRepository extends JpaRepository<ProfessionalMembership, Integer> {
List<ProfessionalMembership> findProfessionalMembershipByTrainee(Trainee trainee);
}
