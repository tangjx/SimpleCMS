<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<title>场景管理</title>
</head>
<body>
  <div data-role="page">
    <div data-role="main" class="ui-content jqm-content">
      <s:url var="addSceneAction" value="/wx/scene_manage/add.action" />
      <s:url var="listSceneAction" value="/wx/scene_manage/list.action" />
      <ul data-role="listview" data-inset="true">
        <li>场景管理</li>
        <li><a data-ajax="false" href="${addSceneAction}">添加场景</a></li>
        <li><a data-ajax="false" href="${listSceneAction}">场景列表</a></li>
      </ul>
    </div>
  </div>
</body>
</html>