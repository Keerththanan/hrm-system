package com.sgic.hrm.commons.dto.mapper.par;

import com.sgic.hrm.commons.dto.par.ScoreParAppraiserDtoPost;
import com.sgic.hrm.commons.entity.par.ParContent;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisor;

public class ScoreParAppraiserMapper {
	public static ScoreParAppraisor dtoToEntity(String pk, ParContent parContent,ScoreParAppraiserDtoPost scoreParAppraiserDtoPost) {

		ScoreParAppraisor scoreParAppraiser = new ScoreParAppraisor();
		scoreParAppraiser.setId(pk);
		scoreParAppraiser.setParContent(parContent);
		scoreParAppraiser.setScore(scoreParAppraiserDtoPost.getScore());
		scoreParAppraiser.setComment(scoreParAppraiserDtoPost.getComment());
		return scoreParAppraiser;

	}
}
