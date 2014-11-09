package cn.nowdo.cloud.base.wx.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;

public class Text {

	@Expose
	private String content;

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}