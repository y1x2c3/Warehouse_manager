<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="css/rukuguanli.css" />
		<!--<link rel="stylesheet" href="css/component.css" />-->
	</head>

	<body>
		<div class="dingbu">
			<img src="img/cambridge.png" />
			<a href="" class="rw" data-toggle: "dropdown" aria-expanded="false">
				<img src="img/ru（1）.png">
				<!--<img src="img/ru.png">
				<div class="xiaoyuan1"></div>-->
			</a>
			<a href="" class="tx" data-toggle: "dropdown" aria-expanded="false">
				<img src="img/tx(1).png" />
				<!--<img src="img/tx.png">
				<div class="xiaoyuan2"></div>-->
			</a>
			<a href="" class="xx" data-toggle: "dropdown" aria-expanded="false">
				<img src="img/xx(1).png" />
			</a>
			<a href="" class="yonhu" data-toggle: "dropdown" aria-expanded="false">
				<img src="img/yonhu.png" />
				<p1>${name}</p1>
				<p2>管理员</p2>
			</a>
		</div>
		<div class="zuobian"></div>
			<div class="ruku">
				<a href="#">
					<div class="beijin">
						<span>入库管理</span><span>></span><span>></span><span>></span>
					</div>
				</a>
				<p>仓库信息</p>
				<!--<div class="biaoge">-->
					<table class="te">
						<thead class="td">
							<tr>
								<th>序号</th>
								<th>入库单号</th>
								<th>产品型号</th>
								<th>产品名称</th>
								<th>产品实时库存</th>
								<th>产品单元</th>
								<th>备注</th>
							</tr>
						</thead>
						<tbody class="ty">
						<c:forEach  items="${all }"  var="all"  varStatus="status">
							<tr>
							<td>${status.index+1 }</td>
							<td>${all.putin_id }</td>
							<td>${all.product_id }</td>
							<td>${all.product_name }</td>
							<td>${all.putin_num }</td>
							<td>${all.product_unit }</td>
							<td>${all.remarks }</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				<!--</div>-->
				<div class='top_sarch'>
					<input type="text" placeholder="请输入查找的信息" />
					<button><img src="img/fdj.png" alt="搜索"></button>
				</div>
				<div class='btn'>
					<button >打印数据</button>
					<button>刷新数据</button>
					<button>商品入库</button>
					<button>删除商品</button> 
				</div>
			</div>
			<div class="chuku">
				<a href="output.jsp">
					<div class="beijin1">
						<span>出库管理</span><span>></span><span>></span><span>></span>
					</div>
				</a>
			</div>
	</body>
</html>