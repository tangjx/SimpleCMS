/*
 * @(#)WpResourceBundleUtils.java Apr 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.utils;

import java.util.ResourceBundle;

/*
 * @Title: WpResourceBundleUtils.java
 * @Description: resource bundle function util
 * @author atang atang@1v.cn  
 * @date Apr 23, 2014 11:35:05 AM
 * @version V1.0  
 */
public class WpResourceBundleUtils {
	public final static String BUNDLE_PAHT = "conf/system";
	
	public static String getBundleString(String path, String name) {
		ResourceBundle bundle = ResourceBundle.getBundle(path);
		if (bundle != null) {
			return bundle.getString(name);
		} else {
			return null;
		}
	}
	
	public static String getBundleString(String name) {
		return getBundleString(BUNDLE_PAHT, name);
	}
}
