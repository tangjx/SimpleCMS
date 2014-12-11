/*
 * @(#)ArticleAction.java Aug 4, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.action;


import cn.nowdo.core.entity.Article;
import cn.nowdo.core.entity.Channel;
import cn.nowdo.core.service.ArticleService;
import cn.nowdo.core.service.ChannelService;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import cn.nowdo.cloud.base.action.BaseAction;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

	@Autowired
	private ArticleService articleService;
	@Autowired
	private ChannelService channelService;
	
	@Action(value = "test")
	public String test() {
		logger.info("ArticleAction, dddddd");
		return NONE;
	}

	@Action(value = "add_article", results = {
			@Result(name = SUCCESS, location = "/app/article/article_add.jsp")})
	public String addArticle() {
		List<Channel> channelList = channelService.getChannelListByRight(null);
		setRequestAttribute("channelList", channelList);
		return SUCCESS;
	}

	@Action(value = "add_article_submit")
	public String addArticleSubmit() {
		String title = getRequestParameter("title");
		String content = getRequestParameter("content");
		String description = getRequestParameter("description");
		String channelId = getRequestParameter("channelId");
		Article article = new Article();
		article.setTitle(title);
		article.setContent(content);
		article.setDescription(description);
		Channel channel = channelService.readChannel(channelId);
		article.setChannel(channel);
		articleService.publishArticle(article);
		renderJson("success");
		return NONE;
	}

	@Action(value = "modify_article", results = {
			@Result(name = SUCCESS, location = "/app/article/article_modify.jsp")
	})
	public String modifyArticle() {
		String articleId = getRequestParameter("articleId");
		Article article = articleService.readArticle(articleId);
		setRequestAttribute("article", article);
		return SUCCESS;
	}

	@Action(value = "modify_article_submit")
	public String modifyArticleSubmit() {
		String articleId = getRequestParameter("articleId");
		String title = getRequestParameter("title");
		String content = getRequestParameter("content");
		String description = getRequestParameter("description");
		String channelId = getRequestParameter("channelId");
		Article article = articleService.readArticle(articleId);
		article.setTitle(title);
		article.setContent(content);
		article.setDescription(description);
		article.setChannel(channelService.readChannel(channelId));
		articleService.rePublishArticle(article);
		renderJson("success");
		return NONE;
	}

	@Action(value = "drop_article")
	public String dropArticle() {
		String articleId = getRequestParameter("articleId");
		boolean result = articleService.dropArticle(articleId, true);
		renderJson(result);
		return NONE;
	}

}
