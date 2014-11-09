package cn.nowdo.cloud.base.wx.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;

public class WxTicket {

	@Expose
	private String ticket;

	@Expose
	private Integer expire_seconds;

	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public Integer getExpire_seconds() {
		return this.expire_seconds;
	}

	public void setExpire_seconds(Integer expire_seconds) {
		this.expire_seconds = expire_seconds;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}