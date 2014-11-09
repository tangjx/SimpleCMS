package cn.nowdo.cloud.base.wx.message.entity;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({
	WxRequestImageMessage.class,
	WxRequestVideoMessage.class,
	WxRequestVoiceMessage.class,
})
public class WxRequestMediaMessage extends WxMessage{

	private String mediaId;
	private String msgId;
	
	public WxRequestMediaMessage() {
		
	}
	
	public WxRequestMediaMessage(WxMessageHeader header) {
		super(header);
	}
	
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	
}
