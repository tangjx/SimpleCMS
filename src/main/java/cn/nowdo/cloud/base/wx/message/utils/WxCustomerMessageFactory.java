/*
 * @(#)WxCustomerMessageFactory.java May 29, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.utils;

import cn.nowdo.cloud.base.wx.message.entity.WxCustomerImage;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerImageMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerText;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerTextMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerVideo;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerVideoMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerVoice;
import cn.nowdo.cloud.base.wx.message.entity.WxCustomerVoiceMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestImageMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestVideoMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxRequestVoiceMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxTextMessage;

/*
 * @Title: WxCustomerMessageFactory.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date May 29, 2014 5:23:06 PM
 * @version V1.0  
 */
public class WxCustomerMessageFactory {
	public static WxCustomerTextMessage createTextMessage(WxTextMessage textMessage) {
		WxCustomerTextMessage message = new WxCustomerTextMessage();
		WxCustomerText text = new WxCustomerText();
		text.setContent(textMessage.getContent());
		message.setText(text);
		return message;
	}
	
	public static WxCustomerImageMessage createImageMessage(WxRequestImageMessage imageMessage) {
		WxCustomerImageMessage message = new WxCustomerImageMessage();
		WxCustomerImage image = new WxCustomerImage();
		image.setMedia_id(imageMessage.getMediaId());
		message.setImage(image);
		return message;
	}
	
	public static WxCustomerVoiceMessage createVoiceMessage(WxRequestVoiceMessage voiceMessage) {
		WxCustomerVoiceMessage message = new WxCustomerVoiceMessage();
		WxCustomerVoice voice = new WxCustomerVoice();
		voice.setMedia_id(voiceMessage.getMediaId());
		message.setVoice(voice);
		return message;
	}
	
	public static WxCustomerVideoMessage createVideoMessage(WxRequestVideoMessage videoMessage) {
		WxCustomerVideoMessage message = new WxCustomerVideoMessage();
		WxCustomerVideo video = new WxCustomerVideo();
		video.setMedia_id(videoMessage.getMediaId());
		video.setTitle("转发视频消息");
		video.setDescription("转发视频消息");
		message.setVideo(video);
		return message;
	}
}
