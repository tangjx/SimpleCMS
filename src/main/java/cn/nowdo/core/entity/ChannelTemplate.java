/*
 * @(#)ChannelTemplete.java Sep 23, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.nowdo.cloud.base.entity.BaseEntity;

/*
 * @Title: ChannelTemplete.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Sep 23, 2014 9:41:42 AM
 * @version V1.0  
 */
@Entity
@Table(name = "t_channel_template")
public class ChannelTemplate extends BaseEntity{
	private String name;
	private String description;
	private String meta;
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
	 * @return the meta
	 */
	public String getMeta() {
		return meta;
	}
	/**
	 * @param meta the meta to set
	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}
}
