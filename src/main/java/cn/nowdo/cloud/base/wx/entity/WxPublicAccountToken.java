/*
 * @(#)WxAccessToken.java Jul 25, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.entity;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxAccessToken.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Jul 25, 2014 10:37:36 AM
 * @version V1.0  
 */
public class WxPublicAccountToken {
	private String id;
	private String appId;
	private String accessToken;
	private Date updateDate = new Date();
	private Date lockTime = new Date();
	private boolean lock;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appId;
	}
	/**
	 * @param appId the appId to set
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}
	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}
	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * @return the lockTime
	 */
	public Date getLockTime() {
		return lockTime;
	}
	/**
	 * @param lockTime the lockTime to set
	 */
	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}
	/**
	 * @return the lock
	 */
	public boolean isLock() {
		return lock;
	}
	/**
	 * @param lock the lock to set
	 */
	public void setLock(boolean lock) {
		this.lock = lock;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
