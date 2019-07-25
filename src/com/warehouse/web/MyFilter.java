package com.warehouse.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 书写一个过滤器，来处理所有的post提交的中文乱码问题
 *TODO
 * @author yxc
 *2019年7月24日下午3:45:23
 */
public class MyFilter implements Filter{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		//首先将参数转化为http形式
		HttpServletRequest request=(HttpServletRequest)arg0;
		HttpServletResponse response=(HttpServletResponse)arg1;
		
		//开始设置编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//执行方法
		chain.doFilter(arg0, arg1);
		
		//去web.xml配置文件中配置
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	
		
	}

}
