/*
 * @(#)ChannelServiceImpl.java Oct 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.service.impl;

import cn.nowdo.core.dao.ChannelDao;
import cn.nowdo.core.entity.Channel;
import cn.nowdo.core.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * @Title: ChannelServiceImpl.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Oct 23, 2014 10:44:59 AM
 * @version V1.0  
 */
@Service
@Transactional
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelDao channelDao;

    @Override
    public Channel createChannel(Channel channel) {
        channelDao.save(channel);
        return channel;
    }

    @Override
    public Channel modifyChannel(Channel channel) {
        channelDao.update(channel);
        return channel;
    }

    @Override
    public boolean dropChannel(String channelId) {
        boolean result = false;
        Channel channel = channelDao.get(channelId);
        if(channel != null) {
            channelDao.delete(channel);
            result = true;
        }
        return result;
    }

    @Override
    public Channel readChannel(String channelId) {
        return channelDao.get(channelId);
    }
}
