package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dom4j.Element;

public class WxMessageHeader {
	
	private String toUserName;
	private String fromUserName;
	private String createTime;
	private String msgType;

	public String getToUserName() {
		return this.toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return this.fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMessageHeaderXMLString() {
		StringBuilder replyMsgHeaderXml = new StringBuilder();

		replyMsgHeaderXml.append("<ToUserName><![CDATA[" + getToUserName()
				+ "]]></ToUserName>");
		replyMsgHeaderXml.append("<FromUserName><![CDATA[" + getFromUserName()
				+ "]]></FromUserName>");
		replyMsgHeaderXml.append("<CreateTime>" + getCreateTime()
				+ "</CreateTime>");
		replyMsgHeaderXml.append("<MsgType><![CDATA[" + getMsgType()
				+ "]]></MsgType>");

		return replyMsgHeaderXml.toString();
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public static WxMessageHeader inflateHeader(Element root) {
		WxMessageHeader wsMessageHeader = new WxMessageHeader();
		if (root != null) {
			wsMessageHeader.setToUserName(root.elementText("ToUserName"));
			wsMessageHeader.setFromUserName(root.elementText("FromUserName"));
			wsMessageHeader.setCreateTime(root.elementText("CreateTime"));
			wsMessageHeader.setMsgType(root.elementText("MsgType"));
		}
		return wsMessageHeader;
	}
}