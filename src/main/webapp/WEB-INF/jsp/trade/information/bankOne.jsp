<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加银行卡</title>
    <style>
        .yhk_form{
            margin-top:40px;
        }
        .yhk_form div label{
            line-height: 40px;
            font-weight: normal;
        }
        .yhk_form div{
            margin-bottom:20px;
        }
        .yhk_form div select {
            width:250px!important;
        }
        .yhk_form div input{
            width:250px!important;
        }

        .yhk_two_form{
            margin-top:40px;
        }
        .yhk_two_form div label{
            line-height: 30px;
            font-weight: normal;
        }
        .yhk_two_form div span{
            line-height: 30px;
        }
        .yhk_two_form div{
            margin-bottom:10px;
        }
        #yhk_two{
            margin-top:30px;
            /*width:120px;*/
        }


        .active{
            background: red;
        }
        .tjyhk_one,.tjyhk_two,.tjyhk_three,.tjyhk_four{
            display: none;
        }

        .yhk_three{
            margin-top:40px;
            margin-bottom:30px;
        }

        .tjyhk_four p{
            margin:40px 0 40px 0;
            font-size: 20px;
        }
        .tjyhk_four button{
            margin-left: 10px;
        }
        #yhk_next_two_bu{
            margin-top:30px;
        }
    </style>
</head>
<body>
<div class='col-xs-12'>
    <div class='row row_zhxx'>
        <div class="col-xs-12 zlxx_top">
            <a href="<%=request.getContextPath()%>/tradeMain/tradeMain.action">系统首页</a>
            <span>></span>
            <a id="zlwh2" href="#">资料维护</a>
            <span>></span>
            <a href="#">添加银行卡</a>
        </div>
    </div>
    <div class="col-xs-12 tjyhk_one">
        <form   id="bankformId"  class='form-inline yhk_form col-xs-10 col-xs-offset-1'>
            <div class="row">
                <label class="col-xs-2 text-right"><span class="xingxing">*</span>银行卡类型：</label>
                <select class="selectpicker form-control" id="yhklx" name="bankAccountDepositBank">
                    <option value="0">中国邮政银行</option>
                    <option value="1">中国建设银行</option>
                    <option value="2">中国光大银行</option>
                </select>
            </div>
            <div class="row">
                <label class="col-xs-2 text-right"><span class="xingxing">*</span>持卡人：</label>
                <input type="text" id="ckr" name="bankAccountCreditHolder" class="form-control col-xs-6" placeholder="输入持卡人">
            </div>
            <div class="row">
                <label class="col-xs-2 text-right"><span class="xingxing">*</span>卡号：</label>
                <!--<input type="text" id="kh" class="form-control" placeholder="请输入卡号">-->
                <input type="text" class="form-control" onkeyup="www_zzjs_net(this)" onkeydown="www_zzjs_net(this)" name="bankAccountNumber" id="account">
            </div>
        </form>
        <div class="col-xs-12">
            <label class="col-xs-3 text-right"></label>
            <button class="btn btn-danger" id="yhk_one">下一步</button>
        </div>
    </div>
    <div class="col-xs-12 tjyhk_two">
        <form class='form-inline yhk_two_form col-xs-10 col-xs-offset-1'>
            <div class="row">
                <label class="col-xs-2 text-right"><span class="xingxing">*</span>卡类型：</label>
                <span class="col-xs-4" id="klx"></span>
            </div>
            <div class="row">
                <label class="col-xs-2 text-right"><span class="xingxing">*</span>手机号：</label>
                <span class="col-xs-4" id="phone"></span>
            </div>
        </form>
        <div class="col-xs-12">
            <label class="col-xs-3 text-right"></label>
            <button class="btn btn-danger" id="yhk_two">下一步</button>
        </div>
    </div>

    <div class="tjyhk_three col-xs-offset-2">
        <div class="yhk_three">
            <p>本次操作需要短信确认，请输入<span id="sjyzh"></span>收到的短信校验码</p>
        </div>
        <form class='form-inline'>
                <span>验证码：</span>
                <input type="text" id="checkCode" placeholder="输入验证码" class="form-control" name="checkCode"/>
                <input id="btnSendCode" class="btn" type="button" value="获取验证码" onclick="sendMessage()" />
        </form>
        <div>
            <button class="btn btn-danger col-xs-offset-1" id="yhk_next_two_bu">下一步</button>
        </div>
    </div>
    <div class="col-xs-offset-2 tjyhk_four">
        <p>添加成功</p>
        <button class="btn btn-danger" id="last_btn">确定</button>
    </div>
