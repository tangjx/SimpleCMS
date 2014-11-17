/*
 * @(#)ArticleAction.java Aug 4, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.action;


import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import cn.nowdo.cloud.base.action.BaseAction;

/*
 * @Title: ArticleAction.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Aug 4, 2014 10:13:12 PM
 * @version V1.0  
 */

@ParentPackage("default")
@Namespace("/article")
public class ArticleAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private Logger logger = Logger.getLogger(ArticleAction.class);
	
	@Action(value = "test")
	public String test() {
		logger.info("ArticleAction, dddddd");
		return NONE;
	}

}
