<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<title>添加场景</title>
</head>
<body>
  <div data-role="page">
    <div data-role="content">
      <s:url var="formAction" value="/wx/scene_manage/add_commit.action" />
      <form method="post" name="form_data" id="form_data" action="${formAction}">
        <input type="hidden" name="TokenName" value="${session.TokenName}">
        <div>
          <h4>场景名称</h4>
        </div>
        <div>
          <input type="text" id="name" name="name" placeholder="请输入场景名称" required="required">
        </div>
        <div>
          <h4>场景ID</h4>
        </div>
        <div>
          <input type="number" id="sceneId" name="sceneId" placeholder="请输入场景ID" required="required">
        </div>
        <div>
          <h4>消息推送地址</h4>
        </div>
        <div>
          <input type="url" id="address" name="address" placeholder="请输入消息推送地址" required="required">
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