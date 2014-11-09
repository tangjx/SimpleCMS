/*
 * @(#)wxCutomerText.java Apr 22, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: wxCutomerText.java
 * @Description: customer message text
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:03:18 PM
 * @version V1.0  
 */
public class WxCustomerText {
	private String content;

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
