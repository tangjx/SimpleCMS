/*
 * @(#)ArticleAttachement.java Sep 23, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.core.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cn.nowdo.cloud.base.entity.BaseEntity;

/*
 * @Title: ArticleAttachement.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Sep 23, 2014 9:34:02 AM
 * @version V1.0  
 */
@Entity
@Table(name = "t_article_attachment")
public class ArticleAttachment extends BaseEntity{
	private String name;
	private String description;
	private String type;
	private String url;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="articleId")
	private Article article;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
