<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎登录</title>
<link rel="stylesheet" type="text/css"
	href="/erp-web/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="/erp-web/easyui/themes/icon.css">
<script type="text/javascript" src="/erp-web/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="/erp-web/easyui/jquery.easyui.min.js"></script>
</head>
<body>
	<div id="cc" class="easyui-layout" style="width: 100%; height: 600px;">
		<div data-options="region:'center',title:'用户登录 '"
			style="padding: 5px; background: #eee;">
			<div id="win" class="easyui-window" title="Login"
				style="width: 300px; height: 180px;">
				<form style="padding: 10px 20px 10px 40px;">
					<p>
						用户名: <input type="text">
					</p>
					<p>
						密&nbsp;&nbsp;&nbsp;码: <input type="password">
					</p>
					<div style="padding: 5px; text-align: center;">
						<a href="/erp-web/static/index.html" class="easyui-linkbutton" icon="icon-ok">登录</a> 
						<a href="#" class="easyui-linkbutton" icon="icon-cancel">取消</a>
					</div>
				</form>
			</div>


		</div>


	</div>
	<!-- 自定义js脚本 -->
	<script type="text/javascript">
		$(function() {
			//$.messager.alert("上课呢","");
			//$('#cc').layout();
		})
	</script>
</body>
</html>