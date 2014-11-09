<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<title>修改公共账号</title>
</head>
<body>
  <div data-role="page">
    <div data-role="content">
      <s:url var="formEditAction" value="/wx/public_account_manage/edit_commit.action" />
      <s:url var="formDelAction" value="/wx/public_account_manage/del_commit.action" />
      <form method="post" name="form_data" id="form_data">
        <input type="hidden" name="accountId" value="${request.publicAccount.id}">
        <input type="hidden" name="TokenName" value="${session.TokenName}">
        <ul data-role="listview" data-inset="true">
          <li>服务器配置</li>
          <li>URL<span class="ui-li-count">${publicAccount.entryURL}</span></li>
          <li>Token<span class="ui-li-count">${publicAccount.token}</span></li>
        </ul>
        <div>
          <h4>账号名称</h4>
        </div>
        <div>
          <input type="text" id="name" name="name" value="${publicAccount.name}" placeholder="请输入账号名称"
            required="required">
        </div>
        <div>
          <h4>账号类型</h4>
        </div>
        <div>
          <select id="type" name="type">
            <option value="0" ${request.publicAccount.type == 0 ? 'selected="selected"' : ''}>正式号</option>
            <option value="1" ${request.publicAccount.type == 1 ? 'selected="selected"' : ''}>演示号</option>
          </select>
        </div>
        <div>
          <h4>场景</h4>
        </div>
        <div>
          <select id="sceneId" name="sceneId">
            <s:iterator value="#request.scenes" var="scene">
              <option value="${scene.sceneId}"
                ${request.publicAccount.sceneId == scene.sceneId ? 'selected="selected"' : ''}>${scene.name}</option>
            </s:iterator>
          </select>
        </div>
        <div>
          <h4>AppId</h4>
        </div>
        <div>
          <input type="text" id="appId" name="appId" value="${request.publicAccount.appId}"
            placeholder="请输入AppId" required="required">
        </div>
        <div>
          <h4>AppSecret</h4>
        </div>
        <div>
          <input type="text" id="appSecret" name="appSecret" value="${request.publicAccount.secretId}"
            placeholder="请输入AppSecret" required="required">
        </div>
        <div>
          <input type="button" id="delBtn" value="删除">
          <input type="button" id="editBtn" value="修改">
        </div>
      </form>
    </div>
  </div>
  <script type="text/javascript">
      $(function() {
        $("#delBtn").click(function() {
          $("#form_data").attr("action", "${formDelAction}");
          $("#form_data").submit();
        });
        $("#editBtn").click(function() {
          $("#form_data").attr("action", "${formEditAction}");
          $("#form_data").submit();
        });
        $("#form_data").submit(function() {
          $(":button", this).attr("disabled", true);
        })
      });
    </script>
</body>
</html>