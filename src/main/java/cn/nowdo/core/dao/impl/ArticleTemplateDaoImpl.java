/*
 * @(#)ArticleTemplateDaoImpl.java Oct 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.dao.impl;

import java.util.List;

import cn.nowdo.cloud.base.dao.impl.GenericDaoImpl;
import cn.nowdo.core.dao.ArticleTemplateDao;
import cn.nowdo.core.entity.ArticleTemplate;

/*
 * @Title: ArticleTemplateDaoImpl.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Oct 23, 2014 10:49:42 AM
 * @version V1.0  
 */
public class ArticleTemplateDaoImpl extends
		GenericDaoImpl<ArticleTemplate, String> implements ArticleTemplateDao {

	@Override
	public List<ArticleTemplate> findListOnePage(String hql, int firstResult,
			int maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

}
