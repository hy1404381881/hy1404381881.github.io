/**
 *=============
 */
/*
*页面地址所在的ip
*/
var appUrl="http://localhost:8042"
/**
 * 应用的url,后台应用的url
 */
var baseUrl="http://localhost:8080";

/**
 * token,前后台交互的密钥
 */
var token=$.cookie('token');
if(!token){
   // window.location.href="index.html"
}
/**
 * cookie的过期时间，单位是天，jquery.cookie插件的计时单位
 */
var cookie_expire_time=2;
/**
 * 前台网址的url
 */
var web_url={
    login:{
        login:appUrl+"/login.html"
    }
}
/**
 *==============应用的接口说明
 */
var app_url={
    login:{
        login:baseUrl+"/login",/*登陆地址*/

    },
    user:{
        auth:baseUrl+"/require_auth",/*授权地址*/
    },
    manage:{
        userMenu:baseUrl+"/manage/menuUserList",/*获取用户菜单*/
        userList:baseUrl+"/manage/userList",/*获取用户 */
        userAdd:baseUrl+"/manage/userAdd",/*添加用户 */
        userListTest:baseUrl+"/manage/userListTest",/*获取测试用户 */
        user_get:baseUrl+"/manage/user/",/*获取用户*/
        user_update:baseUrl+"/manage/userUpdate",/*更新用户*/
        user_delete:baseUrl+"/manage/userDelete/",/*删除用户*/
        menu_list:baseUrl+"/manage/menuList",//获取菜单

    }
};
console.log(app_url);
/**
 *============== 弹窗插件(组件封装)
 */
