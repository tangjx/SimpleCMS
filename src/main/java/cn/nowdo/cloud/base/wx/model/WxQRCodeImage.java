package cn.nowdo.cloud.base.wx.model;

import org.apache.commons.lang3.builder.ToStringBuilder;


import com.google.gson.annotations.Expose;

public class WxQRCodeImage {

	@Expose
	private Integer deviceId;

	@Expose
	private String wxQRCodeImageURL;

	@Expose
	private WxTicket wxTicket;

	public WxTicket getWxTicket() {
		return this.wxTicket;
	}

	public void setWxTicket(WxTicket wxTicket) {
		this.wxTicket = wxTicket;
	}

	public String getWxQRCodeImageURL() {
		return this.wxQRCodeImageURL;
	}

	public void setWxQRCodeImageURL(String wxQRCodeImageURL) {
		this.wxQRCodeImageURL = wxQRCodeImageURL;
	}

	public Integer getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}