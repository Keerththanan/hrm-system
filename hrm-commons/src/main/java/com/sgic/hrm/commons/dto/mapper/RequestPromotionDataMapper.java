package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.DesignationData;
import com.sgic.hrm.commons.dto.RequestPromotionData;
import com.sgic.hrm.commons.entity.RequestPromotion;

public class RequestPromotionDataMapper {
	public static RequestPromotion mapToLeaveRequest(RequestPromotionData requestPromotionData) {
		RequestPromotion requestPromotion = new RequestPromotion();
		DesignationData designationData=new DesignationData();

	    if (requestPromotionData != null) {
	    	requestPromotion.setId(requestPromotionData.getId());
			requestPromotion.setPromotionRemark(requestPromotionData.getPromotionRemark());
			requestPromotion.setRecommendedBy(requestPromotionData.getRecommendedBy());
			
//			Designation designation=designationService.getDesignationById(requestPromotionData.getDesignationId());
//			requestPromotion.setDesignationId(designationData.getId());
			
//			User user= userService.getUserById(requestPromotionData.getUserId());
//			requestPromotion.setUserId(user);
	    }
	    return requestPromotion;
	  }

	  public static List<RequestPromotion> mapToLeaveRequestList(
	      List<RequestPromotionData> requestPromotionDataList) {
	    List<RequestPromotion> requestpromotionList = new ArrayList<RequestPromotion>();

	    if (requestPromotionDataList != null) {
	      for (RequestPromotionData requestPromotionData : requestPromotionDataList) {
//	    	  requestpromotionList.add(mapToRequestPromotion(requestPromotionData));
	      }
	    }
	    return requestpromotionList;
	  }
	}