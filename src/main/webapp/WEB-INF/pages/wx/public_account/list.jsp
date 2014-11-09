<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<title>公众号列表</title>
</head>
<body>
  <div data-role="page">
    <div data-role="main" class="ui-content jqm-content">
      <ul data-role="listview" data-inset="true">
        <li>公众号列表</li>
        <s:iterator value="#request.publicAccounts" var="publicAccount">
          <s:url var="editActionUrl" value="/wx/public_account_manage/edit.action">
            <s:param name="accountId" value="#publicAccount.id" />
          </s:url>
          <li><a data-ajax="false" href="${editActionUrl}">${empty publicAccount.name ? '未填写' : publicAccount.name}</a></li>
        </s:iterator>
      </ul>
    </div>
  </div>
</body>
</html>