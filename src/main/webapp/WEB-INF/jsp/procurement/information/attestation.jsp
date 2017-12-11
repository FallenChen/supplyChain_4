<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div class='col-xs-12'>
    <div class='row row_zhxx'>
        <div class="col-xs-12 zlxx_top">
            <a href="<%=request.getContextPath()%>/procurementMain/procurementMain.action">系统首页</a>
            <span>></span>
            <a href="#" id="zhxx">资料维护</a>
            <span>></span>
            <a href="#">企业认证</a>
        </div>
        <div class="col-xs-12">
            <div class="jbxx">
                <div class="row jbxx_row jbxx_zlbj">
                    <div class="col-xs-8">
                        <h5>企业证明资料</h5>
                    </div>
                </div>
                <div class="row">
                        <table class="table table_one">
                            <tbody>
                                <tr>
                                    <td style="width: 20%;" class="text-right"><span class="xingxing">*</span>企业证件类型:</td>
                                    <td>
                                        <select class="form-control qyrz_select" id="three_certificates">
                                            <option value="0">三证合一</option>
                                            <option value="1">非三证合一</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr class="three_no_certificates">
                                    <td class="text-right"><span class="xingxing">*</span>社会统一信用代码：</td>
                                    <td>
                                        <form>
                                            <div style="float: left;" class="uploadForm" enctype='multipart/form-data'>
                                                <div class="fileinput fileinput-new" data-provides="fileinput">
                                                    <div class="fileinput-new thumbnail" style="width: 200px;height: auto;max-height:150px;">
                                                        <img style="width: 100%;height: auto;" src="<%=request.getContextPath()%>/js/static/images/no_img.png" class="img-responsive jbxx_img" alt="" />
                                                    </div>
                                                    <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
                                                    <div style="float: right;margin: 10px 20px;">
                                                    <span class="btn btn-primary btn-file btn-danger">
                                                        <span class="fileinput-new">选择文件</span>
                                                        <span class="fileinput-exists">换一张</span>
                                                        <input type="file" class="imgfile" name="pic1" class="picID" accept="image/gif,image/jpeg,image/x-png"/>
                                                    </span>
                                                        <a href="javascript:;" class="btn btn-warning fileinput-exists" data-dismiss="fileinput">移除</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>

                                    </td>
                                </tr>
                                <tr class="three_certificates">
                                    <td class="text-right"><span class="xingxing">*</span>工商登记注册号电子档：</td>
                                    <td>
                                        <form>
                                            <div style="float: left;" class="uploadForm" enctype='multipart/form-data'>
                                                <div class="fileinput fileinput-new" data-provides="fileinput">
                                                    <div class="fileinput-new thumbnail" style="width: 200px;height: auto;max-height:150px;">
                                                        <img style="width: 100%;height: auto;max-height: 140px;" src="<%=request.getContextPath()%>/js/static/images/no_img.png" class="img-responsive jbxx_img" alt="" />
                                                    </div>
                                                    <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
                                                    <div style="float: right;margin: 10px 20px;">
                                                        <span class="btn btn-primary btn-file btn-danger">
                                                            <span class="fileinput-new">选择文件</span>
                                                            <span class="fileinput-exists">换一张</span>
                                                            <input type="file" name="pic1" class="picID" accept="image/gif,image/jpeg,image/x-png"/>
                                                        </span>
                                                        <a href="javascript:;" class="btn btn-warning fileinput-exists" data-dismiss="fileinput">移除</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>

                                    </td>
                                </tr>
                                <tr  class="three_certificates">
                                    <td class="text-right"><span class="xingxing">*</span>税务登记号电子档：</td>
                                    <td>
                                        <form>
                                            <div style="float: left;" class="form-group" class="uploadForm" enctype='multipart/form-data'>
                                                <div class="fileinput fileinput-new" data-provides="fileinput">
                                                    <div class="fileinput-new thumbnail" style="width: 200px;height: auto;max-height:150px;">
                                                        <img style="width: 100%;height: auto;" src="<%=request.getContextPath()%>/js/static/images/no_img.png" class="img-responsive jbxx_img" alt="" />
                                                    </div>
                                                    <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
                                                    <div style="float: right;margin: 10px 20px;">
                                                    <span class="btn btn-primary btn-file btn-danger">
                                                        <span class="fileinput-new">选择文件</span>
                                                        <span class="fileinput-exists">换一张</span>
                                                        <input type="file" class="imgfile" name="pic1" class="picID" accept="image/gif,image/jpeg,image/x-png"/>
                                                    </span>
                                                        <a href="javascript:;" class="btn btn-warning fileinput-exists" data-dismiss="fileinput">移除</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>

                                    </td>
                                </tr>
                                <tr  class="three_certificates">
                                    <td class="text-right"><span class="xingxing">*</span>组织机构代码电子档：</td>
                                    <td>
                                        <form>
                                            <div style="float: left;" class="form-group" class="uploadForm" enctype='multipart/form-data'>
                                                <div class="fileinput fileinput-new" data-provides="fileinput">
                                                    <div class="fileinput-new thumbnail" style="width: 200px;height: auto;max-height:150px;">
                                                        <img style="width: 100%;height: auto;" src="<%=request.getContextPath()%>/js/static/images/no_img.png" class="img-responsive jbxx_img" alt="" />
                                                    </div>
                                                    <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
                                                    <div style="float: right;margin: 10px 20px;">
                                                    <span class="btn btn-primary btn-file btn-danger">
                                                        <span class="fileinput-new">选择文件</span>
                                                        <span class="fileinput-exists">换一张</span>
                                                        <input type="file" class="imgfile" name="pic1" class="picID" accept="image/gif,image/jpeg,image/x-png"/>
                                                    </span>
                                                        <a href="javascript:;" class="btn btn-warning fileinput-exists" data-dismiss="fileinput">移除</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>

                                    </td>
                                </tr>
                                <tr>
                                    <td class="text-right"><span class="xingxing">*</span>开户许可证电子档：</td>
                                    <td>
                                        <form>
                                            <div style="float: left;" class="form-group" class="uploadForm" enctype='multipart/form-data'>
                                                <div class="fileinput fileinput-new" data-provides="fileinput">
                                                    <div class="fileinput-new thumbnail" style="width: 200px;height: auto;max-height:150px;">
                                                        <img style="width: 100%;height: auto;" src="<%=request.getContextPath()%>/js/static/images/no_img.png" class="img-responsive jbxx_img" class="" alt="" />
                                                    </div>
                                                    <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
                                                    <div style="float: right;margin: 10px 20px;">
                                                    <span class="btn btn-primary btn-file btn-danger">
                                                        <span class="fileinput-new">选择文件</span>
                                                        <span class="fileinput-exists">换一张</span>
                                                        <input type="file" class="imgfile" name="pic1" class="picID" accept="image/gif,image/jpeg,image/x-png"/>
                                                    </span>
                                                        <a href="javascript:;" class="btn btn-warning fileinput-exists" data-dismiss="fileinput">移除</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>

                                    </td>
                                </tr>
                            </tbody>
                        </table>
                </div>
            </div>


            <div class="jbxx">
                <div class="row jbxx_row jbxx_zlbj">
                    <div class="col-xs-8">
                        <h5>法定代表人证明资料</h5>
                    </div>
                </div>
                <div class="row">
                     <table class="table table_one">
                            <tbody>
                            <tr>
                                <td style="width: 20%;" class="text-right"><span class="xingxing">*</span>法定代表人证件类型：</td>
                                <td>
                                    <select class="form-control qyrz_select">
                                        <option value="0">居民身份证</option>
                                        <option value="1">护照</option>
                                        <option value="2">港澳居民来往内地通行证</option>
                                        <option value="3">台湾居民来往大陆通行证</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="text-right"><span class="xingxing">*</span>*法人身份证明正面：</td>
                                <td>
                                    <form>
                                        <div style="float: left;" class="uploadForm" enctype='multipart/form-data'>
                                            <div class="fileinput fileinput-new" data-provides="fileinput">
                                                <div class="fileinput-new thumbnail" style="width: 200px;height: auto;max-height:150px;">
                                                    <img style="width: 100%;height: auto;max-height: 140px;" src="<%=request.getContextPath()%>/js/static/images/no_img.png" class="img-responsive jbxx_img" alt="" />
                                                </div>
                                                <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
                                                <div style="float: right;margin: 10px 20px;">
                                                    <span class="btn btn-primary btn-file btn-danger">
                                                        <span class="fileinput-new">选择文件</span>
                                                        <span class="fileinput-exists">换一张</span>
                                                        <input type="file" name="pic1" class="picID" accept="image/gif,image/jpeg,image/x-png"/>
                                                    </span>
                                                    <a href="javascript:;" class="btn btn-warning fileinput-exists" data-dismiss="fileinput">移除</a>
                                                </div>
                                            </div>
                                        </div>
                                    </form>

                                </td>
                            </tr>
                            <tr>
                                <td class="text-right"><span class="text-right">*</span>法人身份证明背面：</td>
                                <td>
                                    <form>
                                        <div style="float: left;" class="form-group" class="uploadForm" enctype='multipart/form-data'>
                                            <div class="fileinput fileinput-new" data-provides="fileinput">
                                                <div class="fileinput-new thumbnail" style="width: 200px;height: auto;max-height:150px;">
                                                    <img class="img-responsive jbxx_img" style="width: 100%;height: auto;" src="<%=request.getContextPath()%>/js/static/images/no_img.png" alt="" />
                                                </div>
                                                <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
                                                <div style="float: right;margin: 10px 20px;">
                                                <span class="btn btn-primary btn-file btn-danger">
                                                    <span class="fileinput-new">选择文件</span>
                                                    <span class="fileinput-exists">换一张</span>
                                                    <input type="file" class="imgfile" name="pic1" class="picID" accept="image/gif,image/jpeg,image/x-png"/>
                                                </span>
                                                    <a href="javascript:;" class="btn btn-warning fileinput-exists" data-dismiss="fileinput">移除</a>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                </div>
            </div>
        </div>
        <button type="button" id="uploadSubmit" class="btn btn-danger btn-info col-xs-offset-3">提交</button>
    </div>
