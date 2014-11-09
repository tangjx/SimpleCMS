/*
 * @(#)GenericDao.java Jun 7, 2014
 * 
 * Copyright (C) 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.dao;

import java.io.Serializable;
import java.util.List;

import cn.nowdo.cloud.base.entity.BaseEntity;

public interface GenericDao<T extends BaseEntity, PK extends Serializable> {

    public PK save(T t);

    public void saveOrUpdate(T t);

    public void delete(T t);

    public void update(T t);

    public T get(PK id);
    
    public List<T> findListOnePage(String hql, int firstResult, int maxResults);
}
