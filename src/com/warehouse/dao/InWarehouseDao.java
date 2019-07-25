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
    //查询所有的入库管理信息表
	public List<InWarehouse> getAll() throws SQLException{
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql="select * from 入库管理模块";
		List<InWarehouse> list = qr.query(sql,new BeanListHandler<InWarehouse>(InWarehouse.class));
		return list;
	}
	
	//根据putin_id;//入库单号删除一条数据
	public int deleteProduce(String putin_id) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql="delete from 入库管理模块 where putin_id=？";
		//删除数据库信息，并返回成功与否
		int result = qr.update(sql,putin_id);
		return result;
	}
	
	//搜索功能putin_id
	public InWarehouse getProduce(String putin_id) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql="select * from 入库管理模块 where putin_id=?";
		InWarehouse produce = qr.query(sql, new BeanHandler<InWarehouse>(InWarehouse.class),putin_id);
		return produce;
	}
	
	//增加产品
	public int addProduce(InWarehouse inwarehouse) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql="insert into 入库管理模块 value(?,?,?,?,?,?,?,?)";
		int result = qr.update(sql,inwarehouse.getPutin_id(),inwarehouse.getProduct_id(),inwarehouse.getProduct_name(),inwarehouse.getPutin_num(),inwarehouse.getProduct_unit(),inwarehouse.getPutin_time(),inwarehouse.getPutin_person(),inwarehouse.getRemarks());
		return result;
	}
	
	
}
