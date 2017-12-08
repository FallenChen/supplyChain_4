<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>资料维护</title>
</head>
<body>

<div class='col-xs-12'>
    <div class='row row_zhxx'>
        <div class="col-xs-12 zlxx_top">
            <a href="<%=request.getContextPath()%>/tradeMain/tradeMain.action">系统首页</a>
            <span>></span>
            <a href="#">资料维护</a>
        </div>
        <!--bootstrap tab 切换 开始-->
        <div class="col-xs-12">
            <div class="row row_dh">
                <!--tab 导航 开始-->
                <ul class="nav nav-tabs col-xs-12" id="myTab">
                    <li class="active"><a href="#home">基本资料</a></li>
                    <li><a href="#profile">账户安全</a></li>
                    <li><a href="#messages">银行账户</a></li>
                    <li><a href="#settings">三方账户</a></li>
                    <li><a href="#settings1">货运管理</a></li>
                    <%--<li><a href="#recieverAddress">收获地址</a></li>--%>
                </ul>
                <!--tab 导航 结束-->
                <!--tab 内容 开始-->
                <div class="row row_tab_con">
                    <div class="tab-content col-xs-12">
                        <!--基本资料 开始-->
                        <div class="tab-pane active" id="home">
                            <div class="jbxx">
                                <div class="row jbxx_row">
                                    <div class="col-xs-8">
                                        <h5>基本资料</h5>
                                    </div>
                                    <div class="col-xs-4 text-right">
                                        <button type="button" class="btn btn-danger" id="updateInformation">编辑</button>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-7 col-xs-offset-1">
                                        <table class="table table_one">
                                            <tbody>
                                            <tr>
                                                <td>企业身份:</td>
                                                <td>
                                                    <%--0采购方、1贸易方、2资方--%>
                                                    <c:if test="${information.entIdentity == 0}">
                                                        采购方
                                                    </c:if>
                                                    <c:if test="${information.entIdentity == 1}">
                                                        贸易方
                                                    </c:if>
                                                    <c:if test="${information.entIdentity == 2}">
                                                        资方
                                                    </c:if>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>企业名称:</td>
                                                <td><span>${information.entName}</span>
                                                    <c:if test="${information.certificationStatus == 0}">
                                                        <a href="#"><span class="drz" id="zlrz">待认证</span></a>
                                                    </c:if>
                                                    <c:if test="${information.certificationStatus == 1}">
                                                        <span class="drzs">已认证</span>
                                                    </c:if>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>社会统一信用代码:</td>
                                                <td>${information.entCreditCode}</td>
                                            </tr>
                                            <tr>
                                                <td>工商登记注册号：</td>
                                                <td>${information.registrationNumber}</td>
                                            </tr>
                                            <tr>
                                                <td>税务登记号：</td>
                                                <td>${information.taxRegistrationNumber}</td>
                                            </tr>
                                            <tr>
                                                <td>组织机构代码：</td>
                                                <td>${information.institutionCode}</td>
                                            </tr>
                                            <tr>
                                                <td>法定代表人</td>
                                                <td>${information.representative}</td>
                                            </tr>
                                            <tr>
                                                <td>法定代表人证件类型：</td>
                                                <td>
                                                    <%--0居民身份证、1护照、2港澳居民来往内地通行证、3台湾居民来往大陆通行证--%>
                                                    <c:if test="${information.representativeType==0}">
                                                        护照
                                                    </c:if>
                                                    <c:if test="${information.representativeType==1}">
                                                        港澳居民来往内地通行证
                                                    </c:if>
                                                    <c:if test="${information.representativeType==2}">
                                                        台湾居民来往大陆通行证
                                                    </c:if>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>组织机构代码：</td>
                                                <td>${information.institutionCode}</td>
                                            </tr>
                                            <tr>
                                                <td>法定代表人证件号码：</td>
                                                <td>${information.representativeNum}</td>
                                            </tr><tr>
                                                <td>固定电话：</td>
                                                <td>${information.telephone}</td>
                                            </tr>
                                            <tr>
                                                <td>省市区域：</td>
                                                <td>${information.municipality}${information.city}${information.county}</td>
                                            </tr>
                                            <tr>
                                                <td>详细地址：</td>
                                                <td>${information.address}</td>
                                            </tr>
                                            <tr>
                                                <td>企业联系人：</td>
                                                <td>${information.businessContact}</td>
                                            </tr>
                                            <tr>
                                                <td>企业联系人手机：</td>
                                                <td>${information.mobilePhone}</td>
                                            </tr>
                                            <tr>
                                                <td>联系人电子邮件：</td>
                                                <td>${information.emailAddress}</td>
                                            </tr>
                                            <tr>
                                                <td>邮编：</td>
                                                <td>${information.zipCode}</td>
                                            </tr>
                                            <tr>
                                                <td>网址：</td>
                                                <td>${information.webSite}</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <div class="jbxx jbxx1">
                                <div class="row jbxx_row">
                                    <div class="col-xs-8">
                                        <h5>高级资料</h5>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-7 col-xs-offset-1">
                                        <table class="table table_one">
                                            <tbody>
                                            <tr>
                                                <td>注册资本:</td>
                                                <td>${information.registeredCapital}</td>
                                            </tr>
                                            <tr>
                                                <td>主要股东:</td>
                                                <td><span>${information.majorShareholder}</span></td>
                                            </tr>
                                            <tr>
                                                <td>经营范围:</td>
                                                <td>${information.businessScope}</td>
                                            </tr>
                                            <tr>
                                                <td>登记机关：</td>
                                                <td>${information.registrationAuthority}</td>
                                            </tr>
                                            <tr>
                                                <td>社会统一信用代码电子档：</td>
                                                <td><img src="<%=request.getContextPath()%>/js/static/images/softcopy@1x.png"></td>
                                            </tr>
                                            <tr>
                                                <td>工商登记注册电子档：</td>
                                                <td><img src="<%=request.getContextPath()%>/js/static/images/softcopy@1x.png"></td>
                                            </tr>
                                            <tr>
                                                <td>税务登记号电子档：</td>
                                                <td><img src="<%=request.getContextPath()%>/js/static/images/softcopy@1x.png"></td>
                                            </tr>
                                            <tr>
                                                <td>组织机构代码电子档：</td>
                                                <td><img src="<%=request.getContextPath()%>/js/static/images/softcopy@1x.png"></td>
                                            </tr>
                                            <tr>
                                                <td>法人身份证电子档：</td>
                                                <td><img src="<%=request.getContextPath()%>/js/static/images/softcopy@1x.png"></td>
                                            </tr>
                                            <tr>
                                                <td>开户许可证电子档：</td>
                                                <td><img src="<%=request.getContextPath()%>/js/static/images/softcopy@1x.png"></td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--基本资料 结束-->
                        <!--账户安全 开始-->
                        <div class="tab-pane" id="profile">
                            <div class="row">
                                <div class="col-xs-10">
                                    <form class="form-horizontal" role="form" id ="f">
                                        <div class="form-group">
                                            <label class="col-xs-2 control-label">验证码</label>
                                            <div class="senCode col-xs-8">
                                                <%--<input type="text" class="form-control col-xs-4" id="phone" name="phone" placeholder="输入手机号">--%>
                                                <input type="text" id="senCode" placeholder="输入验证码" class="form-control col-xs-4" name="senCode" size="6"/>
                                                <input id="btnSendCode" type="button" value="发送验证码" onclick="sendMessage()" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="newpwd" class="col-xs-2 control-label">新密码</label>
                                            <div class="col-xs-8">
                                                <input type="password" class="form-control" id="newpwd" name="newpwd">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="confirm" class="col-xs-2 control-label">确认密码</label>
                                            <div class="col-xs-8">
                                                <input type="password" class="form-control" id="confirm" name="confirm">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-xs-offset-3 col-xs-8">
                                                <button type="button" class="btn  btn-danger aq_qr_but" id="upda">确认</button>
                                            </div>
                                        </div>

                                    </form>
                                </div>
                            </div>
                        </div>
                        <!--账户安全 结束-->
                        <!--银行账户 开始-->
                        <div class="tab-pane" id="messages">
                            <button type="button" class="btn btn-danger btn-default tjyhk" id="addBankAccount">添加银行卡</button>
                            <div class="row">
                                <div class="col-xs-9 col-xs-offset-1" id="yh_bank">

                                </div>
                            </div>
                        </div>
                        <!--银行账户 结束-->

                        <!--三方账户 开始   -->
                        <div class="tab-pane" id="settings">
                            <!--三方账户 开户行开始-->
                            <div class="khh sfzh">
                                <form class="form-inline khh_form khh_form1" id="informationForm">
                                    <div class="form-group form-group1">
                                        <label for="tripartiteDepositBank">开户行</label>
                                        <input type="text" class="form-control" id="tripartiteDepositBank">
                                    </div>
                                    <div class="form-group form-group1">
                                        <label for="tripartiteCreditHolderPurchaser">户主</label>
                                        <input type="email" class="form-control"  id="tripartiteCreditHolderPurchaser">
                                    </div>
                                    <button type="button" class="btn  btn-danger" onclick="search()">查询</button>
                                    <button type="button" class="btn  btn-default" onclick="reset()">重置</button>
                                </form>
                            </div>
                            <!--三方账户 开户行结束-->
                            <!--三方账户 分页开始-->
                            <div class="panel-body" style="padding-bottom:0px;">
                                <table id="incormationTable" class="cj_table"></table>
                            </div>
                            <!--三方账户 分页结束-->
                        </div>
                        <!--三方账户 结束   -->

                        <!--运货单位 开始-->
                        <div class="tab-pane" id="settings1">
                            <button type="button"   class="btn  btn-danger  btn-default tjyhk" data-toggle="modal" data-target="#exampleModal11">添加货运单位</button>
                            <div class="row">
                                <div class="col-xs-9 col-xs-offset-1" id="wyb">

                                </div>
                            </div>


                            <!--货运单位 蒙泰框-->
                            <div class="modal fade" id="exampleModal11" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                            <h4 class="modal-title">添加货运单位</h4>
                                        </div>
                                        <form id="freightForm">
                                        <div class="modal-header sh_div">

                                            <div class="row">
                                                <div class="col-xs-3"><span class="xingxing xx1">*</span>货运单位名称</div>
                                                <div class="col-xs-9"><input name="freightName" type="text" class="form-control sh_input"></div>
                                            </div>
                                            <div class="row">
                                                <div class="col-xs-3"><span class="xingxing xx1">*</span>货运方联系人</div>
                                                <div class="col-xs-9"><input name="freightContactPerson" type="text" class="form-control sh_input"></div>
                                            </div>
                                            <div class="row">
                                                <div class="col-xs-3"><span class="xingxing xx1">*</span>货运方联系人手机号</div>
                                                <div class="col-xs-9"><input name="freightContactPhone" type="text" class="form-control sh_input"></div>
                                            </div>
                                            <div class="row">
                                                <div class="col-xs-3" ><span class="xingxing xx1">*</span>设为默认</div>
                                                <div class="col-xs-9">
                                                    <label class="radio-inline">
                                                        <input type="radio" name="freightDefaultAddress" value="1"> 是
                                                    </label>
                                                    <label class="radio-inline">
                                                        <input type="radio" name="freightDefaultAddress" value="0" checked> 否
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button id="addhydw" type="button" class="btn btn-default" data-dismiss="modal">确认</button>
                                            <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
                                        </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <!--货运单位 蒙泰框 结束-->
                        </div>
                        <!--运货单位 结束-->
                    </div>
                </div>
                <!--tab 内容 结束-->
            </div>
        </div>
        <!--bootstrap tab 切换 结束-->

    </div>
