package com.warehouse.web;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseServlet
 */

public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 接收参数
		String action = request.getParameter("action");
		try {
			//获取当前对象的字节
			Class clazz = this.getClass();
			Method method = clazz.getMethod(action, HttpServletRequest.class,HttpServletResponse.class);
			//判断有没有传入的方法
			if(method != null) {
				//如果有就调用
				String desPath =  (String)method.invoke(this, request,response);
				//转发
				if(desPath != null) {
					request.getRequestDispatcher(desPath).forward(request, response);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
 
}
