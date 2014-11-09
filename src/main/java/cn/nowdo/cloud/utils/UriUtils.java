/*
 * @(#)UriUtil Jun 13, 2014
 * 
 * Copyright (c) 2014 Wepu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.utils;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;

public final class UriUtils {
	private static final String DEFAULT_ENC = "utf8";

	private UriUtils() {
	}

	public static String appendParamsToCompleteUri(String uri, NameValuePair... param) {
		try {
			return new URIBuilder(uri).setParameters(param).toString();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
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

	public static String decode(String value) {
		return decode(value, DEFAULT_ENC);
	}

	public static String decode(String value, String enc) {
		try {
			return URLDecoder.decode(value, enc);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
