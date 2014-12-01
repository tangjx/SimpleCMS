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
  <title>编辑文章</title>
</head>
<body>
  <div>
    <div style="width:70%;margin: auto;margin-top: 50px; ">
      <form class="form-horizontal" role="form" id="articleForm">
        <div class="form-group">
          <label for="title" class="col-sm-2 control-label">标题</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="title" name="title" placeholder="Text input">
          </div>
        </div>

        <div class="form-group">
          <label for="description" class="col-sm-2 control-label">描述</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="description" name="description" placeholder="Text input">
            <input type="hidden" id="content" name="content">
          </div>
        </div>
        <div id="summernote"></div>
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">提交</button>
          </div>
        </div>
      </form>
    </div>
    <script type="application/javascript">
      $(document).ready(function() {
        $('#summernote').summernote({
          height: 350,   //set editable area's height
          lang: 'zh-CN'
        });
      });
      function alertContent() {
        alert($("#summernote").code());
      }

      function submit() {
        var content = $("#summernote").code();
        $("#content").val(content);
        if(checkInput()) {
          $.ajax({
                    url:"/article/add_article_submit.action?",
                    data : $("#articleForm").serialize(),
                    success : function(msg) {
                      if(msg == 'success') {
                        alert("保存成功！");
                        $("#articleForm")[0].reset();
                      }
                    }
          }
          )
        }
      }

      function checkInput() {
        var result = true;
        var title = $("#title").val();
        var content = $("#content").val();
        if(title == null || title == undefined) {
          result = false;
          alert("请填写标题");
        }
        if(content == null || content == undefined) {
          result = false;
          alert("请填写内容");
        }
        return result;
      }
    </script>
  </div>
</body>
</html>