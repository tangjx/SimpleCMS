package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class WxMessageImage {
	private String title;
	private String description;
	private String picUrl;
	private String linkUrl;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}