<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<title>公众号管理</title>
</head>
<body>
  <div data-role="page">
    <div data-role="main" class="ui-content jqm-content">
      <s:url var="addPublicAccountAction" value="/wx/public_account_manage/add.action" />
      <s:url var="listPublicAccountAction" value="/wx/public_account_manage/list.action" />
      <ul data-role="listview" data-inset="true">
        <li>公众号管理</li>
        <li><a data-ajax="false" href="${addPublicAccountAction}">公众号注册</a></li>
        <li><a data-ajax="false" href="${listPublicAccountAction}">公众号列表</a></li>
      </ul>
    </div>
  </div>
</body>
</html>