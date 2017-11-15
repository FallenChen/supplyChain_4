<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/include.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body style="margin: 0;padding: 0">
<div class="container-fluid login-top">
    <div class='container container-logo'>
        <img src='<%=request.getContextPath()%>/js/static/images/logo@1x.png'>
    </div>
    <img src='<%=request.getContextPath()%>/js/static/images/img@1x.png' class='img-responsive center-block'>
    <div class='form_div center-block'>
        <form class='form-inline form center-block'>
            <!-- 账号 -->
            <div class="input-group col-xs-12 login-input">
                <input  type="text" class="form-control" placeholder="账号">
                <img src="<%=request.getContextPath()%>/js/static/images/account@1x.png" class='img-responsive img_dw'>
            </div>
            <!-- 密码 -->
            <div class="input-group col-xs-12 login-input">
                <input  type="text" class="form-control" placeholder="密码">
                <img src="<%=request.getContextPath()%>/js/static/images/password@1x.png" class='img-responsive img_dw'>
            </div>
            <!-- 验证码 -->
            <div class="input-group col-xs-12 login-input clearfix">
                <input type="text" name="" class="form-control yzm_con" placeholder="验证码">
                <div class='yzm_img'>
                    <img alt="验证码" src="<%=request.getContextPath()%>/imageCode" title="点击更换" id="imgcoode" onclick="getImageCode(this)" style="height:60px;width:128px;"/>
                </div>
            </div>
            <!-- 登录 -->
            <div class="input-group col-xs-12">
                <input  type="button" class="form-control btn btn-danger" value="登录" onclick="login()" style="height: 60px;font-size: 24px;">
            </div>
            <!-- 申请 -->
            <p class="text-right apply_for"><a href='#'>新用户申请</a></p>
        </form>

    </div>
    <p class='text-center copy'>Copyright © 2017 美创互联科技有限公司版权所有</p>

</div>
<script>
    function login(){
        location.href="<%=request.getContextPath()%>/main/signingInfo.action";
    }
    var countdown=10;
    //随机生成验证码图片
    function getImageCode(val){

        if (countdown == 0) {
            var thisDate =  new Date();
            //区分当前请求和上一次请求
            document.getElementById("imgcoode").src="<%=request.getContextPath()%>/imageCode?sjNum="+thisDate.getTime();

            $(val).attr("disabled",false);
            $(val).val("免费获取验证码");
            countdown = 10;
        } else {
            $(val).attr("disabled", true);
            $(val).val('重新发送('+countdown+')');
            countdown--;
            setTimeout(function() {
                getImageCode(val)
            },1)
        }
    }
</script>
</body>
</html>