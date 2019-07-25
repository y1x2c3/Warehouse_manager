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
		//��ѯ��������������е�����
		InwarehouseService inwarehouseService = new InwarehouseService();
		try {
			//����ҵ�񷽷�
			List<InWarehouse> all = inwarehouseService.getAll();
			//�����ݱ������������
			request.setAttribute("all",all);
			//��תҳ��
			return "/input.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//ɾ�����ݿ��Ʋ�
	public String  deleteProduce(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InwarehouseService inwarehouseService = new InwarehouseService();
		try {
			//���յ�����Ĳ���
			String putin_id=request.getParameter("putin_id");
			//����ҵ�񷽷�
			inwarehouseService.deleteProduce(putin_id);
			//��תҳ��
			return "InWarehouseServlet?action=getAll";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
   
	//��������
	public String  getProduce(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InwarehouseService inwarehouseService = new InwarehouseService();
		try {
			//���յ�����Ĳ���
			String putin_id=request.getParameter("putin_id");
			//����ҵ�񷽷�
			InWarehouse produce = inwarehouseService.getProduce(putin_id);
			//�����ݱ������������
			request.setAttribute("all", produce);
			//ҳ����ת
			return "/input.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//��������
		public String  AddProduce(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			InwarehouseService inwarehouseService = new InwarehouseService();
			try {
				//���յ�����Ĳ�����һ������
				Map<String, String[]> parameterMap = request.getParameterMap();
				//����ҵ�񷽷�
				InWarehouse inwarehouse=new InWarehouse();
				//�����յ��Ĳ�����װ��һ������
				BeanUtils.populate(inwarehouse, parameterMap);
				inwarehouseService.addProduce(inwarehouse);
				//�����ݱ������������
				request.setAttribute("inwarehouse",inwarehouse);
				//ҳ����ת ֱ�Ӹ�������
				return "InWarehouseServlet?action=getAll";
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	
}
