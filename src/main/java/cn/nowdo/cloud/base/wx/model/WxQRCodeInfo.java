package cn.nowdo.cloud.base.wx.model;


import com.google.gson.annotations.Expose;

public class WxQRCodeInfo {

	@Expose
	private Integer expire_seconds;

	@Expose
	private String action_name;

	@Expose
	private Action_info action_info;

	public Integer getExpire_seconds() {
		return this.expire_seconds;
	}

	public void setExpire_seconds(Integer expire_seconds) {
		this.expire_seconds = expire_seconds;
	}

	public String getAction_name() {
		return this.action_name;
	}

	public void setAction_name(String action_name) {
		this.action_name = action_name;
	}

	public Action_info getAction_info() {
		return this.action_info;
	}

	public void setAction_info(Action_info action_info) {
		this.action_info = action_info;
	}
}