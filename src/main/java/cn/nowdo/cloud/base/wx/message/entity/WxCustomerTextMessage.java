/*
 * @(#)WxCustomerTextMessage.java Apr 22, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerTextMessage.java
 * @Description: wx customer text message
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:01:13 PM
 * @version V1.0  
 */
public class WxCustomerTextMessage extends WxCustomerMessage{
	private static final String TYPE = "text";
	
	public WxCustomerTextMessage() {
		setMsgtype(TYPE);
	}
	/**
	 * @return the type
	 */
	public static String getType() {
		return TYPE;
	}
	private WxCustomerText text;

	/**
	 * @return the text
	 */
	public WxCustomerText getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(WxCustomerText text) {
		this.text = text;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
