package com.warehouse.domain;



public class InWarehouse {
	private String putin_id;//��ⵥ�ţ�
	private String product_id;//��ƷID:
	private String product_name;//��Ʒ����:
	private int putin_num;//�������
	private String product_unit;//��Ʒ��λ:
	private String putin_time;//���ʱ��:
	private String putin_person;//�����Ա��
	private String remarks;//��ע:remarks 
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
