/*
 * @(#)WxRequestResult.java Apr 22, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxRequestResult.java
 * @Description: weixin request result
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 5:21:02 PM
 * @version V1.0  
 */
public class WxRequestResult {
	private int errcode;
	private String errmsg;
	
	public static final int INVALID_CREDENTAIL = 40001; 
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
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
