package cn.nowdo.cloud.base.wx.message.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dom4j.Element;

public class WxRequestEventMessage extends WxMessage {
	
	public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";
	public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";
	public static final String EVENT_TYPE_CLICK = "CLICK";
	public static final String EVENT_TYPE_SCAN = "SCAN";
	private String event;
	private String eventKey;
	private String ticket;
	
	public WxRequestEventMessage() {
	}
	
	public WxRequestEventMessage(WxMessageHeader header, Element root) {
		super(header);
		if (root == null) {
			return;
		}
		setEvent(root.elementText("Event"));
		setEventKey(root.elementText("EventKey"));
		setTicket(root.elementText("Ticket"));
	}
	
	public String getMessageXMLString() {
		return null;
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventKey() {
		return this.eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}