/*
 * @(#)WxAuthURIFactory.java Mar 9, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.auth.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.http.client.utils.URIBuilder;

/*
 * @Title: WxAuthURIFactory.java
 * @Description: 微信构造获取授权url的工具类
 * @author atang atang@1v.cn  
 * @date Mar 9, 2014 10:47:53 AM
 * @version V1.0  
 */
public class WxAuthURIFactory {
	public static URI getURI(String scheme, String baseURI, String path, Map<String, String> paramMap) throws URISyntaxException {
		URIBuilder uriBuilder = new URIBuilder().setScheme(scheme)
				.setHost(baseURI).setPath(path);
		if(paramMap != null) {
			for(String key : paramMap.keySet()) {
				uriBuilder.setParameter(key, paramMap.get(key));
			}
		}
		return uriBuilder.build();
	}
}
