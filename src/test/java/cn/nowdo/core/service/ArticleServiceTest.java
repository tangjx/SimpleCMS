/*
 * @(#)ArticleServiceTest.java Aug 6, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.core.service;

import java.net.URLEncoder;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * @Title: ArticleServiceTest.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Aug 6, 2014 8:33:24 PM
 * @version V1.0  
 */

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:/spring/applicationContext*.xml" })
public class ArticleServiceTest {
	@Autowired
	private ArticleService articleService;
	
	@Test
	public void testClass() {
//		System.out.println(articleService);
	}
	
	@Test
	public void testEncode() throws Exception {
		String url = "http://wecarekids.1v.cn/wecarekids/wx/get_camera_list.action?openId=oS6Nytz_MNt7pQJNrBxeAcUgE4uY&instanceId=69c7f9887d244fcea4e412a22674cc00";
		url = URLEncoder.encode(url, "utf-8");
		System.out.println(url);
	}
}
