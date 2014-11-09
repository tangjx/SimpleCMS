<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<title>添加公共账号</title>
</head>
<body>
  <div data-role="page">
    <div data-role="content">
      <s:url var="formAction" value="/wx/public_account_manage/add_commit.action" />
      <form method="post" name="form_data" id="form_data" action="${formAction}">
        <input type="hidden" name="accountId" value="${request.accountId}">
        <input type="hidden" name="TokenName" value="${session.TokenName}">
        <ul data-role="listview" data-inset="true">
          <li>服务器配置</li>
          <li>URL<span class="ui-li-count">${request.entryUrl}</span></li>
          <li>Token<span class="ui-li-count">${request.token}</span></li>
        </ul>
        <div>请在微信服务器验证通过之后填写以下信息：</div>
        <div>
          <h4>账号名称</h4>
        </div>
        <div>
          <input type="text" id="name" name="name" placeholder="请输入账号名称" required="required">
        </div>
        <div>
          <h4>账号类型</h4>
        </div>
        <div>
          <select id="type" name="type">
            <option value="0">正式号</option>
            <option value="1">演示号</option>
          </select>
        </div>
        <div>
          <h4>场景</h4>
        </div>
        <div>
          <select id="sceneId" name="sceneId">
            <s:iterator value="#request.scenes" var="scene">
              <option value="${scene.sceneId}">${scene.name}</option>
            </s:iterator>
          </select>
        </div>
        <div>
          <h4>AppId</h4>
        </div>
        <div>
          <input type="text" id="appId" name="appId" placeholder="请输入AppId" required="required">
        </div>
        <div>
          <h4>AppSecret</h4>
        </div>
        <div>
          <input type="text" id="appSecret" name="appSecret" placeholder="请输入AppSecret" required="required">
        </div>
        <input type="submit" value="提交">
      </form>
    </div>
  </div>
  <script type="text/javascript">
      $(function() {
        $("#form_data").submit(function() {
          $(":submit", this).attr("disabled", true);
        })
      });
    </script>
</body>
</html>