</div>


</body>
<script>
    $('#myTab a:first').tab('show');

    $('#myTab a').click(function (e) {
        e.preventDefault();
        $(this).tab('show');
    })

    $('#updateInformation').click(function(){
        $('#load').load('<%=request.getContextPath()%>/tradeMain/updateInformation.action')
    })
    $('#zlrz').click(function(){
        $('#load').load('<%=request.getContextPath()%>/tradeMain/zlrz.action')
    })

    /*$(function (){
        initComplexArea('seachprov', 'seachcity', 'seachdistrict', area_array, sub_array, '44', '0', '0');
    });*/
    switch ('${messages}'){
        case 'profile':
            $('#myTab a[href="#profile"]').tab('show')
            break;
        case 'home':
            $('#myTab a[href="#home"]').tab('show')
            break;
        case 'settings':
            $('#myTab a[href="#settings"]').tab('show')
            break;
    }

    var InterValObj; //timer变量，控制时间
    var count = 60; //间隔函数，1秒执行
    var curCount;//当前剩余秒数
    var code = ""; //验证码
    var codeLength = 6;//验证码长度
    function sendMessage() {
        curCount = count;
        var phone=$("#phone").val();//手机号码
        var myreg = /^(((13[0-9]{1})|(14[0-9]{1})|(17[0]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/;
        //设置button效果，开始计时
        $("#btnSendCode").attr("disabled", "true");
        $("#btnSendCode").val(+ curCount + "秒");
        InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次
        //向后台发送处理数据
        $.ajax({
            type: "POST", //用POST方式传输
            dataType: "text", //数据格式:JSON
            url: '<%=request.getContextPath()%>/captialHomes/sendMsg.action', //目标地址
//                data: "phone=" + phone + "&code=" + code,
            error: function (XMLHttpRequest, textStatus, errorThrown) { },
            success: function (msg){ }
        });
//        }
    }
    //timer处理函数
    function SetRemainTime() {
        if (curCount == 0) {
            window.clearInterval(InterValObj);//停止计时器
            $("#btnSendCode").removeAttr("disabled");//启用按钮
            $("#btnSendCode").val("重新发送验证码");
            code = ""; //清除验证码。如果不清除，过时间后，输入收到的验证码依然有效
        }
        else {
            curCount--;
            $("#btnSendCode").val( curCount + "秒");
        }
    }
    $(function() {
        $("#upda").click(function () {
            $.ajax({
                url: "<%=request.getContextPath()%>/password/changePwd.action",
                type: 'post',
                data: $("#f").serialize(),
                dataType: "json",
                success: function (data) {
                    alert(data);
                }
            });
        });
    })

    //三方账户
    $(function(){
        $("#incormationTable").bootstrapTable({
            columns:[
                { //field: 'Number',//可不加
                    title: '序号',//标题  可不加
                    width:100,
                    formatter: function (value, row, index) {
                        return index+1;
                    }
                },
                {field:'tripartiteDepositBank',title:'开户行'},
                {field:'tripartiteCreditHolderPurchaser',title:'户主（采购方）'},
                {field:'tripartiteAccountNumber',title:'账号'},
                {field:'tripartiteAccountOpentime',title:'账号开通时间',
                    formatter:function(value,row,index){
                        return ConvertToDate(value)
                    }
                },
                {field:'tripartiteAccountOpenpeople',title:'账号开通人'},
                {field:'tripartiteAmountCreateTime',title:'创建时间',
                    formatter:function(value,row,index){
                        return ConvertToDate(value)
                    }
                },
                {field:'tripartiteAmountCreatePeople',title:'创建人'}
            ],
            url:'<%=request.getContextPath()%>/tripartite/tripartitePage.action',
            method:'post',
            queryParamsType:'',
            queryParams: queryParams,//传递参数（*）
            //【其它设置】
            locale:'zh-CN',//中文支持
            pagination: true,//是否开启分页（*）
            pageNumber:1,//初始化加载第一页，默认第一页
            pageSize: 3,//每页的记录行数（*）
            sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
            //发送到服务器的数据编码类型  {order: "asc", offset: 0, limit: 5}
            contentType:'application/x-www-form-urlencoded;charset=UTF-8'   //数据编码纯文本  offset=0&limit=5
        });
    });
    //得到查询的参数
    function queryParams (params) {
        var temp = {  //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            pageNumber: params.pageNumber,
            pageSize: params.pageSize,
            tripartiteDepositBank:$("#tripartiteDepositBank").val(),
            tripartiteCreditHolderPurchaser:$("#tripartiteCreditHolderPurchaser").val()
        };
        return temp;
    }
    //搜索
    function search(){
        $("#incormationTable").bootstrapTable('refresh');
    }
    //重置查询
    function reset(){
        $("#informationForm").form('reset');
        crownSearch();
    }
    /*货运管理 ajax 开始*/
    $.ajax({
        url:"<%=request.getContextPath()%>/freight/getAllFreight.action",
        type:"post",
        dataType:"json",
        success: function(data){
            var wyb=document.getElementById('wyb')
            function setDiv(item){
                var wyb_ul='<ul class="media-list">' +
                    '<li class="media hy_hygl1">' +
                    '<div class="media-left hygl clearfix" style="width:350px;">' +
                    '<div class="hygl_left">' +
                    '<div class="panel-body"><p><span>货运单位名称：</span>'+item.freightName+'</p><p><span>货运联系人：</span>'+item.freightContactPerson+'</p><p><span>货运联系人手机号：</span>'+item.freightContactPhone+'</p></div>' +
                    '</div>' +
                    '<div class="hygl_right">' +
                    '<div class="panel-body"><div class="mored hy_moren"><input type="radio" value='+item.freightDefaultAddress+' onclick="radioAddress('+item.freightId+',1)"><span>默认</span></div><div class="hy_logo"><img  class="imgimg"></div></div>'+
                    '</div>' +
                    '</div>' +
                    '<div class="media-body"><button type="button" class="btn btn-danger btn-default" onclick=if(confirm("确定删除？")){deleteFreight('+item.freightId+')}>删除</button></div>' +
                    '</li>' +
                    '</ul>'

                return wyb_ul
            }
            function getnoApplicationData111(){
                var html = ''
                for(var i = 0;i<data.length;i++){
                    html += setDiv(data[i])
                }
                wyb.innerHTML = html;
            }
            window.onload = getnoApplicationData111()
            var aaa=document.querySelectorAll('.imgimg')
            for(var i=0;i<data.length;i++){
                if(data[i].freightName=='中通'){
                    $(aaa[i]).attr('src','<%=request.getContextPath()%>/js/static/images/logo_debang@1x.png')
                }else if(data[i].freightName=='申通'){
                    $(aaa[i]).attr('src','<%=request.getContextPath()%>/js/static/images/logo_shentong@1x.png')
                }else if(data[i].freightName=='德邦'){
                    $(aaa[i]).attr('src','<%=request.getContextPath()%>/js/static/images/logo_yuantong@1x.png')
                }
            }
            var input=$('.hy_moren input[type=radio]')
            console.log(input.length)
            for(var i=0;i<input.length;i++){
                if(data[i].freightDefaultAddress ==　"1"){
                    console.log(data[i])
                    console.log(input[i])
                    $(input[i]).attr('checked','checked')
                }
            }
        }
    })
    /*货运管理 ajax 开始*/
    /*银行账户 ajax 开始*/
    $.ajax({
        url:"<%=request.getContextPath()%>/bankAccount/getAllBankAccoun.action",
        type:"post",
        dataType:"json",
        success: function(data){
            var yhBank=document.getElementById('yh_bank');
            function setDiv(item){
                var yh_bank='<ul class="media-list">' +
                    '<li class="media hy_hygl1">' +
                    '<div class="media-left hygl clearfix" style="width:350px;">' +
                    '<div class="hygl_left">' +
                    '<div class="panel-body"><p>'+item.bankAccountDepositBank+'</p><p>'+item.bankAccountNumber+'</p></div>' +
                    '</div>' +
                    '<div class="hygl_right">' +
                    '<div class="panel-body"><div class="mored yh_bank_moren"><input type="radio" value='+item.defaultId+' onclick="setDefaultBankAccount('+item.bankAccountId+',1)"><span>默认</span></div><div class="hy_logo"></div></div>'+
                    '</div>' +
                    '</div>' +
                    '<div class="media-body"><button type="button" class="btn btn-danger btn-default" onclick=if(confirm("确定删除？")){deleteBankAccount('+item.bankAccountId+')}>删除</button></div>' +
                    '</li>' +
                    '</ul>'

                return yh_bank
            }

            function getnoApplicationDatayh_bank(){
                var html = ''
                for(var i = 0;i<data.length;i++){
                    html += setDiv(data[i])
                }
                yhBank.innerHTML = html;
            }
            window.onload = getnoApplicationDatayh_bank()
            var input1=$('.yh_bank_moren input[type=radio]')
            for(var i=0;i<input1.length;i++){
                if(data[i].defaultId=='1'){
                    $(input1[i]).attr('checked',true)
                }
            }
        }
    })
    /* 银行账户ajax 结束*/

    //添加货运管理
    $("#addhydw").click(function () {
        $.ajax({
            url:"<%=request.getContextPath()%>/freight/addFreight.action",
            dataType:'json',
            type:'POST',
            data:$("#freightForm").serialize(),
            success:function (data) {
                alert("添加成功！！")
                setTimeout("$('#load').load('<%=request.getContextPath()%>/tradeMain/zhxx.action')",500);
            }
        })
    })

    /**
     * 设为默认货运管理
     * @param id
     */
    function radioAddress(id,value){
        $.ajax({
            url:'<%=request.getContextPath()%>/freight/setDefault.action?id='+id+'&&value='+value,
            type:'post',
            success:function(){
                alert("设置成功")
                setTimeout("$('#load').load('<%=request.getContextPath()%>/tradeMain/zhxx.action')",500);
            }
        })
    }


    /**
     * 删除货运管理
     * @param datestr
     * @returns {string}
     * @constructor
     */
    function deleteFreight(id){
        $.ajax({
            url:'<%=request.getContextPath()%>/freight/deleteFreight.action?id='+id,
            type:'post',
            success:function(){
                alert('删除成功')
                setTimeout("$('#load').load('<%=request.getContextPath()%>/tradeMain/zhxx.action')",500);
            }
        })
    }


/*银行卡页面*/

    //添加银行卡
    <%--$("#addBank").click(function () {--%>
        <%--$.ajax({--%>
            <%--url:"<%=request.getContextPath()%>/bankAccount/addBankAccount.action",--%>
            <%--dataType:'json',--%>
            <%--type:'POST',--%>
            <%--data:$("#freightForm").serialize(),--%>
            <%--success:function (data) {--%>
                <%--alert("添加成功！！")--%>
                <%--setTimeout("$('#load').load('<%=request.getContextPath()%>/tradeMain/zhxx.action')",500);--%>
            <%--}--%>
        <%--})--%>
    <%--})--%>

    $('#addBankAccount').click(function(){
        $('#load').load('<%=request.getContextPath()%>/tradeMain/bankOne.action')
    })

    /**
     * 设置默认银行账户
     * @param id
     */
    function setDefaultBankAccount(id,value){
        $.ajax({
            url:'<%=request.getContextPath()%>/bankAccount/setDefaultBank.action?id='+id+'&&value='+value,
            type:'post',
            success:function(){
                alert("设置成功")
                setTimeout("$('#load').load('<%=request.getContextPath()%>/tradeMain/zhxx.action')",500);
            }
        })
    }


    /**
     * 删除银行卡
     * @param datestr
     * @returns {string}
     * @constructor
     */
    function deleteBankAccount(id){
        $.ajax({
            url:'<%=request.getContextPath()%>/bankAccount/deleteBankAccount.action?id='+id,
            type:'post',
            success:function(){
                alert('删除成功')
                setTimeout("$('#load').load('<%=request.getContextPath()%>/tradeMain/zhxx.action')",500);
            }
        })
    }


    function ConvertToDate(datestr) {
        var date=new Date(datestr);
        var year=date.getFullYear();
        var month=date.getMonth()+1;
        if(month < 10){
            month = "0"+month
        }else{
            month = ''+month
        }
        var day=date.getDate();
        if(day < 10){
            day = "0"+day
        }else{
            day = ''+day
        }
        var hours = date.getHours()
        if(hours < 10){
            hours = "0"+hours
        }else{
            hours = ''+hours
        }
        var minutes = date.getMinutes(); //获取当前分钟数(0-59)
        if(minutes < 10){
            minutes = "0"+minutes
        }else{
            minutes = ''+minutes
        }
        var seconds = date.getSeconds();
        if(seconds < 10){
            seconds = "0"+seconds
        }else{
            seconds = ''+seconds
        }
        return year+"-"+month+"-"+day+"-"+hours+":"+minutes+":"+seconds;
    }









</script>


</html>