</div>
</body>
<script>

    $('#zlwh2').click(function(){
        $('#load').load('<%=request.getContextPath()%>/tradeMain/zhxx.action')
    })
    $('#yhk_one').click(function(){
        if($.trim($('#ckr').val())==''){
            alert('请输入持卡人')
        }else if($.trim($('#account').val())==''){
            alert('请输入卡号')
        }else {
            $.ajax({
            url:"<%=request.getContextPath()%>/pmbankAccount/bankTwo.action",
//            dataType:'json',
            type:'POST',
            data:$("#bankformId").serialize(),
            success:function (data) {

                $('#phone').text(data.userPhone)
                $('#sjyzh').text(data.userPhone)

            }
            });
            $('.tjyhk_one').css('display','none')
            $('.tjyhk_two').css('display','block')
        }
    });


    $('#yhk_two').click(function(){
        $('.tjyhk_one').css('display','none')
        $('.tjyhk_two').css('display','none')
        $('.tjyhk_three').css('display','block')
    })

    $('#yhk_next_two_bu').on('click',function () {
        if($('#checkCode').val()==''){
            alert('输入验证码')
        }else{
            $('.tjyhk_one').css('display','none')
            $('.tjyhk_two').css('display','none')
            $('.tjyhk_three').css('display','none')
            $('.tjyhk_four').css('display','block')
        }
    })

    $('#last_btn').on('click',function () {
        console.log($('#yhklx option:selected').text())
        console.log($('#ckr').val())
        console.log($('#account').val())
        console.log($('#phone').text())
        $.ajax({
            url:'<%=request.getContextPath()%>/bankAccount/addBankAccount.action',
            type:'post',
            data:{bankAccountDepositBank:$('#yhklx option:selected').text(),bankAccountCreditHolder:$('#ckr').val(),bankAccountNumber:$('#account').val(),userPhone:$('#phone').text()},
            success:function (data) {
                setTimeout("$('#load').load('<%=request.getContextPath()%>/tradeMain/yhzh.action')",500);

            }
        })
    })

    /*$(this).text('完成添加')*/



    $('.tjyhk_one').css('display','block')
    function www_zzjs_net (BankNo)
    {
        if (BankNo.value == "") return;
        var account = new String (BankNo.value);
        account = account.substring(0,22); /*帐号的总数, 包括空格在内 */
        if (account.match (".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}") == null)
        {
            /* 对照格式 */
            if (account.match (".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}|" + ".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}|" +
                    ".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}|" + ".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}") == null)
            {
                var accountNumeric = accountChar = "", i;
                for (i=0;i<account.length;i++)
                {
                    accountChar = account.substr (i,1);
                    if (!isNaN (accountChar) && (accountChar != " ")) accountNumeric = accountNumeric + accountChar;
                }
                account = "";
                for (i=0;i<accountNumeric.length;i++)
                { /* 可将以下空格改为-,效果也不错 */
                    if (i == 4) account = account + "-"; /* 帐号第四位数后加空格 */
                    if (i == 8) account = account + "-"; /* 帐号第八位数后加空格 */
                    if (i == 12) account = account + "-";/* 帐号第十二位后数后加空格 */
                    account = account + accountNumeric.substr (i,1)
                }
            }
        }
        else
        {
            account = "-" + account.substring (1,5) + "-" + account.substring (6,10) + "-" + account.substring (14,18) + "-" + account.substring(18,25);
        }
        if (account != BankNo.value) BankNo.value = account;
    }
    function checkBankNo (BankNo)
    {
        if (BankNo.value == "") return;
        if (BankNo.value.match (".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}") == null)
        {
            if (BankNo.value.match ("[0-9]{19}") != null)
                www_zzjs_net (BankNo)
        }}
    function checkEnterForFindListing(e){
        var characterCode;
        if(e && e.which){
            e = e;
            characterCode = e.which ;
        }
        else{
            e = event;
            characterCode = e.keyCode;
        }
        if(characterCode == 22){
            document.forms[getNetuiTagName("findListingForm")].submit();
            return false;
        }
        else{
            return true ;
        }}
    var InterValObj; //timer变量，控制时间
    var count = 3; //间隔函数，1秒执行
    var curCount;//当前剩余秒数
    var code = ""; //验证码
    var codeLength = 6;//验证码长度
    function sendMessage() {
        curCount = count;
        //产生验证码
        for (var i = 0; i < codeLength; i++) {
            code += parseInt(Math.random() * 9).toString();
        }
        //设置button效果，开始计时
        $("#btnSendCode").attr("disabled", "true");
        $("#btnSendCode").val( + curCount + "秒秒后重获验证码");
        InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次
        $.ajax({
            type: "POST", //用POST方式传输
            dataType: "text", //数据格式:JSON
            data:{userPhone:$('#phone').text()},
            url: '<%=request.getContextPath()%>/captialHomes/sendMsgBank.action', //目标地址
//                data: "phone=" + phone + "&code=" + code,
            error: function (XMLHttpRequest, textStatus, errorThrown) { },
            success: function (msg){ }
        });

    }
    //timer处理函数
    function SetRemainTime() {
        if (curCount == 0) {
            window.clearInterval(InterValObj);//停止计时器
            $("#btnSendCode").removeAttr("disabled");//启用按钮
            $("#btnSendCode").val("发送验证码");
            code = ""; //清除验证码。如果不清除，过时间后，输入收到的验证码依然有效
        }
        else {
            curCount--;
            $("#btnSendCode").val( curCount + "秒后重获验证码");
        }
    }




    /* $(document).on('click','#yhk_next_bu',function(){
     alert($('#yhklx option:selected').text())
     if($.trim($('#ckr').val())==''){
     alert('请输入持卡人')
     }else if($.trim($('#account').val())==''){
     alert('请输入卡号')
     }else if(! ($('#yhklx option:selected').text()==aa && $.trim( $('#account').val().substring(0,6))== bb)){
     alert('输入类型正确的银行卡')
     }else{
     $('a').attr('href','gyl_index.html?t=yhk_two&phone='+14797359645+'&wyb='+122333)
     }
     })*/

    //    var option = document.getElementById('yhklx')
    //    console.log(option.children.length)
    //    $('#yhklx').click(function(){
    //        for(var i=0;i<option.children.length;i++){
    //           if($('#yhklx').children('option:selected')){
    //               $('#yhklx').children('option:selected').attr('selected',true).siblings().removeAttr('selected',false)
    //           }
    //        }
    //    })






</script>
</html>
