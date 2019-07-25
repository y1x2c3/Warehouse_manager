package com.yxc.test;

import java.sql.SQLException;
import java.util.List;

import com.warehouse.dao.AdminDao;
import com.warehouse.dao.InWarehouseDao;
import com.warehouse.domain.Admin;
import com.warehouse.domain.InWarehouse;
import com.warehouse.service.InwarehouseService;

public class MainTest {
public static void main(String[] args) throws SQLException {
	InwarehouseService inwarehouseService = new InwarehouseService();
	InWarehouse produce = inwarehouseService.getProduce("jq2019428102212");
	System.out.println(produce);
}
}
