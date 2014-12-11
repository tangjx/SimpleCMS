package cn.nowdo.core.action;

import cn.nowdo.cloud.base.action.BaseAction;
import cn.nowdo.core.entity.Channel;
import cn.nowdo.core.service.ChannelService;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by atang on 14-12-1.
 */
@ParentPackage("default")
@Namespace("/channel")
public class ChannelAction extends BaseAction{
    private static final long serialVersionUID = 1L;
    private Logger logger = Logger.getLogger(ArticleAction.class);

    @Autowired
    private ChannelService channelService;

    @Action(value = "add_channel", results = {
            @Result (name = SUCCESS, location = "/app/channel/channel_add.jsp")
    })
    public String addChannel() {
        logger.info("this is addChannel!");
        return SUCCESS;
    }

    @Action(value = "add_channel_submit")
    public String addChannelSubmit() {
        String name = getRequestParameter("name");
        String description = getRequestParameter("description");
        String meta = getRequestParameter("meta");
        Channel channel = new Channel();
        channel.setName(name);
        channel.setDescription(description);
        channel.setMeta(meta);
        channelService.createChannel(channel);
        renderJson("success");
        return NONE;
    }

    @Action(value = "modify_channel", results = {
            @Result (name = SUCCESS, location = "/app/channel/channel_modify.jsp")
    })
    public String modifyChannel() {
        String channelId = getRequestParameter("channelId");
        Channel channel = channelService.readChannel(channelId);
        setRequestAttribute("channel", channel);
        return SUCCESS;
    }

    @Action(value = "modify_channel_submit")
    public String modifyChannelSubmit() {
        String channelId = getRequestParameter("channelId");
        String name = getRequestParameter("name");
        String description = getRequestParameter("description");
        Channel channel = channelService.readChannel(channelId);
        channel.setName(name);
        channel.setDescription(description);
        channelService.modifyChannel(channel);
        renderJson("success");
        return NONE;
    }

    @Action(value = "drop_channel")
    public String dropChannel() {
        String channelId = getRequestParameter("channelId");
        channelService.dropChannel(channelId);
        renderJson("success");
        return NONE;
    }
}
