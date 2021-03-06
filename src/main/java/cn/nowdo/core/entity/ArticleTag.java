/*
 * @(#)ArticleTar.java Sep 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.entity;

import cn.nowdo.cloud.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * @Title: ArticleTar.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Sep 23, 2014 9:31:51 AM
 * @version V1.0  
 */
@Entity
@Table(name = "t_article_tag")
public class ArticleTag extends BaseEntity{
	private String name;
	private String description;
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
}
