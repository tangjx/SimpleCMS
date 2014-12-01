/*
 * @(#)ArticleTemplateServiceImpl.java Oct 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.service.impl;

import cn.nowdo.core.entity.ArticleTemplate;
import cn.nowdo.core.service.ArticleTemplateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * @Title: ArticleTemplateServiceImpl.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Oct 23, 2014 10:44:01 AM
 * @version V1.0  
 */
@Service
@Transactional
public class ArticleTemplateServiceImpl implements ArticleTemplateService {

    @Override
    public ArticleTemplate newArticleTemplate(ArticleTemplate articleTemplate) {
        return null;
    }

    @Override
    public boolean dropArticleTemplate(String articleTemplateId) {
        return false;
    }

    @Override
    public ArticleTemplate modifyArticleTemplate(ArticleTemplate articleTemplate) {
        return null;
    }

    @Override
    public ArticleTemplate readArticleTemplate(String articleTemplateId) {
        return null;
    }
}
