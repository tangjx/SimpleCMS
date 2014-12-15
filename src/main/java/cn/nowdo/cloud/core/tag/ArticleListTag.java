package cn.nowdo.cloud.core.tag;

import cn.nowdo.core.entity.Article;
import cn.nowdo.core.service.ArticleService;
import cn.nowdo.core.service.ChannelService;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

/**
 * Created by atang on 14-12-10.
 */
@Controller
public class ArticleListTag extends SimpleTagSupport{
    private String item;
    private int count;
    private String channelId;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Autowired
    private ArticleService articleService;
    @Autowired
    private ChannelService channelService;

    @Override
    public void doTag() throws JspException, IOException {
        List<Article> articleList1 = articleService.getArticlesByChannel(channelId);
        System.out.println("count:" + count);
        for(Article o : articleList1) {
            getJspContext().setAttribute(item, o);
            getJspBody().invoke(null);
        }
    }
}
