package cn.nowdo.cloud.base.utils;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
public class SpringApplicationContextInjector implements ApplicationContextAware {
  private static Logger logger = Logger.getLogger(SpringApplicationContextInjector.class);

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    logger.info("setApplicationContext applicationContext = " + applicationContext);
    SpringApplicationContext.setApplicationContext(applicationContext);
  }
}