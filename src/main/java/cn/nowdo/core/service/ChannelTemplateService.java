/*
 * @(#)ChannelTemplateService.java Oct 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.service;

import cn.nowdo.core.entity.ChannelTemplate;

/*
 * @Title: ChannelTemplateService.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Oct 23, 2014 10:41:09 AM
 * @version V1.0  
 */
public interface ChannelTemplateService {

    /**
     *
     * @param channelTemplate
     * @return
     */
    public ChannelTemplate newChannelTemplate(ChannelTemplate channelTemplate);

    /**
     *
     * @param channelTemplate
     * @return
     */
    public ChannelTemplate modifyChannelTemplate(ChannelTemplate channelTemplate);

    /**
     *
     * @param channelTemplateId
     * @return
     */
    public ChannelTemplate readChannelTemplate(String channelTemplateId);

    /**
     *
     * @param channelTemplateId
     * @return
     */
    public boolean dropChannelTemplate(String channelTemplateId);
}
