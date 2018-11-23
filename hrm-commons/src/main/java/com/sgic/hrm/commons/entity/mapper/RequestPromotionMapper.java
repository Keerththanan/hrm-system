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
//	    	requestPrommotionData.setUserId(requestPrommotion.getUserId());
	    	
//	    	requestPrommotionData.setUser(UserToUserData.mapToUserData(requestPrommotion.getUser()));
//	    	requestPrommotionData.setLeaveType(LeaveTypeToLeaveTypeData.mapToLeaveTypeData(requestPrommotion.getLeaveType()));
	      
	    }
	    return requestPrommotionData;
	  }

	  public static List<RequestPromotionData> mapLeaveRequestDataList(
	      List<RequestPromotion> requestPromotionList) {
	    List<RequestPromotionData> requestProotionDataList = new ArrayList<RequestPromotionData>();

	    if (requestPromotionList != null) {
	      for (RequestPromotion requestPromotion : requestPromotionList) {
	    	  requestProotionDataList.add(mapToRequestPromotionData(requestPromotion));
	      }
	    }
	    return requestProotionDataList;
	  }

	}