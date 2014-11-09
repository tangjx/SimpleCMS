/*
 * @(#)WxRequestLinkMessage.java May 29, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dom4j.Element;

/*
 * @Title: WxRequestLinkMessage.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date May 29, 2014 5:17:44 PM
 * @version V1.0  
 */
public class WxRequestLinkMessage extends WxMessage{
	private String msgId;
	private String title;
	private String url;
	private String description;
	
	public WxRequestLinkMessage(WxMessageHeader header) {
		super(header);
	}

	public WxRequestLinkMessage(WxMessageHeader header, Element root) {
		super(header);
		if (root != null) {
			setMsgId(root.elementText("MsgId"));
			setTitle(root.elementText("Title"));
			setUrl(root.elementText("Url"));
			setDescription(root.elementText("Description"));
		}
	}

	/**
	 * @return the msgId
	 */
	public String getMsgId() {
		return msgId;
	}

	/**
	 * @param msgId the msgId to set
	 */
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
