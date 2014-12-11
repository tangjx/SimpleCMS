/*
 * @(#)ChannelDaoImpl.java Oct 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.dao.impl;

import cn.nowdo.cloud.base.dao.impl.GenericDaoImpl;
import cn.nowdo.core.dao.ChannelDao;
import cn.nowdo.core.entity.Channel;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @Title: ChannelDaoImpl.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Oct 23, 2014 10:50:34 AM
 * @version V1.0  
 */
@Repository
public class ChannelDaoImpl extends GenericDaoImpl<Channel, String> implements ChannelDao{
    @Override
    public List<Channel> getChannelListByRight(String parentId) {
        return super.find();
    }
}
