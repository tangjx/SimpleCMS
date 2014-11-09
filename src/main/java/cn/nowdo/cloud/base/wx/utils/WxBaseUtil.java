/*
 * @(#)WxBaseUtil.java Apr 22, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.utils;

import java.net.URI;
import java.net.URISyntaxException;

import cn.nowdo.cloud.base.wx.entity.WxUserListResult;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerMessage;
import cn.nowdo.cloud.base.wx.model.WxAccessToken;
import cn.nowdo.cloud.base.wx.model.WxRequestResult;
import cn.nowdo.cloud.utils.HttpUtils;

/*
 * @Title: WxBaseUtil.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:43:47 PM
 * @version V1.0  
 */
public class WxBaseUtil {
	
	public static WxAccessToken getAccessToken(String appId, String secret) {
		WxAccessToken accessToken = null;
		try {
			URI uri;
			uri = WxURIFactory.getWxAccessTokenURI(appId, secret);
			accessToken = (WxAccessToken)HttpUtils.getResponseGenericObjWithHttpGet(uri, WxAccessToken.class);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return accessToken;
	}
	
	public static WxRequestResult sendCustomerMessage(String accessToken, WxCustomerMessage message) {
		WxRequestResult result = null;
		try {
			URI uri;
			uri = WxURIFactory.getWxSendCustomMessageURI(accessToken);
			result = (WxRequestResult)HttpUtils.getGenericObjWithHttpPost(uri, WxRequestResult.class, message);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static WxUserListResult getUserList(String accessToken) {
		WxUserListResult result = null;
		try {
			URI uri;
			uri = WxURIFactory.getWxUserListURI(accessToken);
			result = (WxUserListResult)HttpUtils.getResponseGenericObjWithHttpGet(uri, WxUserListResult.class);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static WxUserListResult getUserList(String accessToken, String nextOpenId) {
		WxUserListResult result = null;
		try {
			URI uri;
			uri = WxURIFactory.getWxUserListURI(accessToken, nextOpenId);
			result = (WxUserListResult)HttpUtils.getResponseGenericObjWithHttpGet(uri, WxUserListResult.class);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return result;
	}
}
