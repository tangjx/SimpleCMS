/*
 * @(#)WxMessageFactory.java Aug 5, 2014
 * 
 * Copyright (c) 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.utils;

import org.apache.log4j.Logger;

import cn.nowdo.cloud.base.wx.message.entity.WxMessage;
import cn.nowdo.cloud.base.wx.message.entity.WxMessageHeader;

public final class WxMessageUtils {

    private static Logger logger = Logger.getLogger(WxMessageUtils.class);

    public static <T extends WxMessage> T createReplyMessage(WxMessage orignalMessage, Class<T> classOfMessage) {
        T replyMessage = null;
        try {
            replyMessage = classOfMessage.newInstance();
            replyMessage.setMessageHeader(exchangeUsers(orignalMessage.getMessageHeader()));
        } catch (Exception e) {
            logger.error("message", e);
        }
        return replyMessage;
    }

    public static WxMessageHeader exchangeUsers(WxMessageHeader messageHeader) {
    	WxMessageHeader header = new WxMessageHeader();
    	if (messageHeader != null) {
            final String fromUserName = messageHeader.getFromUserName();
            final String toUserName = messageHeader.getToUserName();
            header.setFromUserName(toUserName);
            header.setToUserName(fromUserName);
        }
        return header;
    }
}
