/*
 * @(#)WxAuthAccessToken.java Mar 9, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.auth.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxAuthAccessToken.java
 * @Description: 微信获取access_token接口返回的实体
 * @author atang atang@1v.cn  
 * @date Mar 9, 2014 10:35:43 AM
 * @version V1.0  
 */
public class WxAuthAccessToken {
	private String access_token;
	private String expires_in;
	private String refresh_token;
	private String openid;
	private String scope;
	
	private int errcode;
	private String errmsg;
	
	/**
	 * @return the access_token
	 */
	public String getAccess_token() {
		return access_token;
	}
	/**
	 * @param access_token the access_token to set
	 */
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	/**
	 * @return the expires_in
	 */
	public String getExpires_in() {
		return expires_in;
	}
	/**
	 * @param expires_in the expires_in to set
	 */
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	/**
	 * @return the openid
	 */
	public String getOpenid() {
		return openid;
	}
	/**
	 * @param openid the openid to set
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	/**
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}
	/**
	 * @param scope the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}
	/**
	 * @return the refresh_token
	 */
	public String getRefresh_token() {
		return refresh_token;
	}
	/**
	 * @param refresh_token the refresh_token to set
	 */
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	/**
	 * @return the errcode
	 */
	public int getErrcode() {
		return errcode;
	}
	/**
	 * @param errcode the errcode to set
	 */
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	/**
	 * @return the errmsg
	 */
	public String getErrmsg() {
		return errmsg;
	}
	/**
	 * @param errmsg the errmsg to set
	 */
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}