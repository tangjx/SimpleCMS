package cn.nowdo.cloud.base.wx.message.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.commons.lang3.builder.ToStringBuilder;


@XmlSeeAlso({
	WxRequestEventMessage.class,
	WxRequestLinkMessage.class,
	WxRequestLocationMessage.class,
	WxRequestMediaMessage.class,
	WxResponseNewsMessage.class,
	WxTextMessage.class,
	WxTransferCusoterServiceMessage.class
})
public class WxMessage {
	private WxMessageHeader messageHeader;
	
	public WxMessage(WxMessageHeader header){
		this.messageHeader = header;
	}
	
	public WxMessage() {
		
	}

	public WxMessageHeader getMessageHeader() {
		return this.messageHeader;
	}
	
	public void setMessageHeader(WxMessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public String getMessageXMLString(){
		return "";
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public static WxMessageHeader createResponseMessageHeader(
			WxMessageHeader wxMessageHeader, String responseMsgType) {
		WxMessageHeader outHeader = new WxMessageHeader();

		outHeader.setCreateTime("" + new Date().getTime());
		outHeader.setFromUserName(wxMessageHeader.getToUserName());
		outHeader.setToUserName(wxMessageHeader.getFromUserName());
		outHeader.setMsgType(responseMsgType);

		return outHeader;
	}
}