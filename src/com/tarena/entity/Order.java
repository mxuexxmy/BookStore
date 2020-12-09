package com.tarena.entity;

import java.util.Date;

public class Order {
	private int rid;// '记录编号',
	private String  user_id; //'用户编号（用户手机号）',
	private String  order_id; //'订单编号（手机号后3位+yyyyMMddHHmm）',
	private String  sta;// '订单状态（待处理；处理中；已发货；已交付）',
	private int  address_id;//'收货地址',
	private double  payment;//'支付金额',
	private Date  placed; // '下单时间',
	private Date  receipt;//'接单时间',
	private Date  deliver;//'发货时间',
	private Date  handover;//'交付时间',
	
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
