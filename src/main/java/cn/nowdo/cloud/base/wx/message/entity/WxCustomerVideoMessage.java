/*
 * @(#)WxCustomerVideoMessage.java Apr 22, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerVideoMessage.java
 * @Description: customer video message
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:14:13 PM
 * @version V1.0  
 */
public class WxCustomerVideoMessage extends WxCustomerMessage {
	private static final String TYPE = "video";
	
	public WxCustomerVideoMessage() {
		setMsgtype(TYPE);
	}
	
	private WxCustomerVideo video;

	/**
	 * @return the video
	 */
	public WxCustomerVideo getVideo() {
		return video;
	}

	/**
	 * @param video the video to set
	 */
	public void setVideo(WxCustomerVideo video) {
		this.video = video;
	}

	/**
	 * @return the type
	 */
	public static String getType() {
		return TYPE;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
