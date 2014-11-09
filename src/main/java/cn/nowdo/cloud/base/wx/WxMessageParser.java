package cn.nowdo.cloud.base.wx;

import org.dom4j.Element;

import cn.nowdo.cloud.base.wx.message.entity.WxMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxMessageHeader;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestEventMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestImageMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestVideoMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestVoiceMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxTextMessage;
import cn.nowdo.cloud.utils.XmlUtils;

public class WxMessageParser {
	public static WxMessage parserMessage(Element root) {
		WxMessageHeader messageHeader = WxMessageHeader.inflateHeader(root);
		return createMessage(root, messageHeader);
	}

	public static WxMessage parserMessage(String xml) {
        Element root = XmlUtils.getRoot(xml);
	    WxMessageHeader messageHeader = WxMessageHeader.inflateHeader(root);
	    return createMessage(root, messageHeader);
	}

	private static WxMessage createMessage(Element root,
			WxMessageHeader messageHeader) {
		if ((root == null) || (messageHeader == null)) {
			return null;
		}
		WxMessage wxMessage = null;
		if (messageHeader.getMsgType().equals(WxConstants.MSG_TYPE_TEXT)) {
			wxMessage = new WxTextMessage(messageHeader, root);
		} else if (messageHeader.getMsgType().equals(WxConstants.MSG_TYPE_EVENT)) {
			wxMessage = new WxRequestEventMessage(messageHeader, root);
		} else if (messageHeader.getMsgType().equals(WxConstants.MSG_TYPE_IMAGE)) {
			wxMessage = new WxRequestImageMessage(messageHeader, root);
		} else if (messageHeader.getMsgType().equals(WxConstants.MSG_TYPE_VIDEO)) {
			wxMessage = new WxRequestVideoMessage(messageHeader, root);
		} else if (messageHeader.getMsgType().equals(WxConstants.MSG_TYPE_VOICE)) {
			wxMessage = new WxRequestVoiceMessage(messageHeader, root);
		}
		//TODO need to parse more message
		
		if (wxMessage == null) {
			wxMessage = new WxTextMessage(messageHeader);
		}
		return wxMessage;
	}
}