</div>
</body>
<script>
    $('#uploadSubmit').click(function () {
        var aaa=$('.fileinput-preview>img')
        for(var i=0;i<aaa.length;i++){
            console.log(i,aaa[i].src)
        }


//        $.ajax({
//            url: 'xxx/xxx',
//            type: 'POST',
//            data: data,
//            async: false,
//            cache: false,
//            contentType: false,
//            processData: false,
//            success: function (data) {
//                console.log(data);
//                if(data.status){
//                    console.log('upload success');
//                }else{
//                    console.log(data.message);
//                }
//            },
//            error: function (data) {
//                console.log(data.status);
//            }
//        });
    });

    $(function () {
        if($('#three_certificates').find("option:checked").attr("value")==0){
            $('.three_certificates').hide()
            $('.three_no_certificates').show()
        }else{
            $('.three_certificates').show()
            $('.three_no_certificates').hide()
        }
    })

    $("#three_certificates").change(function() {
        if($(this).find("option:checked").attr("value")==0){
            $('.three_certificates').hide()
            $('.three_no_certificates').show()
        }else{
            $('.three_certificates').show()
            $('.three_no_certificates').hide()
        }

    });

    $('#zhxx').click(function(){
        $('#load').load('<%=request.getContextPath()%>/procurementMain/zhxx.action')
    })

</script>
</html>