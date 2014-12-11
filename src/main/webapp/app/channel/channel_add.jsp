<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="../common/common-res.jsp"%>
  <%@ include file="../common/summernote-res.jsp"%>
  <link rel="stylesheet" href="../../components/bootstrap/css/bootstrap-theme.min.css" />
  <link rel="stylesheet"
  href="../../components/summernote/css/summernote-bs3.css" />
  <!--

  <link rel="stylesheet" href="../../components/fontawesome/css/font-awesome.min.css">
  -->
  <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
  <link rel="stylesheet"
  href="../../components/summernote/css/summernote.css" />
  <script src="../../components/summernote/js/summernote.min.js"></script>
  <script src="../../components/summernote/js/summernote-zh-CN.js"></script>
  <title>编辑栏目</title>
</head>
<body>
  <div>
    <div style="width:70%;margin: auto;margin-top: 50px; ">
      <form class="form-horizontal" role="form" id="channelForm">
        <div class="form-group">
          <label for="name" class="col-sm-2 control-label">栏目名称</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="name" name="name" placeholder="Text input">
          </div>
        </div>

        <div class="form-group">
          <label for="description" class="col-sm-2 control-label">栏目描述</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="description" name="description" placeholder="Text input">
          </div>
        </div>
        <div class="form-group">
          <label for="meta" class="col-sm-2 control-label">栏目meta</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="meta" name="meta" placeholder="Text input">
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
            <button type="button" class="btn btn-default" onclick="_submit()">提交</button>
          </div>
        </div>
      </form>
    </div>
    <script type="application/javascript">
      $(document).ready(function() {
      });

      function _submit() {
        if(checkInput()) {
          $.ajax({
                    url:"/channel/add_channel_submit.action?",
                    data : $("#channelForm").serialize(),
                    type: "POST",
                    success : function(msg) {
                      if(msg == 'success') {
                        alert("保存成功！");
                        $("#channelForm")[0].reset();
                      }
                    }
          }
          )
        }
      }

      function checkInput() {
        var result = true;
        var name = $("#name").val();
        var description = $("#description").val();
        var meta = $("#meta").val();
        if($.trim(name) == "") {
          result = false;
          alert("请填写栏目名称");
          return result;
        }
        if($.trim(description) == "") {
          result = false;
          alert("请填写栏目描述");
          return result;
        }
        if($.trim(meta) == "") {
          result = false;
          alert("请填写栏目meta");
          return result;
        }
        return result;
      }
    </script>
  </div>
</body>
</html>