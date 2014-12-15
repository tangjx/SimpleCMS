<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: atang
  Date: 14-12-10
  Time: 下午10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<%@ taglib prefix="cms" uri="http://www.nowdo.cn/tag/cms/simple_cms_tag"%>
<html>
<head>
    <title></title>
</head>
<body>
  <%
    class AAA {
      private String name;
      private String content;

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getContent() {
        return content;
      }

      public void setContent(String content) {
        this.content = content;
      }
    }
    List<AAA> list = new ArrayList<AAA>();
    for(int i = 0; i < 3; i ++) {
      AAA a = new AAA();
      a.setName("name" + i);
      a.setContent("content" + i);
      list.add(a);
    }
    pageContext.setAttribute("list", list);
  %>
  <cms:cms_article_list channelId="ff8081814a48f675014a48fc62b40000" item="listItem" count="1">
    <li>${listItem.title}</li>
  </cms:cms_article_list>

</body>
</html>
