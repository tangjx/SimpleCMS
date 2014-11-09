/*
 * @(#)WpResourceMessageUtils.java Jun 7, 2014)
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.utils;

import java.text.MessageFormat;


/*
 * @Title: WpResourceMessageUtils.java
 * @Description: get resource message
 * @author atang atang@1v.cn  
 * @date Jun 7, 2014 9:19:15 PM
 * @version V1.0  
 */
public class WpResourceMessageUtils {
	private static final String MSG_PATH = "i18n/message";
	
	public static String getMessage(String msgHandler, Object... args) {
		String msg = WpResourceBundleUtils.getBundleString(MSG_PATH,
				msgHandler);
		msg = MessageFormat.format(msg, args);
		return msg;
	}
}
