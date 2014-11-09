/*
 * @(#)BaseMongoEntity.java Jul 25, 2014
 * 
 * Copyright (c) 2014 Wepu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

public class BaseMongoEntity {
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
