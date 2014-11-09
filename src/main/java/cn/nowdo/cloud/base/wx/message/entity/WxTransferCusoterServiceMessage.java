/*
 * @(#)WxTransferCusoterServiceMessage.java Jun 5, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import cn.nowdo.cloud.base.wx.WxConstants;

/*
 * @Title: WxTransferCusoterServiceMessage.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Jun 5, 2014 8:36:07 PM
 * @version V1.0  
 */
public class WxTransferCusoterServiceMessage extends WxMessage{

	public WxTransferCusoterServiceMessage() {
	}
	/**
	 * @param header
	 */
	public WxTransferCusoterServiceMessage(WxMessageHeader header) {
		super(header);
		header.setMsgType(WxConstants.MSG_TYPE_TRANSFER_CUSTOMER_SERVICE);
	}

	@Override
	public String getMessageXMLString() {
		StringBuilder stringBuilder = new StringBuilder("<xml>");
		stringBuilder.append(getMessageHeader().getMessageHeaderXMLString());
		stringBuilder.append("</xml>");
		return stringBuilder.toString();
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
