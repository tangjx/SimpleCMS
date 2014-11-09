/*
 * @(#)WxCustomerMessage.java Apr 22, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.SerializedName;

/*
 * @Title: WxCustomerMessage.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 3:56:02 PM
 * @version V1.0  
 */
@XmlSeeAlso({
	WxCustomerImageMessage.class,
	WxCustomerMusicMessage.class,
	WxCustomerNewsMessage.class,
	WxCustomerTextMessage.class,
	WxCustomerVideoMessage.class,
	WxCustomerVoiceMessage.class,
})
public class WxCustomerMessage {
	@SerializedName("touser")
	private String toUser;
	private String msgtype;
	/**
	 * @return the toUser
	 */
	public String getToUser() {
		return toUser;
	}
	/**
	 * @param touser the toUser to set
	 */
	public void setToUser(String touser) {
		this.toUser = touser;
	}
	/**
	 * @return the msgtype
	 */
	public String getMsgtype() {
		return msgtype;
	}
	/**
	 * @param msgtype the msgtype to set
	 */
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
