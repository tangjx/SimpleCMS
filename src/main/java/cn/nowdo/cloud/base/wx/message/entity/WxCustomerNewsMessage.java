/*
 * @(#)WxCustomerNewsMessage.java Apr 22, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerNewsMessage.java
 * @Description: customer news message
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:27:33 PM
 * @version V1.0  
 */
public class WxCustomerNewsMessage extends WxCustomerMessage {
	private static final String TYPE = "news";
	
	public WxCustomerNewsMessage() {
		setMsgtype(TYPE);
	}
	
	private WxCustomerNews news;

	/**
	 * @return the news
	 */
	public WxCustomerNews getNews() {
		return news;
	}

	/**
	 * @param news the news to set
	 */
	public void setNews(WxCustomerNews news) {
		this.news = news;
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
