<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/include.jsp"%>
<html lang="en">
<head>
    <link type="image/x-icon" rel="icon" href="<%=request.getContextPath()%>/js/static/images/favicon.ico" />
    <link type="image/x-icon" rel="shortcut icon" href="<%=request.getContextPath()%>/js/static/images/favicon.ico" />
    <meta charset="UTF-8">
    <title>资方首页</title>
</head>
<body>
<!--top 开始-->
<div class="top">
    <div class="navbar navbar-default">
        <div class='row row_top'>
            <div class='col-xs-3'>
                <ul class="nav navbar-nav navbar-left">
                    <li>
                        <a class="navbar-brand"><img src="<%=request.getContextPath()%>/js/static/images/logo1.3@1x.png" alt="Brand" class='img-responsive sy_logo' /></a>
                    </li>
                </ul>
            </div>
            <div class='col-xs-9'>
                <ul class="nav navbar-nav navbar-right">
                    <li class="navbar-text">
                        <img src="<%=request.getContextPath()%>/js/static/images/message1@1x.png" />
                    </li>
                    <li class="navbar-text">
                        ${information.entName}
                    </li>
                    <li>
                        <div class="dropdown">
                            <p class="dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown">
                                ${account.userName}
                                <span class="caret"></span>
                            </p>
                            <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                <li class='text-center' id="one3"><a href="#">资料维护</a></li>
                                <li class='text-center' ><a href="<%=request.getContextPath()%>/account/exitAccount.action">退出登录</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!--top 结束-->
<div class="con">
    <!--列表 左侧导航 开始-->
    <div class="index_left">
        <div class="page-sidebar">
            <ul class="nav panel-group sidebar-menu">
                <li class="panel" id="xtsy3">
                    <a href="#">
                        <img class='img_con' src='<%=request.getContextPath()%>/js/static/images/leftbar_home_selected@1x.png'>
                        <span class="menu-text">系统首页</span>
                    </a>
                </li>
                <li class="panel" id="syxgl3">
                    <a href="#">
                        <img class='img_con' src='<%=request.getContextPath()%>/js/static/images/leftbar_credit_selected@1x.png'>
                        <span class="menu-text">授用信管理</span>
                    </a>
                </li>
                <li class="panel" id="dkgl3">
                    <a href="#">
                        <img class='img_con' src='<%=request.getContextPath()%>/js/static/images/leftbar_finance_selected@1x.png'>
                        <span class="menu-text">贷款管理</span>
                    </a>
                </li>
                <li class="panel" id="hkgl3">
                    <a href="#">
                        <img class='img_con' src='<%=request.getContextPath()%>/js/static/images/leftbar_finance_selected@1x.png'>
                        <span class="menu-text">还款管理</span>
                    </a>
                </li>
                <li class="panel" id="cwgl3">
                    <a href="#">
                        <img class='img_con' src='<%=request.getContextPath()%>/js/static/images/leftbar_finance_selected@1x.png'>
                        <span class="menu-text">财务管理</span>
                    </a>
                </li>
                <li class="panel" id="ukeyZs3">
                    <a href="#">
                        <img class='img_con' src='<%=request.getContextPath()%>/js/static/images/leftbar_ukey_selected@1x.png'>
                        <span class="menu-text">Ukey与证书</span>
                    </a>
                </li>
                <li class="panel" id="setting3">
                    <a href="#">
                        <img class='img_con' src='<%=request.getContextPath()%>/js/static/images/leftbar_setting_selected@1x.png'>
                        <span class="menu-text">我的设置</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <!--列表 左侧导航 结束-->
    <!--列表 右侧内容 开始-->
    <div class="index_right" id="load">
        <!-- 右边的主题内容 col-xs-10 开始 -->
        <div class='row row_xtsy_zjzh'>
            <!-- 中精众和投资管理有限公司 开始 -->
            <div class='col-xs-12 row_xtsy_zjzh_div'>
                <div class='row zjzh_wrap'>
                    <div class='panel-body'>
                        <ul class="nav zjzh_title">
                            <li>
                                <h3>${information.entName}</h3>
                            </li>
                            <c:if test="${information.certificationStatus == 0}">
                                <a href="#" id="zlrz"><li class='col-xs-3 yrzs'>待认证</li></a>
                            </c:if>
                            <c:if test="${information.certificationStatus == 1}">
                                <li class='zjzh_logo_sm'>
                                    <img src='<%=request.getContextPath()%>/js/static/images/identify1@1x.png'>
                                </li>
                                <li class='yrz'>已认证</li>
                            </c:if>
                        </ul>
                        <div class='col-xs-6'>



                            <div class='row'>
                                <div class='col-xs-4'>
                                    <div class='zjzh_logo'>
                                            <%--${information.entLogo}--%>
                                            <img src='<%=request.getContextPath()%>/js/static/images/CompanyLogo@1x.png' class='center-block img-responsive img-circle'>
                                    </div>
                                </div>

                                <div class='col-xs-8'>
                                    <ul class='nav zjzh_list'>
                                        <li>企业信用评级:</li>
                                        <li>地址：${information.municipality}${information.city}${information.county}${information.address}</li>
                                        <li>固定电话：${information.telephone}</li>
                                        <li>管理员姓名：${information.businessContact}</li>
                                    </ul>
                                </div>
                            </div>

                        </div>
                        <div class='col-xs-6 text-right'>
                            <div class='zjzh_button'>
                                <a id="zhanghu" href="#"><button type="button" class="btn btn1 btn-danger">账号安全</button></a>
                                <a id="ziliao" href="#"><button type="button" class="btn  btn-danger">基础资料</button></a>
                                <a id="zijin" href="#"><button type="button" class="btn  btn-danger btnn">资金帐户</button></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 中精众和投资管理有限公司 结束 -->
        </div>
    </div>
    <!--列表 右侧内容 结束-->
</div>
<script>
    $('#zhanghu').click(function(){
        $('#load').load('<%=request.getContextPath()%>/captialMain/messages.action')
    })
    $('#ziliao').click(function(){
        $('#load').load('<%=request.getContextPath()%>/captialMain/ziliao.action')
    })
    $('#zijin').click(function(){
        $('#load').load('<%=request.getContextPath()%>/captialMain/zijin.action')
    })
    $('#zlrz').click(function(){
        $('#load').load('<%=request.getContextPath()%>/captialMain/zlrz.action')
    })
</script>

</body>
</html>