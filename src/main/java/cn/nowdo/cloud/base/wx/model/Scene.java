package cn.nowdo.cloud.base.wx.model;

import com.google.gson.annotations.Expose;

public class Scene {

	@Expose
	private Long scene_id;

	public Long getScene_id() {
		return this.scene_id;
	}

	public void setScene_id(Long scene_id) {
		this.scene_id = scene_id;
	}
}