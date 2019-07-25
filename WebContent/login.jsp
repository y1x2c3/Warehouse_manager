<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="css/style.min.css" />
	</head>
	<body>
		<div class="dengluyemian"></div>
		<div class="dingbu">
			<img src="img/copyright.png" >
			<img src="img/gekai.png" >
		</div>	
		<form action="AdminServlet?action=login"  id="form"   method="post" >
			<div class="user">
				<label for='um'>账号：</label>
				<input id='um' type="username" required placeholder="--- 请输入 ---" name="name" />
			</div>
			<div class="password1">
				<label for="pw">密码：</label>
				<input id="pw" type="password" required placeholder="--- 请输入 ---" name="password" />
			</div>
			<div class="denglu">
				<button type="submit" id="submitBtn" >登陆</button>
			</div>
			<div id="CheckMsg" class="msg"></div>
			<div class="jzmm">
				<input type="checkbox"id="jizhumima" /><span>记住密码</span>
			</div>
			<div class="dengluyuzhuce">
				<a href="zhuce.html">注册</a>
				<span> | </span>
				<a href="#">忘记密码</a>
			</div>
		</form>	
	</body>

<script type="text/javascript" src="h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="easyui/jquery.min.js"></script> 
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="h-ui/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript">
	$(function(){
		
		//登录操作
		$("#submitBtn").click(function(){
			var data = $("#form").serialize();
			$.ajax({
				type: "post",
				//验证登录
				url: "LoginServlet?method=login",
				data: data, 
				dataType: "text", //设置返回的数据类型
				success: function(msg){
					if("loginError" == msg){
						$.messager.alert("消息提醒", "用户名或密码错误 !", "warning");
					} else if("loginSuccess" == msg){
						//进入系统主页面
						/* window.location.href = "SystemServlet?method=toMainView"; */
					}
					else{
						alert(msg);
					}
				}
				
			});
		});
		
	})
</script> 
</html>


