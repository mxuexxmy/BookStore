package com.tarena.entity;

import java.util.Date;

public class Order {
	private int rid;// '��¼���',
	private String  user_id; //'�û���ţ��û��ֻ��ţ�',
	private String  order_id; //'������ţ��ֻ��ź�3λ+yyyyMMddHHmm��',
	private String  sta;// '����״̬�������������У��ѷ������ѽ�����',
	private int  address_id;//'�ջ���ַ',
	private double  payment;//'֧�����',
	private Date  placed; // '�µ�ʱ��',
	private Date  receipt;//'�ӵ�ʱ��',
	private Date  deliver;//'����ʱ��',
	private Date  handover;//'����ʱ��',
	
	public Order(){}
	
	public Order(int rid, String user_id, String order_id, String sta, int address_id, double payment, Date placed,
			Date receipt, Date deliver, Date handover) {
		this.rid = rid;
		this.user_id = user_id;
		this.order_id = order_id;
		this.sta = sta;
		this.address_id = address_id;
		this.payment = payment;
		this.placed = placed;
		this.receipt = receipt;
		this.deliver = deliver;
		this.handover = handover;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getSta() {
		return sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public Date getPlaced() {
		return placed;
	}
	public void setPlaced(Date placed) {
		this.placed = placed;
	}
	public Date getReceipt() {
		return receipt;
	}
	public void setReceipt(Date receipt) {
		this.receipt = receipt;
	}
	public Date getDeliver() {
		return deliver;
	}
	public void setDeliver(Date deliver) {
		this.deliver = deliver;
	}
	public Date getHandover() {
		return handover;
	}
	public void setHandover(Date handover) {
		this.handover = handover;
	}
	@Override
	public String toString() {
		return "Order [rid=" + rid + ", user_id=" + user_id + ", order_id=" + order_id + ", sta=" + sta
				+ ", address_id=" + address_id + ", payment=" + payment + ", placed=" + placed + ", receipt=" + receipt
				+ ", deliver=" + deliver + ", handover=" + handover + "]";
	}
}
