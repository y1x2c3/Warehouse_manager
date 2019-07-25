package com.warehouse.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.warehouse.domain.InWarehouse;
import com.warehouse.service.InwarehouseService;


@WebServlet("/InWarehouseServlet")
public class InWarehouseServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	
	public String  getAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询到所有入库管理表中的数据
		InwarehouseService inwarehouseService = new InwarehouseService();
		try {
			//调用业务方法
			List<InWarehouse> all = inwarehouseService.getAll();
			//将数据保存在域对象中
			request.setAttribute("all",all);
			//跳转页面
			return "/input.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//删除数据控制层
	public String  deleteProduce(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InwarehouseService inwarehouseService = new InwarehouseService();
		try {
			//接收到传入的参数
			String putin_id=request.getParameter("putin_id");
			//调用业务方法
			inwarehouseService.deleteProduce(putin_id);
			//跳转页面
			return "InWarehouseServlet?action=getAll";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
   
	//搜索功能
	public String  getProduce(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InwarehouseService inwarehouseService = new InwarehouseService();
		try {
			//接收到传入的参数
			String putin_id=request.getParameter("putin_id");
			//调用业务方法
			InWarehouse produce = inwarehouseService.getProduce(putin_id);
			//将数据保存在域对象中
			request.setAttribute("all", produce);
			//页面跳转
			return "/input.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//新增功能
		public String  AddProduce(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			InwarehouseService inwarehouseService = new InwarehouseService();
			try {
				//接收到传入的参数的一个集合
				Map<String, String[]> parameterMap = request.getParameterMap();
				//调用业务方法
				InWarehouse inwarehouse=new InWarehouse();
				//将接收到的参数封装成一个对象
				BeanUtils.populate(inwarehouse, parameterMap);
				inwarehouseService.addProduce(inwarehouse);
				//将数据保存在域对象中
				request.setAttribute("inwarehouse",inwarehouse);
				//页面跳转 直接更新数据
				return "InWarehouseServlet?action=getAll";
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	
}
