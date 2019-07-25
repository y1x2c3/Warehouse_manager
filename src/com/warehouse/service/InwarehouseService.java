package com.warehouse.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.warehouse.dao.InWarehouseDao;
import com.warehouse.domain.InWarehouse;
import com.warehouse.utils.JdbcUtil;

/**
 * 业务层代码
 *TODO
 * @author yxc
 *2019年7月24日下午9:05:07
 */
//查询所有入库信息的业务层代码
public class InwarehouseService {
	public List<InWarehouse> getAll() throws SQLException{
		InWarehouseDao inWarehouseDao = new InWarehouseDao();
		List<InWarehouse> list = inWarehouseDao.getAll();
		return list;
	}
	
//删除一条商品的业务
	public int deleteProduce(String putin_id) throws SQLException {
		InWarehouseDao inWarehouseDao = new InWarehouseDao();
		int result = inWarehouseDao.deleteProduce(putin_id);
		return result;
	}
	
//根据putin_id查询一条数据	
	public InWarehouse getProduce(String putin_id) throws SQLException {
		InWarehouseDao inWarehouseDao = new InWarehouseDao();
		InWarehouse produce = inWarehouseDao.getProduce(putin_id);
		return produce;
	}
	
//增加产品
		public int addProduce(InWarehouse inwarehouse) throws SQLException {
			InWarehouseDao inWarehouseDao = new InWarehouseDao();
			int result = inWarehouseDao.addProduce(inwarehouse);
			return result;
		}
}
