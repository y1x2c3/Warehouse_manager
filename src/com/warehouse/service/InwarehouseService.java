package com.warehouse.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.warehouse.dao.InWarehouseDao;
import com.warehouse.domain.InWarehouse;
import com.warehouse.utils.JdbcUtil;

/**
 * ҵ������
 *TODO
 * @author yxc
 *2019��7��24������9:05:07
 */
//��ѯ���������Ϣ��ҵ������
public class InwarehouseService {
	public List<InWarehouse> getAll() throws SQLException{
		InWarehouseDao inWarehouseDao = new InWarehouseDao();
		List<InWarehouse> list = inWarehouseDao.getAll();
		return list;
	}
	
//ɾ��һ����Ʒ��ҵ��
	public int deleteProduce(String putin_id) throws SQLException {
		InWarehouseDao inWarehouseDao = new InWarehouseDao();
		int result = inWarehouseDao.deleteProduce(putin_id);
		return result;
	}
	
//����putin_id��ѯһ������	
	public InWarehouse getProduce(String putin_id) throws SQLException {
		InWarehouseDao inWarehouseDao = new InWarehouseDao();
		InWarehouse produce = inWarehouseDao.getProduce(putin_id);
		return produce;
	}
	
//���Ӳ�Ʒ
		public int addProduce(InWarehouse inwarehouse) throws SQLException {
			InWarehouseDao inWarehouseDao = new InWarehouseDao();
			int result = inWarehouseDao.addProduce(inwarehouse);
			return result;
		}
}
