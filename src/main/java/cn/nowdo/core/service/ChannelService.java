/*
 * @(#)ChannelService.java Oct 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.service;

import cn.nowdo.core.entity.Channel;

/*
 * @Title: ChannelService.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Oct 23, 2014 10:40:28 AM
 * @version V1.0  
 */
public interface ChannelService {
    /**
     *
     * @param channel
     * @return
     */
    public Channel createChannel(Channel channel);

    /**
     *
     * @param channel
     * @return
     */
    public Channel modifyChannel(Channel channel);

    /**
     *
     * @param channelId
     * @return
     */
    public boolean dropChannel(String channelId);

    /**
     *
     * @param channelId
     * @return
     */
    public Channel readChannel(String channelId);

}
