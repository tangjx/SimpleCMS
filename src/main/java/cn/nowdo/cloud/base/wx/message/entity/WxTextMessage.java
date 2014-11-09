/*
 * @(#)WxRquestTextMessage.java May 29, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dom4j.Element;


/*
 * @Title: WxRquestTextMessage.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date May 29, 2014 5:48:59 PM
 * @version V1.0  
 */
public class WxTextMessage extends WxMessage{
	private String msgId;
	private String content;
	
	public WxTextMessage(){}

	public WxTextMessage(WxMessageHeader header) {
		super(header);
	}

	public WxTextMessage(WxMessageHeader header, Element root) {
		super(header);
		if (root != null) {
			setMsgId(root.elementText("MsgId"));
			setContent(root.elementText("Content"));
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	
	public String getMessageXMLString() {
		StringBuilder stringBuilder = new StringBuilder("<xml>");
		stringBuilder.append(getMessageHeader().getMessageHeaderXMLString());
		stringBuilder.append("<Content><![CDATA[" + getContent()
				+ "]]></Content>");
		stringBuilder.append("</xml>");
		return stringBuilder.toString();
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
