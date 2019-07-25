package com.warehouse.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.warehouse.domain.Admin;
import com.warehouse.utils.JdbcUtil;

public class AdminDao {
   //根据用户名和密码查询是否有用户，有登录成功
   public Admin getAdmin(String name,String password) throws SQLException {
	   QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	   String sql="select * from admin where name=? and password=?";
	   Admin admin = qr.query(sql, new BeanHandler<Admin>(Admin.class),name,password);
	   return admin;
   }
}
