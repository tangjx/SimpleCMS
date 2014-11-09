/*
 * @(#)Channel.java Sep 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cn.nowdo.cloud.base.entity.BaseEntity;

/*
 * @Title: Channel.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Sep 23, 2014 9:39:55 AM
 * @version V1.0  
 */

@Entity
@Table(name = "t_channel")
public class Channel extends BaseEntity {
	private String name;
	private String description;
	@OneToOne
	@JoinColumn(name = "templateId")
	private ChannelTemplate template;
	@ManyToOne  
    @JoinColumn(name="parentChannelId")
	private Channel parentChannel;
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
	 * @return the template
	 */
	public ChannelTemplate getTemplate() {
		return template;
	}
	/**
	 * @param template the template to set
	 */
	public void setTemplate(ChannelTemplate template) {
		this.template = template;
	}
	/**
	 * @return the parentChannel
	 */
	public Channel getParentChannel() {
		return parentChannel;
	}
	/**
	 * @param parentChannel the parentChannel to set
	 */
	public void setParentChannel(Channel parentChannel) {
		this.parentChannel = parentChannel;
	}
}
