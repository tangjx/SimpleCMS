/*
 * @(#)GenericDaoImpl.java Jun 7, 2014
 * 
 * Copyright (C) 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

import cn.nowdo.cloud.base.dao.GenericDao;
import cn.nowdo.cloud.base.entity.BaseEntity;

@SuppressWarnings("unchecked")
public class GenericDaoImpl<T extends BaseEntity, PK extends Serializable> implements GenericDao<T, PK> {
    private Class<T> entityClass;

    public GenericDaoImpl() {
        entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    protected Class<T> getEntityClass() {
        return entityClass;
    }

    protected String getEntityName() {
        return entityClass.getSimpleName();
    }

    private Criteria createCriteriaByEntityClass() {
        return getCurrentSession().createCriteria(getEntityClass());
    }

    private Query createHqlQuery(String queryString) {
        return getCurrentSession().createQuery(queryString);
    }

    private Query setQueryParams(Query query, Object... params) {
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                query.setParameter(i, params[i]);
            }
        }
        return query;
    }

    private Query setQueryParams(Query query, Map<String, Object> params) {
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
           	 	Object obj = params.get(key);  
                //这里考虑传入的参数是什么类型，不同类型使用的方法不同  
                if(obj instanceof Collection<?>){  
                    query.setParameterList(key, (Collection<?>)obj);  
                }else if(obj instanceof Object[]){  
                    query.setParameterList(key, (Object[])obj);  
                }else{
                    query.setParameter(key, obj);  
                }  
           }
        }
        return query;
    }

    private Query createSqlQuery(String queryString) {
        return getCurrentSession().createSQLQuery(queryString);
    }

    @Override
    public final PK save(T t) {
        return (PK) getCurrentSession().save(t);
    }

    @Override
    public final void saveOrUpdate(T t) {
        getCurrentSession().saveOrUpdate(t);
    }

    @Override
    public final void delete(T t) {
        getCurrentSession().delete(t);
    }

    @Override
    public final void update(T t) {
        getCurrentSession().update(t);
    }

    @Override
    public final T get(PK id) {
        return findUnique(id);
    }

    protected List<T> find() {
        return createCriteriaByEntityClass().list();
    }

    protected List<T> findWithLimits(int firstResult, int maxResults) {
        return createCriteriaByEntityClass().setFirstResult(firstResult).setMaxResults(maxResults).list();
    }

    protected List<T> findByHql(String hql, Object... paramsArray) {
        return setQueryParams(createHqlQuery(hql), paramsArray).list();
    }

    protected List<T> findByHqlWithLimits(String hql, int firstResult, int maxResults, Object... paramsArray) {
        return setQueryParams(createHqlQuery(hql), paramsArray).setFirstResult(firstResult)
                .setMaxResults(maxResults).list();
    }

    protected List<T> findBySql(String sql, Object... paramsArray) {
        return setQueryParams(createSqlQuery(sql), paramsArray).list();
    }

    protected List<T> findByHql(String hql, Map<String, Object> paramsMap) {
        return setQueryParams(createHqlQuery(hql), paramsMap).list();
    }

    protected List<T> findByHqlWithLimits(String hql, int firstResult, int maxResults,
            Map<String, Object> paramsMap) {
        return setQueryParams(createHqlQuery(hql), paramsMap).setFirstResult(firstResult)
                .setMaxResults(maxResults).list();
    }

    protected List<T> findBySql(String sql, Map<String, Object> paramsMap) {
        return setQueryParams(createSqlQuery(sql), paramsMap).list();
    }

    protected T findUnique(PK id) {
        return (T) getCurrentSession().get(entityClass, id);
    }

    protected T findUniqueByHql(String hql, Object... paramsArray) {
        return (T) setQueryParams(createHqlQuery(hql), paramsArray).uniqueResult();
    }

    protected T findUniqueBySql(String sql, Object... paramsArray) {
        return (T) setQueryParams(createSqlQuery(sql), paramsArray).uniqueResult();
    }

    protected T findUniqueByHql(String hql, Map<String, Object> paramsMap) {
        return (T) setQueryParams(createHqlQuery(hql), paramsMap).uniqueResult();
    }

    protected T findUniqueBySql(String sql, Map<String, Object> paramsMap) {
        return (T) setQueryParams(createSqlQuery(sql), paramsMap).uniqueResult();
    }

    protected int count(String prop) {
        return ((Number) createCriteriaByEntityClass().setProjection(Projections.count(prop)).uniqueResult())
                .intValue();
    }
    
	@Override
	public List<T> findListOnePage(String hql, int firstResult, int maxResults) {
		Query query = getCurrentSession().createQuery(hql);
        query.setFirstResult(firstResult).setMaxResults(maxResults);
        return query.list();
	}

    public long getCount(String hql, Map<String, Object> paramsMap) {
        Query query = setQueryParams(createHqlQuery(hql), paramsMap);
        List list = query.list();
        return (long)list.get(0);
    }

    public long getCount(String hql, Object... paramsArray) {
        Query query = setQueryParams(createHqlQuery(hql), paramsArray);
        List list = query.list();
        return (long)list.get(0);
    }

}
