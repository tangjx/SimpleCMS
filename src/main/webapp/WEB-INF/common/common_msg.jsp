<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ include file="/WEB-INF/includes/common-res.jsp"%>
  <title>消息提示</title>
</head>
<body>
<div data-role="page">
  <div data-role="content">
    <p>${request.msg}</p>
  </div>    
</div>
</body>
</html>