/*
 * @(#)WxAuthUtils.java Mar 9, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.auth.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;

import cn.nowdo.cloud.base.wx.auth.entity.WxAuthAccessToken;
import cn.nowdo.cloud.base.wx.auth.entity.WxAuthUser;
import cn.nowdo.cloud.utils.HttpUtils;

/*
 * @Title: WxAuthUtils.java
 * @Description: 拉取微信公众平台用户信息
 * @author atang atang@1v.cn  
 * @date Mar 9, 2014 12:04:16 PM
 * @version V1.0  
 */
public class WxAuthUtil {
	private final static String GRANT_TYPE_AUTHRIZATION_CODE = "authorization_code";
	private final static String GRANT_TYPE_CLIENT_CREDENTIAL = "client_credential";
	
	private final static String baseURI = "api.weixin.qq.com";
	
	public static WxAuthUser getWxAuthUser(String appId, String secret, String code) throws URISyntaxException, ClientProtocolException, IOException {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("appid", appId);
		paramMap.put("secret", secret);
		paramMap.put("code", code);
		paramMap.put("grant_type", GRANT_TYPE_AUTHRIZATION_CODE);
		URI uri = WxAuthURIFactory.getURI("https", baseURI, "/sns/oauth2/access_token", paramMap);
		WxAuthAccessToken wxAuthAccessToken = (WxAuthAccessToken)HttpUtils.getResponseGenericObjWithHttpGet(uri, WxAuthAccessToken.class);
		WxAuthUser user = null;
		if(wxAuthAccessToken != null && wxAuthAccessToken.getErrmsg() == null) {
			Map<String, String> userParams = new HashMap<String, String>();
			userParams.put("access_token", wxAuthAccessToken.getAccess_token());
			userParams.put("openid", wxAuthAccessToken.getOpenid());
			userParams.put("lang", "zh_CN");
			URI userUri = WxAuthURIFactory.getURI("https", baseURI, "/sns/userinfo", userParams);
			user = (WxAuthUser)HttpUtils.getResponseGenericObjWithHttpGet(userUri, WxAuthUser.class);
		}
		return user;
	}
	
	public static WxAuthAccessToken getWxAuthAccessToken(String appId, String secret, String code){
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("appid", appId);
		paramMap.put("secret", secret);
		paramMap.put("code", code);
		paramMap.put("grant_type", GRANT_TYPE_CLIENT_CREDENTIAL);
		try {
			URI uri = WxAuthURIFactory.getURI("https", baseURI, "/cgi-bin/token", paramMap);
			WxAuthAccessToken wxAuthAccessToken = (WxAuthAccessToken)HttpUtils.getResponseGenericObjWithHttpGet(uri, WxAuthAccessToken.class);
			return wxAuthAccessToken;
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
