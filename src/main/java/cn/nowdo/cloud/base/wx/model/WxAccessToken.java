package cn.nowdo.cloud.base.wx.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class WxAccessToken {
	private String access_token;
	private Integer expires_in;

	public String getAccess_token() {
		return this.access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Integer getExpires_in() {
		return this.expires_in;
	}

	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}