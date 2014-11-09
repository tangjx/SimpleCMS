/*
 * @(#)WxRequestLocationMessage.java May 29, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dom4j.Element;


/*
 * @Title: WxRequestLocationMessage.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date May 29, 2014 5:12:30 PM
 * @version V1.0  
 */
public class WxRequestLocationMessage extends WxMessage{
	private String msgId;
	private String location_X;
	private String location_Y;
	private String scale;
	private String label;
	
	public WxRequestLocationMessage(WxMessageHeader header) {
		super(header);
	}

	public WxRequestLocationMessage(WxMessageHeader header, Element root) {
		super(header);
		if (root != null) {
			setMsgId(root.elementText("MsgId"));
			setLocation_X(root.elementText("Location_X"));
			setLocation_Y(root.elementText("Location_Y"));
			setScale(root.elementText("Scale"));
			setLabel(root.elementText("Label"));
		}
	}

	/**
	 * @return the msgId
	 */
	public String getMsgId() {
		return msgId;
	}

	/**
	 * @param msgId the msgId to set
	 */
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	/**
	 * @return the location_X
	 */
	public String getLocation_X() {
		return location_X;
	}

	/**
	 * @param location_X the location_X to set
	 */
	public void setLocation_X(String location_X) {
		this.location_X = location_X;
	}

	/**
	 * @return the location_Y
	 */
	public String getLocation_Y() {
		return location_Y;
	}

	/**
	 * @param location_Y the location_Y to set
	 */
	public void setLocation_Y(String location_Y) {
		this.location_Y = location_Y;
	}

	/**
	 * @return the scale
	 */
	public String getScale() {
		return scale;
	}

	/**
	 * @param scale the scale to set
	 */
	public void setScale(String scale) {
		this.scale = scale;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
