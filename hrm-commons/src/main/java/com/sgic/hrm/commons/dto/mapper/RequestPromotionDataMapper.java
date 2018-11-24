package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.RequestPromotionData;
import com.sgic.hrm.commons.entity.RequestPromotion;

public class RequestPromotionDataMapper {
	public static RequestPromotion mapToRequestPromotion(RequestPromotionData requestPromotionData) {
		RequestPromotion requestPromotion = new RequestPromotion();

		if (requestPromotionData != null) {
			requestPromotion.setId(requestPromotionData.getId());
			requestPromotion.setPromotionRemark(requestPromotionData.getPromotionRemark());
			requestPromotion.setRecommendedBy(requestPromotionData.getRecommendedBy());
//			requestPromotion.setCreatedAt(requestPromotionData.getCreatedAt());
			requestPromotion.setDesignationId(requestPromotionData.getDesignationId());
			requestPromotion.setUserId(requestPromotionData.getUserId());
//			requestPromotion.setUpdatedAt(requestPromotionData.getCreatedAt());
		}
		return requestPromotion;
	}

	public static List<RequestPromotion> mapToRequestPromotionList(
			List<RequestPromotionData> requestPromotionDataList) {
		List<RequestPromotion> requestpromotionList = new ArrayList<RequestPromotion>();

		if (requestPromotionDataList != null) {
			for (RequestPromotionData requestPromotionData : requestPromotionDataList) {
				requestpromotionList.add(mapToRequestPromotion(requestPromotionData));
			}
		}
		return requestpromotionList;
	}
	
}