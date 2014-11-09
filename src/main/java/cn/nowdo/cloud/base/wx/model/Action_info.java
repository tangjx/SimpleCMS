package cn.nowdo.cloud.base.wx.model;

import com.google.gson.annotations.Expose;


public class Action_info {

	@Expose
	private Scene scene;

	public Scene getScene() {
		return this.scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
}