package com.sgic.hrm.commons.repository.trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.trainee.TraineeProfessionalMembership;
import com.sgic.hrm.commons.entity.trainee.Trainee;

@Repository
public interface TraineeProfessionalMembershipRepository extends JpaRepository<TraineeProfessionalMembership, Integer> {
List<TraineeProfessionalMembership> findProfessionalMembershipByTrainee(Trainee trainee);
}