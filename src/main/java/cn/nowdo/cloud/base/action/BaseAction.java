package cn.nowdo.cloud.base.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.ByteConverter;
import org.apache.commons.beanutils.converters.DoubleConverter;
import org.apache.commons.beanutils.converters.FloatConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.apache.commons.beanutils.converters.LongConverter;
import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class BaseAction extends ActionSupport {

    private static final long serialVersionUID = -42856136017302010L;

    protected Logger logger = LoggerFactory.getLogger(getClass());

    private Gson gson = new Gson();

    public static void registConverter() {
        ConvertUtils.register(new IntegerConverter(null), Integer.class);
        ConvertUtils.register(new FloatConverter(null), Float.class);
        ConvertUtils.register(new DoubleConverter(null), Double.class);
        ConvertUtils.register(new LongConverter(null), Long.class);
        ConvertUtils.register(new ByteConverter(null), Byte.class);
//        ConvertUtils.register(new DateConverter("yyyy-MM-dd"), Date.class);
    }

    protected void addActionMessage(String paramString, String... paramVarArgs) {
        superAddActionMessage(getText(paramString, paramVarArgs));
    }

    public void superAddActionMessage(String paramString) {
        super.addActionMessage(paramString);
    }

    protected void addActionError(String paramString, String... paramVarArgs) {
        superAddActionError(getText(paramString, paramVarArgs));
    }

    protected void superAddActionError(String paramString) {
        super.addActionError(paramString);
    }

    public void put(String key, Object value) {
        ActionContext.getContext().put(key, value);
    }

    public Object get(String key) {
        return ActionContext.getContext().get(key);
    }

    protected void setRequestAttribute(String key, Object value) {
        getRequest().setAttribute(key, value);
    }

    @SuppressWarnings("unchecked")
    protected <T> T getSessionAttribute(String key) {
        return (T) getSession().getAttribute(key);
    }

    protected void setSessionAttribute(String key, Object value) {
        getSession().setAttribute(key, value);
    }

    protected void removeSessionAttribute(String key) {
        getSession().removeAttribute(key);
    }

    @SuppressWarnings("unchecked")
    protected <T> T getRequestParameter(String key) {
        return (T) getRequest().getParameter(key);
    }

    protected String[] getRequestParameterValues(String key) {
        return getRequest().getParameterValues(key);
    }

    protected Map<String, String[]> getRequestParameterMap() {
        return getRequest().getParameterMap();
    }

    public void renderText(String paramString) {
        renderToView("text/plain", paramString);
    }

    public void renderHtml(String paramString) {
        renderToView("text/html", paramString);
    }

    public void renderXML(String paramString) {
        renderToView("text/xml", paramString);
    }

    public void renderJson(Object paramObject) {
        renderToView("text/json", gson.toJson(paramObject));
    }

    private void renderToView(String paramString1, String paramString2) {
        try {
            HttpServletResponse localHttpServletResponse = getResponse();
            localHttpServletResponse.setContentType(paramString1 + ";charset=UTF-8");
            localHttpServletResponse.getWriter().write(paramString2);
            localHttpServletResponse.getWriter().flush();
            localHttpServletResponse.getWriter().close();
        } catch (IOException localIOException) {
            logger.error("向Response输出{}时出错" + paramString2);
        }
    }

    protected void renderJson(boolean paramBoolean, Object[] paramArrayOfObject) {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.accumulate("success", paramBoolean);
        for (int i = 0; i < paramArrayOfObject.length; i += 2) {
            localJSONObject.accumulate(paramArrayOfObject[i].toString(), paramArrayOfObject[(i + 1)]);
        }
        renderText(localJSONObject.toString());
    }

    protected void renderJson(boolean paramBoolean, String... paramVarArgs) {
        String[] arrayOfString = null;
        if ((paramVarArgs != null) && (paramVarArgs.length > 0)) {
            arrayOfString = new String[] {"msg", paramVarArgs[0]};
        } else {
            arrayOfString = new String[0];
        }
        renderJson(paramBoolean, arrayOfString);
    }

    protected void renderJson(JSON paramJSON) {
        renderToView("text/json", paramJSON.toString());
    }

    protected InputStream getRequestInputStream() {
        try {
            return getRequest().getInputStream();
        } catch (IOException e) {
            logger.error(e.toString());
        }
        return null;
    }

    protected HttpServletRequest getRequest() {
        return ServletActionContext.getRequest();
    }

    protected HttpServletResponse getResponse() {
        return ServletActionContext.getResponse();
    }

    protected ValueStack getValueStatck() {
        return ActionContext.getContext().getValueStack();
    }

    protected HttpSession getSession() {
        return ServletActionContext.getRequest().getSession();
    }

    protected ServletContext getServletContext() {
        return ServletActionContext.getServletContext();
    }

    protected String getParameter(String paramString) {
        return getRequest().getParameter(paramString);
    }

    public Object getBean(String paramString) {
        Object localObject = null;
        localObject = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext())
                .getBean(paramString);
        return localObject;
    }
}
