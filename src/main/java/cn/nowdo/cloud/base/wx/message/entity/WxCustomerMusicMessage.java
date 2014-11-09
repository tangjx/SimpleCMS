/*
 * @(#)WxCustomerMusicMessage.java Apr 22, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;


/*
 * @Title: WxCustomerMusicMessage.java
 * @Description: customer music message
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:20:38 PM
 * @version V1.0  
 */
public class WxCustomerMusicMessage extends WxCustomerMessage{
	private static final String TYPE = "music";
	
	public WxCustomerMusicMessage() {
		setMsgtype(TYPE);
	}
	
	private WxCustomerMusic music;

	/**
	 * @return the music
	 */
	public WxCustomerMusic getMusic() {
		return music;
	}

	/**
	 * @param music the music to set
	 */
	public void setMusic(WxCustomerMusic music) {
		this.music = music;
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
