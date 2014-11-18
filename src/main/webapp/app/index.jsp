<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/common-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="common/common-res.jsp"%>
<title>所有设备</title>
</head>
<body>
  <div>
    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span12">
          <jsp:include page="common/header.jsp"></jsp:include>
        </div>
      </div>
      <div class="row-fluid">
        <div class="span8">
          <div class="carousel slide" id="carousel-250251">
            <ol class="carousel-indicators">
              <li data-slide-to="0" data-target="#carousel-250251">
              </li>
              <li data-slide-to="1" data-target="#carousel-250251">
              </li>
              <li data-slide-to="2" data-target="#carousel-250251" class="active">
              </li>
            </ol>
            <div class="carousel-inner">
              <div class="item">
                <img alt="" src="img/1.jpg" />
                <div class="carousel-caption">
                  <h4>
                    棒球
                  </h4>
                  <p>
                    棒球运动是一种以棒打球为主要特点，集体性、对抗性很强的球类运动项目，在美国、日本尤为盛行。
                  </p>
                </div>
              </div>
              <div class="item">
                <img alt="" src="img/2.jpg" />
                <div class="carousel-caption">
                  <h4>
                    冲浪
                  </h4>
                  <p>
                    冲浪是以海浪为动力，利用自身的高超技巧和平衡能力，搏击海浪的一项运动。运动员站立在冲浪板上，或利用腹板、跪板、充气的橡皮垫、划艇、皮艇等驾驭海浪的一项水上运动。
                  </p>
                </div>
              </div>
              <div class="item active">
                <img alt="" src="img/3.jpg" />
                <div class="carousel-caption">
                  <h4>
                    自行车
                  </h4>
                  <p>
                    以自行车为工具比赛骑行速度的体育运动。1896年第一届奥林匹克运动会上被列为正式比赛项目。环法赛为最著名的世界自行车锦标赛。
                  </p>
                </div>
              </div>
            </div> <a data-slide="prev" href="#carousel-250251" class="left carousel-control">‹</a> <a data-slide="next" href="#carousel-250251" class="right carousel-control">›</a>
          </div>
        </div>
        <div class="span4">
          <ul>
            <li>
              新闻资讯
            </li>
            <li>
              体育竞技
            </li>
            <li>
              娱乐八卦
            </li>
            <li>
              前沿科技
            </li>
            <li>
              环球财经
            </li>
            <li>
              天气预报
            </li>
            <li>
              房产家居
            </li>
            <li>
              网络游戏
            </li>
          </ul>
        </div>
      </div>
      <div class="row-fluid">
        <div class="span12">
          <jsp:include page="common/footer.jsp"></jsp:include>
        </div>
      </div>
    </div>
  </div>
</body>
</html>