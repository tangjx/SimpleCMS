/*
 * @(#)ChannelTemplateServiceImpl.java Oct 23, 2014
 * 
 * Copyright 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.core.service.impl;

import cn.nowdo.core.entity.ChannelTemplate;
import cn.nowdo.core.service.ChannelTemplateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * @Title: ChannelTemplateServiceImpl.java
 * @Description: TODO(用一句话描述该文件做什么)
 * @author atang atang@1v.cn  
 * @date Oct 23, 2014 10:45:32 AM
 * @version V1.0  
 */
@Service
@Transactional
public class ChannelTemplateServiceImpl implements ChannelTemplateService {

    @Override
    public ChannelTemplate newChannelTemplate(ChannelTemplate channelTemplate) {
        return null;
    }

    @Override
    public ChannelTemplate modifyChannelTemplate(ChannelTemplate channelTemplate) {
        return null;
    }

    @Override
    public ChannelTemplate readChannelTemplate(String channelTemplateId) {
        return null;
    }

    @Override
    public boolean dropChannelTemplate(String channelTemplateId) {
        return false;
    }
}
