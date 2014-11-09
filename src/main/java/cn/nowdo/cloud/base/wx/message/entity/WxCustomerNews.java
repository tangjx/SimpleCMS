/*
 * @(#)WxCustomerNews.java Apr 22, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.message.entity;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxCustomerNews.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Apr 22, 2014 4:29:32 PM
 * @version V1.0  
 */
public class WxCustomerNews {
	private List<WxCustomerArticle> articles;

	/**
	 * @return the articles
	 */
	public List<WxCustomerArticle> getArticles() {
		return articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<WxCustomerArticle> articles) {
		this.articles = articles;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