(function ($) {

    window.Ewin = function () {
        var html = '<div id="[Id]" class="modal fade" role="dialog" aria-labelledby="modalLabel">' +
                              '<div class="modal-dialog modal-sm">' +
                                  '<div class="modal-content">' +
                                      '<div class="modal-header">' +
                                          '<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>' +
                                          '<h4 class="modal-title" id="modalLabel">[Title]</h4>' +
                                      '</div>' +
                                      '<div class="modal-body">' +
                                      '<p>[Message]</p>' +
                                      '</div>' +
                                       '<div class="modal-footer">' +
        '<button type="button" class="btn btn-default cancel" data-dismiss="modal">[BtnCancel]</button>' +
        '<button type="button" class="btn btn-primary ok" data-dismiss="modal">[BtnOk]</button>' +
    '</div>' +
                                  '</div>' +
                              '</div>' +
                          '</div>';


        var dialogdHtml = '<div id="[Id]" class="modal fade" role="dialog" aria-labelledby="modalLabel">' +
                              '<div class="modal-dialog">' +
                                  '<div class="modal-content">' +
                                      '<div class="modal-header">' +
                                          '<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>' +
                                          '<h4 class="modal-title" id="modalLabel">[Title]</h4>' +
                                      '</div>' +
                                      '<div class="modal-body">' +
                                      '</div>' +
                                  '</div>' +
                              '</div>' +
                          '</div>';
        var reg = new RegExp("\\[([^\\[\\]]*?)\\]", 'igm');
        var generateId = function () {
            var date = new Date();
            return 'mdl' + date.valueOf();
        }
        var init = function (options) {
            options = $.extend({}, {
                title: "操作提示",
                message: "提示内容",
                btnok: "确定",
                btncl: "取消",
                width: 200,
                auto: false
            }, options || {});
            var modalId = generateId();
            var content = html.replace(reg, function (node, key) {
                return {
                    Id: modalId,
                    Title: options.title,
                    Message: options.message,
                    BtnOk: options.btnok,
                    BtnCancel: options.btncl
                }[key];
            });
            $('body').append(content);
            $('#' + modalId).modal({
                width: options.width,
                backdrop: 'static'
            });
            $('#' + modalId).on('hide.bs.modal', function (e) {
                $('body').find('#' + modalId).remove();
            });
            return modalId;
        }

        return {
            alert: function (options) {
                if (typeof options == 'string') {
                    options = {
                        message: options
                    };
                }
                var id = init(options);
                var modal = $('#' + id);
                modal.find('.ok').removeClass('btn-success').addClass('btn-primary');
                modal.find('.cancel').hide();

                return {
                    id: id,
                    on: function (callback) {
                        if (callback && callback instanceof Function) {
                            modal.find('.ok').click(function () { callback(true); });
                        }
                    },
                    hide: function (callback) {
                        if (callback && callback instanceof Function) {
                            modal.on('hide.bs.modal', function (e) {
                                callback(e);
                            });
                        }
                    }
                };
            },
            confirm: function (options) {
                var id = init(options);
                var modal = $('#' + id);
                modal.find('.ok').removeClass('btn-primary').addClass('btn-success');
                modal.find('.cancel').show();
                return {
                    id: id,
                    on: function (callback) {
                        if (callback && callback instanceof Function) {
                            modal.find('.ok').click(function () { callback(true); });
                            modal.find('.cancel').click(function () { callback(false); });
                        }
                    },
                    hide: function (callback) {
                        if (callback && callback instanceof Function) {
                            modal.on('hide.bs.modal', function (e) {
                                callback(e);
                            });
                        }
                    }
                };
            },
            dialog: function (options) {
                options = $.extend({}, {
                    title: 'title',
                    url: '',
                    width: 800,
                    height: 550,
                    onReady: function () { },
                    onShown: function (e) { }
                }, options || {});
                var modalId = generateId();

                var content = dialogdHtml.replace(reg, function (node, key) {
                    return {
                        Id: modalId,
                        Title: options.title
                    }[key];
                });
                $('body').append(content);
                var target = $('#' + modalId);
                target.find('.modal-body').load(options.url);
                if (options.onReady())
                    options.onReady.call(target);
                target.modal();
                target.on('shown.bs.modal', function (e) {
                    if (options.onReady(e))
                        options.onReady.call(target, e);
                });
                target.on('hide.bs.modal', function (e) {
                    $('body').find(target).remove();
                });
            }
        }
    }();
})(jQuery);
//数组转json
function arrayToJson(formArray){
    var dataArray = {};
    $.each(formArray,function(){
      if(dataArray[this.name]){
        if(!dataArray[this.name].push){
          dataArray[this.name] = [dataArray[this.name]];
        }
        dataArray[this.name].push(this.value || '');
      }else{
        dataArray[this.name] = this.value || '';
      }
    });
    return JSON.stringify(dataArray);
  }
  //封装请求对象和
  var tokenAjaxObj={
    headers: {
        "Authorization": token
      },
    url: "",
    contentType: "application/json",
    dataType: "json",
    data:null,
    cache: false,
    processData: false,
    async: status,
    type: "post",
  }
  function tokenAjax(obj,callbackSuccess,callbackFailure){
    $.ajax({
        headers: {
          "Authorization": obj.headers.Authorization
        },
        url: obj.url,
        contentType: obj.contentType,
        dataType: obj.dataType,
        data: obj.data,
        cache: obj.cache,
        processData: obj.processData,
        async: obj.async,
        type: obj.type,
        success: function (data) {
          if (data.code == "200") {/*正确*/
            callbackSuccess(data)
          } else {/**错误*/
            callbackFailure(data)
          }
        }
      })
  }
  function tokenAjaxObjToNormal(){
    tokenAjaxObj={
        headers: {
            "Authorization": token
          },
        url: "",
        contentType: "application/json",
        dataType: "json",
        data:null,
        cache: false,
        processData: false,
        async: status,
        type: "post",
      }
  }
  //清空表单数据和对应验证
  function clearForm(formname){
    /**$(':input',formname) 
    .not(':button, :submit, :reset, :hidden') 
    .val('') 
    .removeAttr('checked') 
    .removeAttr('selected');  
    $(formname).data('bootstrapValidator').destroy();
    $(formname).data('bootstrapValidator', null);
    formValidator(); */
    window.location.reload();
  }
 //利用json给表单赋值
 $.extend({
    setForm :function(frm,jsonValue) {   
    var obj=$(frm);  
    $.each(jsonValue, function (name, ival) {  
        var $oinput = obj.find("input[name=" + name + "]");   
        if ($oinput.attr("type")== "radio" || $oinput.attr("type")== "checkbox"){  
             $oinput.each(function(){  
                 if(Object.prototype.toString.apply(ival) == '[object Array]'){// 是复选框，并且是数组
                      for(var i=0;i<ival.length;i++){  
                          if($(this).val()==ival[i])  
                             $(this).attr("checked", "checked");  
                      }  
                 }else{  
                     if($(this).val()==ival)  
                        $(this).attr("checked", "checked");  
                 }  
             });  
        }else if($oinput.attr("type")== "textarea"){// 多行文本框
            obj.find("[name="+name+"]").html(ival);  
        }else{  
             obj.find("[name="+name+"]").val(ival);   
        }  
    });
},
getFormJson:function(frm) {
        var o = {};
        var a = $(frm).serializeArray();

        $.each(a, function() {
            if (this.name == "password") {
                //this.value = $.md5(this.value) //md5操作 
　　　　　　　　　　this.value=this.value;
            }
            if (o[this.name] !== undefined) {
                if (!o[this.name].push) {
                    o[this.name] = [ o[this.name] ];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
}
});





