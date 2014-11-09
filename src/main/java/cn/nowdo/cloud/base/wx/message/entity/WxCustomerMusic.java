/*
 * @(#)WxCustomerMusic.java Apr 22, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerMusic.java
 * @Description: customer music entity
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:22:47 PM
 * @version V1.0  
 */
public class WxCustomerMusic {
	private String title;
	private String description;
	private String musicurl;
	private String hqmusicurl;
	private String thumb_media_id;
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
	/**
	 * @return the musicurl
	 */
	public String getMusicurl() {
		return musicurl;
	}
	/**
	 * @param musicurl the musicurl to set
	 */
	public void setMusicurl(String musicurl) {
		this.musicurl = musicurl;
	}
	/**
	 * @return the hqmusicurl
	 */
	public String getHqmusicurl() {
		return hqmusicurl;
	}
	/**
	 * @param hqmusicurl the hqmusicurl to set
	 */
	public void setHqmusicurl(String hqmusicurl) {
		this.hqmusicurl = hqmusicurl;
	}
	/**
	 * @return the thumb_media_id
	 */
	public String getThumb_media_id() {
		return thumb_media_id;
	}
	/**
	 * @param thumb_media_id the thumb_media_id to set
	 */
	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
