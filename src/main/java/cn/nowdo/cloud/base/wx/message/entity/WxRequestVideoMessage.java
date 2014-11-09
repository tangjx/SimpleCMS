/*
 * @(#)WxRequestVideoMessage.java May 29, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dom4j.Element;

/*
 * @Title: WxRequestVideoMessage.java
 * @Description:
 * @author atang atang@1v.cn  
 * @date May 29, 2014 5:07:21 PM
 * @version V1.0  
 */
public class WxRequestVideoMessage extends WxRequestMediaMessage{
	private String thumbMediaId;
	
	public WxRequestVideoMessage() {
	}
	
	public WxRequestVideoMessage(WxMessageHeader header) {
		super(header);
	}

	public WxRequestVideoMessage(WxMessageHeader header, Element root) {
		super(header);
		if (root != null) {
			setMsgId(root.elementText("MsgId"));
			setMediaId(root.elementText("MediaId"));
			setThumbMediaId(root.elementText("ThumbMediaId"));
		}
	}
	/**
	 * @return the thumbMediaId
	 */
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	/**
	 * @param thumbMediaId the thumbMediaId to set
	 */
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
