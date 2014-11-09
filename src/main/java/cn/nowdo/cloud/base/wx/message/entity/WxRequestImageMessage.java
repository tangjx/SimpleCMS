/*
 * @(#)WxRequestImageMessage.java May 29, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dom4j.Element;

/*
 * @Title: WxRequestImageMessage.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date May 29, 2014 4:59:42 PM
 * @version V1.0  
 */
public class WxRequestImageMessage extends WxRequestMediaMessage{
	private String picUrl;
	
	public WxRequestImageMessage() {
	}
	
	public WxRequestImageMessage(WxMessageHeader header) {
		super(header);
	}

	public WxRequestImageMessage(WxMessageHeader header, Element root) {
		super(header);
		if (root != null) {
			setMsgId(root.elementText("MsgId"));
			setPicUrl(root.elementText("PicUrl"));
			setMediaId(root.elementText("MediaId"));
		}
	}

	/**
	 * @return the picUrl
	 */
	public String getPicUrl() {
		return picUrl;
	}

	/**
	 * @param picUrl the picUrl to set
	 */
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
