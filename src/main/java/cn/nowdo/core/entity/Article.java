/*
 * @(#)Article.java Aug 4, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cn.nowdo.cloud.base.entity.BaseEntity;
import org.hibernate.annotations.Type;

/*
 * @Title: Article.java
 * @Description:
 * @author atang atang@1v.cn  
 * @date Aug 4, 2014 9:37:13 PM
 * @version V1.0  
 */

@Entity
@Table(name = "t_article")
public class Article extends BaseEntity{
	private String title;
	private String subTitle;
	private String description;
	private String meta;
	@Type(type="text")
	private String content;
	private String tag;
	@OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
	private List<ArticleAttachment> attachements;
	@OneToOne
	@JoinColumn(name = "templateId")
	private ArticleTemplate template;
	@OneToOne
	@JoinColumn(name = "channelId")
	private Channel channel;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}
	/**
	 * @param subTitle the subTitle to set
	 */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return the attachements
	 */
	public List<ArticleAttachment> getAttachements() {
		return attachements;
	}
	/**
	 * @param attachements the attachements to set
	 */
	public void setAttachements(List<ArticleAttachment> attachements) {
		this.attachements = attachements;
	}
	/**
	 * @return the template
	 */
	public ArticleTemplate getTemplate() {
		return template;
	}
	/**
	 * @param template the template to set
	 */
	public void setTemplate(ArticleTemplate template) {
		this.template = template;
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

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
}
