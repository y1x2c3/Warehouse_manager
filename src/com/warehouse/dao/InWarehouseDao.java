package com.warehouse.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.warehouse.domain.Admin;
import com.warehouse.domain.InWarehouse;
import com.warehouse.utils.JdbcUtil;


public class InWarehouseDao {
    //��ѯ���е���������Ϣ��
	public List<InWarehouse> getAll() throws SQLException{
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql="select * from ������ģ��";
		List<InWarehouse> list = qr.query(sql,new BeanListHandler<InWarehouse>(InWarehouse.class));
		return list;
	}
	
	//����putin_id;//��ⵥ��ɾ��һ������
	public int deleteProduce(String putin_id) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql="delete from ������ģ�� where putin_id=��";
		//ɾ�����ݿ���Ϣ�������سɹ����
		int result = qr.update(sql,putin_id);
		return result;
	}
	
	//��������putin_id
	public InWarehouse getProduce(String putin_id) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql="select * from ������ģ�� where putin_id=?";
		InWarehouse produce = qr.query(sql, new BeanHandler<InWarehouse>(InWarehouse.class),putin_id);
		return produce;
	}
	
	//���Ӳ�Ʒ
	public int addProduce(InWarehouse inwarehouse) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql="insert into ������ģ�� value(?,?,?,?,?,?,?,?)";
		int result = qr.update(sql,inwarehouse.getPutin_id(),inwarehouse.getProduct_id(),inwarehouse.getProduct_name(),inwarehouse.getPutin_num(),inwarehouse.getProduct_unit(),inwarehouse.getPutin_time(),inwarehouse.getPutin_person(),inwarehouse.getRemarks());
		return result;
	}
	
	
}
