<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<title>场景列表</title>
</head>
<body>
  <div data-role="page">
    <div data-role="main" class="ui-content jqm-content">
      <ul data-role="listview" data-inset="true">
        <li>场景列表</li>
        <s:iterator value="#request.scenes" var="scene">
          <s:url var="editActionUrl" value="/wx/scene_manage/edit.action">
            <s:param name="id" value="#scene.id" />
          </s:url>
          <li><a data-ajax="false" href="${editActionUrl}">${empty scene.name ? '未填写' : scene.name}</a></li>
        </s:iterator>
      </ul>
    </div>
  </div>
</body>
</html>