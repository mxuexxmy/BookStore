package com.tarena.entity;

public class Car {
	private int rid;//���ﳵ���
	private String user_id;//�û��ֻ���
	private String pruduct;//��Ʒ���
	private int count;//����
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
	public String getPruduct() {
		return pruduct;
	}
	public void setPruduct(String pruduct) {
		this.pruduct = pruduct;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Car [rid=" + rid + ", user_id=" + user_id + ", pruduct=" + pruduct + ", count=" + count + "]";
	}
}
