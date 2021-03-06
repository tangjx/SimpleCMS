/*
 * @(#)WxCustomerVoice.java Apr 22, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerVoice.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:12:55 PM
 * @version V1.0  
 */
public class WxCustomerVoice {
	private String media_id;

	/**
	 * @return the media_id
	 */
	public String getMedia_id() {
		return media_id;
	}

	/**
	 * @param media_id the media_id to set
	 */
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
