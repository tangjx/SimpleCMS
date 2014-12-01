/*
 * @(#)ArticleTemplateService.java Oct 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.service;

import cn.nowdo.core.entity.ArticleTemplate;

/*
 * @Title: ArticleTemplateService.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Oct 23, 2014 10:41:43 AM
 * @version V1.0  
 */
public interface ArticleTemplateService {
    /**
     *
     * @param articleTemplate
     * @return
     */
    public ArticleTemplate newArticleTemplate(ArticleTemplate articleTemplate);

    /**
     *
     * @param articleTemplateId
     * @return
     */
    public boolean dropArticleTemplate(String articleTemplateId);

    /**
     *
     * @param articleTemplate
     * @return
     */
    public ArticleTemplate modifyArticleTemplate(ArticleTemplate articleTemplate);

    /**
     *
     * @param articleTemplateId
     * @return
     */
    public ArticleTemplate readArticleTemplate(String articleTemplateId);
}
