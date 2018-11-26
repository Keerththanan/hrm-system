package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.RequestPromotionData;
import com.sgic.hrm.commons.entity.RequestPromotion;

public class RequestPromotionMapper {
	public static RequestPromotionData mapToRequestPromotionData(RequestPromotion requestPrommotion) {
		RequestPromotionData requestPrommotionData = new RequestPromotionData();

	    if (requestPrommotion != null) {
	    	requestPrommotionData.setId(requestPrommotion.getId());
	    	requestPrommotionData.setPromotionRemark(requestPrommotion.getPromotionRemark());
	    	requestPrommotionData.setRecommendedBy(requestPrommotion.getRecommendedBy());
	    	requestPrommotionData.setCreatedAt(requestPrommotion.getCreatedAt());
	    	requestPrommotionData.setDesignationId(requestPrommotion.getDesignationId());
	    	requestPrommotionData.setUserId(requestPrommotion.getUserId());
	    	requestPrommotionData.setUpdatedAt(requestPrommotion.getUpdatedAt());
	    }
	    return requestPrommotionData;
	  }

	  public static List<RequestPromotionData> mapToRequestPromotionDataList(List<RequestPromotion> requestPromotionList) {
	    List<RequestPromotionData> requestPromotionDataList = new ArrayList<RequestPromotionData>();

	    if (requestPromotionList != null) {
	      for (RequestPromotion requestPromotion : requestPromotionList) {
	    	  requestPromotionDataList.add(mapToRequestPromotionData(requestPromotion));
	      }
	    }
	    return requestPromotionDataList;
	  }

	}