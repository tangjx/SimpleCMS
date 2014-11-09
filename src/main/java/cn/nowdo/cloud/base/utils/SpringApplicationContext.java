package cn.nowdo.cloud.base.utils;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.util.StringUtils;

public class SpringApplicationContext {
    private static Logger logger = Logger.getLogger(SpringApplicationContext.class);
    private static ApplicationContext context;

    public static <T> T getBeanByName(String name, final Class<T> clazz) {
        T bean = null;
        if (!StringUtils.isEmpty(name)) {
            try {
                bean = context.getBean(name, clazz);
            } catch (Exception e) {
                logger.error("getBeanByName " + name + " not found " + e);
            }
        }
        return bean;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBeanByName(String name) {
        T bean = null;
        if (!StringUtils.isEmpty(name)) {
            try {
                bean = (T) context.getBean(name);
            } catch (Exception e) {
                logger.error("getBeanByName " + name + " not found " + e);
            }
        }
        return bean;
    }

    public static <T> T getBeanByClass(final Class<T> clazz) {
        T bean = null;
        try {
            bean = context.getBean(clazz);
        } catch (Exception e) {
            logger.error("getBeanByClass " + clazz + " not found " + e);
        }
        return bean;
    }

    public static synchronized void setApplicationContext(ApplicationContext context) {
        logger.info("setApplicationContext " + context);
        logger.info("setApplicationContext " + SpringApplicationContext.context);
        if (SpringApplicationContext.context == null) {
            SpringApplicationContext.context = context;
        }
    }
}
