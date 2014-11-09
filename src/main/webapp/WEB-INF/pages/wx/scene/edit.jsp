<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<title>编辑场景</title>
</head>
<body>
  <div data-role="page">
    <div data-role="content">
      <s:url var="formEditAction" value="/wx/scene_manage/edit_commit.action" />
      <s:url var="formDelAction" value="/wx/scene_manage/del_commit.action" />
      <form method="post" name="form_data" id="form_data">
        <input type="hidden" name="TokenName" value="${session.TokenName}">
        <input type="hidden" name="id" value="${scene.id}">
        <div>
          <h4>场景名称</h4>
        </div>
        <div>
          <input type="text" id="name" name="name" value="${scene.name}" placeholder="请输入场景名称"
            required="required">
        </div>
        <div>
          <h4>场景ID</h4>
        </div>
        <div>
          <input type="number" id="sceneId" name="sceneId" value="${scene.sceneId}" placeholder="请输入场景ID"
            required="required">
        </div>
        <div>
          <h4>消息推送地址</h4>
        </div>
        <div>
          <input type="url" id="address" name="address" value="${scene.address}" placeholder="请输入消息推送地址"
            required="required">
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