/*
 * @(#)WxCustomerImageMessage.java Apr 22, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerImageMessage.java
 * @Description: customer singal image message
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:06:20 PM
 * @version V1.0  
 */
public class WxCustomerImageMessage extends WxCustomerMessage{
	private static final String TYPE = "image";
	private WxCustomerImage image;
	
	public WxCustomerImageMessage() {
		setMsgtype(TYPE);
	}
	/**
	 * @return the image
	 */
	public WxCustomerImage getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(WxCustomerImage image) {
		this.image = image;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
