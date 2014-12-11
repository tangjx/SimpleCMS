package cn.nowdo.cloud.core.tag;

import org.hibernate.mapping.Collection;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

/**
 * Created by atang on 14-12-10.
 */
public class ArticleListTag extends SimpleTagSupport{
    private String data;
    private String item;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public void doTag() throws JspException, IOException {
        List articleList = (List)getJspContext().getAttribute(data);
        for(Object o : articleList) {
            getJspContext().setAttribute(item, o);
            getJspBody().invoke(null);
        }
    }
}
