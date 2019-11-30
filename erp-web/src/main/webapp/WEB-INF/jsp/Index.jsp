<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
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
		<div data-options="region:'north',title:'North Title',split:true"
			style="height: 100px;"></div>
		<div data-options="region:'south',title:'South Title',split:true"
			style="height: 100px;"></div>
		<div data-options="region:'west',title:'系统菜单',split:true"
			style="width: 300px;">
			<div id="aa" class="easyui-accordion" style="width: 300px;">
				<div title="基础管理" data-options="iconCls:'icon-save'"
					style="overflow: auto; padding: 10px;">
					<h3 style="color: #0099FF;">Accordion for jQuery</h3>
					<p></p>
				</div>
				<div title="人事管理" data-options="iconCls:'icon-reload',selected:true"
					style="padding: 10px;">
					<ul>
						<li><a id="dept_btn" href="#" class="easyui-linkbutton">部门管理</a></li>
						<li><a id="emp_btn" href="#" class="easyui-linkbutton">员工管理</a></li>
					</ul>
					<div title="销售管理"></div>
				</div>
				<div title="库存管理">content3</div>
				<div title="统计分析">content3</div>
				<div title="权限管理">content3</div>
			</div>

		</div>
		<div data-options="region:'center',"
			style="padding: 5px; background: #eee;">
			<div id="tt" class="easyui-tabs" fit="true">
				<div title="欢迎使用" style="padding: 20px; display: none;">
					<table id="tb_dept"></table>
				</div>
			</div>
		</div>
	</div>
	<!-- 自定义js脚本 -->
	<script type="text/javascript">
		$(function() {

		})
		/**
		 * @element表示目标Tabs容器，title:要添加的面板名称：id:动态创建的表的id,fun表示调用datagrid的函数
		 */
		function addTab(ele_tabs, title, ele_table) {
			//判断elements中是否已经存在title的面板
			if ($(ele_tabs).tabs('exists', title)) {
				//选中当前面板
				$(ele_tabs).tabs('select', title);
			} else {
				//var content='<table id='+id+'></table>';
				$(ele_tabs).tabs('add', {
					title : title,
					//	content:content,
					closable : true
				});
			}

			//获取当前面板
			var currentTabPanel = $(ele_tabs).tabs('getSelected');

			currentTabPanel.html(ele_table);
			getDepts(ele_table);
		}
		//为部门管理添加单击事件
		$("#dept_btn").click(function() {
			var ele_table = $('<table id="tb_dept"></table>')
			addTab('#tt', '部门管理', ele_table);

		})

		//为部门管理添加单击事件
		$("#emp_btn").click(function() {
			var ele_table = $('<table id="tb_emp"></table>')
			addTab('#tt', '员工管理', ele_table);

		})

		//获取部门列表并添加到表格中
		function getDepts(element) {
			element.datagrid({
				url : '/erp-web/dept/list',
				method : 'GET',
				columns : [ [ {
					field : 'ck',
					checkbox : 'true'
				}, {
					field : 'deptId',
					title : '部门编号',
					width : 100
				}, {
					field : 'deptName',
					title : '部门编号',
					width : 100
				}, {
					field : 'managerId',
					title : '部门编号',
					width : 100
				}, {
					field : 'managerId',
					title : '部门编号',
					width : 100,
					fomatter : function(value, row, indx) {
						return value + 'jsafasjdlfjasldfasj';
					}
				}

				] ]
			})
		}
	</script>

</body>
</html>