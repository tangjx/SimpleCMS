/*
 * @(#)WxRequestVoiceMessage.java May 29, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dom4j.Element;

/*
 * @Title: WxRequestVoiceMessage.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date May 29, 2014 5:10:16 PM
 * @version V1.0  
 */
public class WxRequestVoiceMessage extends WxRequestMediaMessage{
	private String format;
	
	public WxRequestVoiceMessage() {
	}
	
	public WxRequestVoiceMessage(WxMessageHeader header) {
		super(header);
	}

	public WxRequestVoiceMessage(WxMessageHeader header, Element root) {
		super(header);
		if (root != null) {
			setMsgId(root.elementText("MsgId"));
			setMediaId(root.elementText("MediaId"));
			setFormat(root.elementText("Format"));
		}
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
