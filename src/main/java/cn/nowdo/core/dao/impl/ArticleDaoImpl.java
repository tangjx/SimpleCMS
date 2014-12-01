/*
 * @(#)ArticleDaoImpl.java Aug 4, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.dao.impl;

import cn.nowdo.cloud.base.dao.impl.GenericDaoImpl;
import cn.nowdo.core.dao.ArticleDao;
import cn.nowdo.core.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @Title: ArticleDaoImpl.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Aug 4, 2014 10:07:27 PM
 * @version V1.0  
 */
@Repository
public class ArticleDaoImpl extends GenericDaoImpl<Article, String> implements ArticleDao{

    @Override
    public List<Article> getListByChannel(String channelId) {
        return findByHql(String.format("from %s article where article.channel.id = ? order by createDate desc", getEntityName()), channelId);
    }

    @Override
    public List<Article> getListByChannel(String channelId, int firstResult, int maxResults) {
        return findByHqlWithLimits(String.format("from %s article where article.channel.id = ? order by createDate desc", getEntityName()), firstResult, maxResults, channelId);
    }

    @Override
    public List<Article> getListByTag(String tagId, int firstResult, int maxResults) {
        return findByHqlWithLimits(String.format("from %s article where article.tag.id = ? order by createDate desc", getEntityName()), firstResult, maxResults, tagId);
    }

    @Override
    public long CountByChannel(String channelId) {
        return getCount(String.format("select count(*) from %s article where article.channel.id = ?", getEntityName()), channelId);
    }

    @Override
    public long CountByTag(String tagId) {
        return getCount(String.format("select count(*) from %s article where article.tag.id = ?", getEntityName()), tagId);
    }
}
