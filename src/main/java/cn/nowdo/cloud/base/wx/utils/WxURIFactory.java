package cn.nowdo.cloud.base.wx.utils;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.utils.URIBuilder;

public class WxURIFactory {
	
	private final static String WX_BASE_URL = "api.weixin.qq.com/cgi-bin/";
	
	public static URI getWxAccessTokenURI( String appId,
			String secret) throws URISyntaxException {
		URIBuilder uriBuilder = new URIBuilder().setScheme("https")
				.setHost(WX_BASE_URL).setPath("token")
				.setParameter("grant_type", "client_credential")
				.setParameter("appid", appId).setParameter("secret", secret);

		return uriBuilder.build();
	}

	public static URI getWxSendCustomMessageURI(
			String accesssToken) throws URISyntaxException {
		URIBuilder uriBuilder = new URIBuilder().setScheme("https")
				.setHost(WX_BASE_URL).setPath("message/custom/send")
				.setParameter("access_token", accesssToken);

		return uriBuilder.build();
	}
	
	public static URI getWxCreateCustomMenuURI(
			String accesssToken) {
		URIBuilder uriBuilder = new URIBuilder().setScheme("https")
				.setHost(WX_BASE_URL)
				.setPath("menu/create")
				.setParameter("access_token", accesssToken);

		try {
			return uriBuilder.build();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static URI getWxCreateQRCodeURI(String accesssToken) throws URISyntaxException {
		URIBuilder uriBuilder = new URIBuilder().setScheme("https")
				.setHost(WX_BASE_URL).setPath("qrcode/create")
				.setParameter("access_token", accesssToken);

		return uriBuilder.build();
	}
	
	public static URI getWxUserListURI(
			String accesssToken) throws URISyntaxException {
		URIBuilder uriBuilder = new URIBuilder().setScheme("https")
				.setHost(WX_BASE_URL).setPath("user/get")
				.setParameter("access_token", accesssToken);

		return uriBuilder.build();
	}
	
	public static URI getWxUserListURI(
			String accesssToken, String nextOpenId) throws URISyntaxException {
		URIBuilder uriBuilder = new URIBuilder().setScheme("https")
				.setHost(WX_BASE_URL).setPath("user/get")
				.setParameter("access_token", accesssToken)
				.setParameter("next_openid", nextOpenId);

		return uriBuilder.build();
	}
}