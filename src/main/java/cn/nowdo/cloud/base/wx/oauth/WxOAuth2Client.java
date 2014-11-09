/*
 * @(#)WxAuthUtil Jun 12, 2014
 * 
 * Copyright (c) 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.oauth;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;

import cn.nowdo.cloud.base.wx.auth.entity.WxAuthUser;
import cn.nowdo.cloud.base.wx.auth.utils.WxAuthUtil;

import com.google.common.collect.Lists;

public class WxOAuth2Client {

	private static final String DEFAULT_ENC = "utf8";
	private static final String GRANT_TYPE = "authorization_code";
	
	private String appId;
	private String secret;
	
	public WxOAuth2Client(String appId, String secret) {
		this.appId = appId;
		this.secret = secret;
	}


	private static final String SCHEME = "https";

	private static final String CODE_URL_HOST = "open.weixin.qq.com/";
	private static final String CODE_URL_PATH = "connect/oauth2/authorize";

	private static final String ACCESS_TOKEN_URL_HOST = "api.weixin.qq.com";
	private static final String ACCESS_TOKEN_URL_PATH = "/sns/oauth2/access_token";

	private List<NameValuePair> codeBnvps = Lists.newArrayList();
	private List<NameValuePair> userInfoBnvps = Lists.newArrayList();
	private List<NameValuePair> atBnvps = Lists.newArrayList();

	private List<NameValuePair> getBasicCodeUrlParams() {
		synchronized (codeBnvps) {
			if (codeBnvps.isEmpty()) {
				codeBnvps.add(new BasicNameValuePair("appid", appId));
				codeBnvps.add(new BasicNameValuePair("response_type", "code"));
				codeBnvps.add(new BasicNameValuePair("scope", "snsapi_base"));
				codeBnvps.add(new BasicNameValuePair("state", "STATE"));
			}
		}
		return Lists.newArrayList(codeBnvps);
	}

	private List<NameValuePair> getUserInfoCodeUrlParams() {
		synchronized (userInfoBnvps) {
			if (userInfoBnvps.isEmpty()) {
				userInfoBnvps.add(new BasicNameValuePair("appid", appId));
				userInfoBnvps.add(new BasicNameValuePair("response_type",
						"code"));
				userInfoBnvps.add(new BasicNameValuePair("scope",
						"snsapi_userinfo"));
				userInfoBnvps.add(new BasicNameValuePair("state", "STATE"));
			}
		}
		return Lists.newArrayList(userInfoBnvps);
	}

	private List<NameValuePair> getBasicAccessTokenUrlParams() {
		synchronized (atBnvps) {
			if (atBnvps.isEmpty()) {
				atBnvps.add(new BasicNameValuePair("appid", appId));
				atBnvps.add(new BasicNameValuePair("secret", secret));
				atBnvps.add(new BasicNameValuePair("grant_type", GRANT_TYPE));
			}
		}
		return Lists.newArrayList(atBnvps);
	}

	private List<NameValuePair> appendParam(
			final List<NameValuePair> basicParams, NameValuePair param) {
		basicParams.add(param);
		return basicParams;
	}

	private List<NameValuePair> appendParamToBasicCodeUrlParams(
			String name, String value) {
		return appendParam(getBasicCodeUrlParams(), new BasicNameValuePair(
				name, value));
	}

	private List<NameValuePair> appendParamToUserInfoCodeUrlParams(
			String name, String value) {
		return appendParam(getUserInfoCodeUrlParams(), new BasicNameValuePair(
				name, value));
	}

	private List<NameValuePair> appendParamToBasicAccessTokenUrlParams(
			String name, String value) {
		return appendParam(getBasicAccessTokenUrlParams(),
				new BasicNameValuePair(name, value));
	}

	private String buildUrl(String scheme, String host, String path,
			List<NameValuePair> params, String fragment) {
		return new URIBuilder().setScheme(scheme).setHost(host).setPath(path)
				.setParameters(params).setFragment(fragment).toString();
	}

	private String buildCodeUrl(List<NameValuePair> params) {
		return buildUrl(SCHEME, CODE_URL_HOST, CODE_URL_PATH, params,
				"wechat_redirect");
	}

	private String buildAccessTokenUrl(List<NameValuePair> params) {
		return buildUrl(SCHEME, ACCESS_TOKEN_URL_HOST, ACCESS_TOKEN_URL_PATH,
				params, null);
	}

	public static String encode(String value) {
		return encode(value, DEFAULT_ENC);
	}

	public static String encode(String value, String enc) {
		try {
			return URLEncoder.encode(value, enc);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getCodeUrl(String redirectUrl) {
		return buildCodeUrl(appendParamToBasicCodeUrlParams("redirect_uri",
				checkNotNull(redirectUrl)));
	}

	public String getUserInfoCodeUrl(String redirectUrl) {
		List<NameValuePair> list = appendParamToUserInfoCodeUrlParams(
				"redirect_uri", checkNotNull(redirectUrl));
		Collections.sort(list, new Comparator<NameValuePair>() {
			public int compare(NameValuePair arg0, NameValuePair arg1) {
				return arg0.getName().compareTo(arg1.getName());
			}
		});
		return buildCodeUrl(list);
	}

	public String getAccessTokenUrl(String code) {
		return buildAccessTokenUrl(appendParamToBasicAccessTokenUrlParams(
				"code", checkNotNull(code)));
	}

	public WxAuthUser getWxAuthUser(String code) {
		WxAuthUser authUser = null;
		try {
			authUser = WxAuthUtil.getWxAuthUser(appId, secret, code);
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
		return authUser;
	}
}
