<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<title>所有设备</title>
</head>
<body>
  <div data-role="page">
    <div data-role="main" class="ui-content jqm-content">
      <ul data-role="listview" data-inset="true">
        <li>所有设备</li>
        <s:url value="/project/wegarden/wg_box_status_list.action" var="boxListUrl" />
        <s:url value="/project/wegarden/wg_camera_status_list.action" var="cameraListUrl" />
        <li><a data-ajax="false" href="${boxListUrl}">所有盒子</a></li>
        <li><a data-ajax="false" href="${cameraListUrl}">所有摄像头</a></li>
      </ul>
    </div>
  </div>
</body>
</html>