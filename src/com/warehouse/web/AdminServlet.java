package com.warehouse.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.warehouse.domain.Admin;
import com.warehouse.service.AdminService;

@WebServlet("/AdminServlet")
public class AdminServlet extends BaseServlet{
	private static final long serialVersionUID = 1L;

	public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取表单传进来的参数
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		//调用业务层查看是不是有该用户
		AdminService adminService = new AdminService();
		try {
			Admin admin = adminService.getAdmin(name, password);
			//将用户名保存在域对象中
			request.getSession().setAttribute("name", name);
			if(admin!=null) {
				return "InWarehouseServlet?action=getAll";
			}else {
				return "/login.jsp";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
