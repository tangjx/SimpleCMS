/*
 * @(#)ArticleService.java Aug 4, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.service;

import cn.nowdo.core.entity.Article;
import cn.nowdo.core.entity.ArticleAttachment;
import cn.nowdo.core.model.Pager;

import java.util.List;

/*
 * @Title: ArticleService.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Aug 4, 2014 10:08:56 PM
 * @version V1.0  
 */
public interface ArticleService {
    /**
     *
     * @param article
     * @return article
     */
    public Article publishArticle(Article article);

    /**
     *
     * @param article
     * @param statistic 是否静态化
     * @return
     */
    public Article publishArticle(Article article, boolean statistic);

    /**
     *
     * @param article
     * @param articleAttachments
     * @param statistic
     * @return
     */
    public Article publishArticle(Article article, List<ArticleAttachment> articleAttachments, boolean statistic);

    /**
     *
     * @param articleId
     * @param del 是否物理删除
     * @return 删除是否成功
     */
    public boolean dropArticle(String articleId, boolean del);

    /**
     *
     * @param article
     * @return　文章实体
     */
    public Article rePublishArticle(Article article);

    /**
     *
     * @param articleId
     * @return　文章实体
     */
    public Article readArticle(String articleId);

    /**
     *
     * @param channelId
     * @return　文章列表
     */
    public List<Article> getArticlesByChannel(String channelId);

    /**
     *
     * @param channelId     栏目ＩＤ
     * @param firstResult　 开始记录
     * @param maxResults　　记录数
     * @return             文章实体分页
     */
    public Pager<Article> getArticlesByChannelAndPage(String channelId, int firstResult, int maxResults);

    /**
     *
     * @param tagId          标签ＩＤ
     * @param firstResult　　 开始记录
     * @param maxResults　　　记录数
     * @return　　　　　　　   文章分页实体
     */
    public Pager<Article> getArticlesByTagAndPage(String tagId, int firstResult, int maxResults);

}
