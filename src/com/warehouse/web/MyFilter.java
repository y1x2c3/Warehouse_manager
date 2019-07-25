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
 * ��дһ�������������������е�post�ύ��������������
 *TODO
 * @author yxc
 *2019��7��24������3:45:23
 */
public class MyFilter implements Filter{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		//���Ƚ�����ת��Ϊhttp��ʽ
		HttpServletRequest request=(HttpServletRequest)arg0;
		HttpServletResponse response=(HttpServletResponse)arg1;
		
		//��ʼ���ñ���
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//ִ�з���
		chain.doFilter(arg0, arg1);
		
		//ȥweb.xml�����ļ�������
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	
		
	}

}
