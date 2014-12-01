/*
 * @(#)ArticleServiceImpl.java Aug 4, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.service.impl;

import cn.nowdo.core.dao.ArticleAttachmentDao;
import cn.nowdo.core.dao.ArticleDao;
import cn.nowdo.core.entity.Article;
import cn.nowdo.core.entity.ArticleAttachment;
import cn.nowdo.core.model.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nowdo.core.service.ArticleService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 * @Title: ArticleServiceImpl.java
 * @Description:
 * @author atang atang@1v.cn  
 * @date Aug 4, 2014 10:09:23 PM
 * @version V1.0  
 */

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private ArticleAttachmentDao articleAttachmentDao;

    @Override
    public Article publishArticle(Article article) {
        articleDao.save(article);
        return article;
    }

    @Override
    public Article publishArticle(Article article, List<ArticleAttachment> articleAttachments, boolean statistic) {
        if(articleAttachments != null) {
            for(ArticleAttachment attachment : articleAttachments) {
                if(attachment != null && attachment.getId() == null) {
                    articleAttachmentDao.save(attachment);
                }
            }
            article.setAttachements(articleAttachments);
        }
        articleDao.save(article);
        return article;
    }

    @Override
    public boolean dropArticle(String articleId, boolean del) {
        boolean result = false;
        Article article = articleDao.get(articleId);
        if(article != null) {
            articleDao.delete(article);
            result = true;
        }
        return result;
    }

    @Override
    public Article rePublishArticle(Article article) {
        articleDao.update(article);
        return article;
    }

    @Override
    public Article readArticle(String articleId) {
        return articleDao.get(articleId);
    }

    @Override
    public List<Article> getArticlesByChannel(String channelId) {
        return articleDao.getListByChannel(channelId);
    }

    @Override
    public Pager<Article> getArticlesByChannelAndPage(String channelId, int firstResult, int maxResults) {
        Pager<Article> pager = new Pager<>();
        pager.setTotal(articleDao.CountByChannel(channelId));
        pager.setRows(articleDao.getListByChannel(channelId, firstResult, maxResults));
        return pager;
    }

    @Override
    public Pager<Article> getArticlesByTagAndPage(String tagId, int firstResult, int maxResults) {
        Pager<Article> pager = new Pager<>();
        pager.setTotal(articleDao.CountByTag(tagId));
        pager.setRows(articleDao.getListByTag(tagId, firstResult, maxResults));
        return pager;
    }

    @Override
    public Article publishArticle(Article article, boolean statistic) {
        articleDao.save(article);
        return article;
    }
}
