package com.warehouse.domain;



public class InWarehouse {
	private String putin_id;//入库单号：
	private String product_id;//产品ID:
	private String product_name;//产品名称:
	private int putin_num;//入库数量
	private String product_unit;//产品单位:
	private String putin_time;//入库时间:
	private String putin_person;//入库人员：
	private String remarks;//备注:remarks 
	public String getPutin_id() {
		return putin_id;
	}
	public void setPutin_id(String putin_id) {
		this.putin_id = putin_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPutin_num() {
		return putin_num;
	}
	public void setPutin_num(int putin_num) {
		this.putin_num = putin_num;
	}
	public String getProduct_unit() {
		return product_unit;
	}
	public void setProduct_unit(String product_unit) {
		this.product_unit = product_unit;
	}
	public String getPutin_time() {
		return putin_time;
	}
	public void setPutin_time(String putin_time) {
		this.putin_time = putin_time;
	}
	public String getPutin_person() {
		return putin_person;
	}
	public void setPutin_person(String putin_person) {
		this.putin_person = putin_person;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "InWarehouse [putin_id=" + putin_id + ", roduct_id=" + product_id + ", product_name=" + product_name
				+ ", putin_num=" + putin_num + ", product_unit=" + product_unit + ", putin_time=" + putin_time
				+ ", putin_person=" + putin_person + ", remarks=" + remarks + "]";
	}
	
}
