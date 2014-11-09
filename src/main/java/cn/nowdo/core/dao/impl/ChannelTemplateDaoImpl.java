/*
 * @(#)ChannelTemplateDaoImpl.java Oct 23, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.core.dao.impl;

import java.util.List;

import cn.nowdo.cloud.base.dao.impl.GenericDaoImpl;
import cn.nowdo.core.dao.ChannelTemplateDao;
import cn.nowdo.core.entity.ChannelTemplate;

/*
 * @Title: ChannelTemplateDaoImpl.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Oct 23, 2014 10:52:05 AM
 * @version V1.0  
 */
public class ChannelTemplateDaoImpl extends GenericDaoImpl<ChannelTemplate, String> implements
		ChannelTemplateDao {

	@Override
	public List<ChannelTemplate> findListOnePage(String hql, int firstResult,
			int maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

}
