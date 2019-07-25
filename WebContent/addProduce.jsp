<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
   private String putin_id;//入库单号：
	private String product_id;//产品ID:
	private String product_name;//产品名称:
	private int putin_num;//入库数量
	private String product_unit;//产品单位:
	private Date putin_time;//入库时间:
	private String putin_person;//入库人员：
	private String remarks;//备注:remarks 
 -->
 <h1>商品入库</h1>
    <form action="InWarehouseServlet?action=AddProduce" method="post">
    	入库单号：<input type="text"  name="putin_id"><br><br>
    	产品ID：<input type="text"  name="product_id"><br><br>
    	产品名称：<input type="text"  name="product_name"><br><br>
    	入库数量：<input type="text"  name="putin_num"><br><br>
    	产品单位：<input type="text"  name="product_unit"><br><br>
    	入库时间：<input type="text"  name="putin_time"><br><br>
    	入库人员：<input type="text"  name="putin_person"><br><br>
    	备注：<input type="text"  name="remarks"><br><br>
    	<input type="submit" value="入库">
    </form>
</body>
</html>