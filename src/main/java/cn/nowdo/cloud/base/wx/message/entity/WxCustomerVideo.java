/*
 * @(#)WxCustomerVideo.java Apr 22, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerVideo.java
 * @Description: customer video entity
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:17:48 PM
 * @version V1.0  
 */
public class WxCustomerVideo {
	private String media_id;
	private String title;
	private String description;
	/**
	 * @return the media_id
	 */
	public String getMedia_id() {
		return media_id;
	}
	/**
	 * @param media_id the media_id to set
	 */
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
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
