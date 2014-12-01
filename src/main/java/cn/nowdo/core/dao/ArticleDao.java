/*
 * @(#)ArticleDao.java Aug 4, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.dao;

import cn.nowdo.cloud.base.dao.GenericDao;
import cn.nowdo.core.entity.Article;

import java.util.List;

/*
 * @Title: ArticleDao.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Aug 4, 2014 10:06:23 PM
 * @version V1.0  
 */
public interface ArticleDao extends GenericDao<Article, String> {

    public List<Article> getListByChannel(String channelId);

    public List<Article> getListByChannel(String channelId, int firstResult, int maxResults);

    public List<Article> getListByTag(String tagId, int firstResult, int maxResults);

    public long CountByChannel(String channelId);

    public long CountByTag(String tagId);

}
