package com.warehouse.service;

import java.sql.SQLException;

import com.warehouse.dao.AdminDao;
import com.warehouse.domain.Admin;

public class AdminService {
    //��ѯ�û���¼ҵ��
	public Admin getAdmin(String name,String password) throws SQLException {
		AdminDao adminDao = new AdminDao();
		Admin admin = adminDao.getAdmin(name, password);
		return admin;
	}
}
