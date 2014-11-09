/*
 * @(#)ArticleTemplete.java Sep 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.nowdo.cloud.base.entity.BaseEntity;

/*
 * @Title: ArticleTemplete.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Sep 23, 2014 9:46:04 AM
 * @version V1.0  
 */
@Entity
@Table(name = "t_article_template")
public class ArticleTemplate extends BaseEntity{
	private String name;
	private String description;
	private String type;
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
}
