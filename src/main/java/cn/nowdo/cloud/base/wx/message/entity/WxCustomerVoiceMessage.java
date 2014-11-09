/*
 * @(#)WxCustomerVoiceMessage.java Apr 22, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerVoiceMessage.java
 * @Description: customer voice message
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:10:42 PM
 * @version V1.0  
 */
public class WxCustomerVoiceMessage extends WxCustomerMessage{
	private static final String TYPE = "voice";
	
	public WxCustomerVoiceMessage() {
		setMsgtype(TYPE);
	}
	
	private WxCustomerVoice voice;

	/**
	 * @return the voice
	 */
	public WxCustomerVoice getVoice() {
		return voice;
	}

	/**
	 * @return the type
	 */
	public static String getType() {
		return TYPE;
	}

	/**
	 * @param voice the voice to set
	 */
	public void setVoice(WxCustomerVoice voice) {
		this.voice = voice;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
