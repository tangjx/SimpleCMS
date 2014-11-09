/*
 * @(#)ArticleType.java Aug 4, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.nowdo.cloud.base.entity.BaseEntity;

/*
 * @Title: ArticleType.java
 * @Description:
 * @author atang atang@1v.cn  
 * @date Aug 4, 2014 10:03:25 PM
 * @version V1.0  
 */

@Entity
@Table(name = "t_article_type")
public class ArticleType extends BaseEntity{
	private String name;
	private String description;
	private String templete;
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
	 * @return the templete
	 */
	public String getTemplete() {
		return templete;
	}
	/**
	 * @param templete the templete to set
	 */
	public void setTemplete(String templete) {
		this.templete = templete;
	}
}
