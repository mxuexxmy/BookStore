package com.tarena.entity;

import java.util.Date;

public class Address {
	private int rid; //'��¼���',
	private String  user_id; //'�û���ţ��û��ֻ��ţ�',
	private String	address;//'��ַ',
	private Date  added; // '�������/ʱ��',
	private String	 receiver;// '�ռ��ˣ�������',
    private String	 receiver_phone;//'�ռ��˵绰',
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getAdded() {
		return added;
	}
	public void setAdded(Date added) {
		this.added = added;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getReceiver_phone() {
		return receiver_phone;
	}
	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}
	@Override
	public String toString() {
		return "Address [rid=" + rid + ", user_id=" + user_id + ", address=" + address + ", added=" + added
				+ ", receiver=" + receiver + ", receiver_phone=" + receiver_phone + "]";
	}
}
