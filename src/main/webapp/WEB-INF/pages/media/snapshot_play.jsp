<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/includes/common-res.jsp"%>
<style type="text/css">
body {
  font-size: 16px;
}

.title {
  font-size: 20px;
  font-weight: bold;
}

.info {
  font-size: 11px;
  color: gray;
  margin-top: 5px;
}

.mid {
  display: block;
  margin: 10px auto;
}

.subtitle {
  font-weight: bold;
  margin-top: 5px;
  margin-bottom: 5px;
}

.detail {
  text-indent: 2em;
}

.small_icon {
  font-size: 10px;
}
</style>
<title>图片展示</title>
</head>
<body>
  <div data-role="page">
    <div data-role="main" class="ui-content jqm-content">
     <c:if test="${!empty imgUrl}">
      <div class="title">图片展示</div>
        <div class="mid">
          <img id="img" width="100%" height="57%" src="${imgUrl }">
        </div>
        <div>
          点击右上角<span class="small_icon">┇</span>，发送给亲友分享吧！
        </div>
      </c:if>
      <c:if test="${empty imgUrl}">
        <div>
          <h2>图片文件未找到</h2>
        </div>
      </c:if>
    </div>
  </div>
</body>
<script type="text/javascript">
  $(function() {
    $("#img").width($(window).width() - 30);
    $("#img").height($(window).width() / 16 * 9);
  });
</script>
</html>
