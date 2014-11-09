/*
 * @(#)WxCustomerMessageCreator.java Jun 1, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.utils;

import cn.nowdo.cloud.base.wx.WxConstants;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerImage;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerImageMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerText;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerTextMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerVideo;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerVideoMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerVoice;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerVoiceMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestImageMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestVideoMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestVoiceMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxTextMessage;

/*
 * @Title: WxCustomerMessageCreator.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Jun 1, 2014 5:03:36 PM
 * @version V1.0  
 */
public class WxCustomerMessageCreator {
	public static WxCustomerMessage createCustomerMessage(WxMessage message) {
		WxCustomerMessage customerMsg = null;
		switch(message.getMessageHeader().getMsgType()) {
		case WxConstants.MSG_TYPE_TEXT:
			if(message instanceof WxTextMessage) {
				WxCustomerTextMessage msg = new WxCustomerTextMessage();
				WxCustomerText text = new WxCustomerText();
				msg.setText(text);
				text.setContent(((WxTextMessage) message).getContent());
				customerMsg = msg;
			}
			break;
		case WxConstants.MSG_TYPE_IMAGE:
			if(message instanceof WxRequestImageMessage) {
				WxCustomerImageMessage msg = new WxCustomerImageMessage();
				WxCustomerImage image = new WxCustomerImage();
				msg.setImage(image);
				image.setMedia_id(((WxRequestImageMessage) message).getMediaId());
				customerMsg = msg;
			}
			break;
		case WxConstants.MSG_TYPE_VOICE:
			if(message instanceof WxRequestVoiceMessage) {
				WxCustomerVoiceMessage msg = new WxCustomerVoiceMessage();
				WxCustomerVoice voice = new WxCustomerVoice();
				msg.setVoice(voice);
				voice.setMedia_id(((WxRequestVoiceMessage) message).getMediaId());
				customerMsg = msg;
			}
			break;
			
		case WxConstants.MSG_TYPE_VIDEO:
			if(message instanceof WxRequestVideoMessage) {
				WxCustomerVideoMessage msg = new WxCustomerVideoMessage();
				WxCustomerVideo video = new WxCustomerVideo();
				msg.setVideo(video);
				video.setMedia_id(((WxRequestVideoMessage) message).getMediaId());
				customerMsg = msg;
			}
			break;
			default:
				break;
		}
		return customerMsg;
	}
	
	public static WxCustomerMessage createDefaultMessage(String text) {
		WxCustomerTextMessage customerMsg = new WxCustomerTextMessage();
		WxCustomerText customerText = new WxCustomerText();
		customerText.setContent(text);
		customerMsg.setText(customerText);
		return customerMsg;
	}
}
