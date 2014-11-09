/*
 * @(#)WxCustomerImage.java Apr 22, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerImage.java
 * @Description: Customer message image
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:07:58 PM
 * @version V1.0  
 */
public class WxCustomerImage {
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
