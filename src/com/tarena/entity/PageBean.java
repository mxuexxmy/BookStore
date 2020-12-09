package com.tarena.entity;

import java.util.List;

public class PageBean<T> {
	private int pageSize;//ÿҳ��ʾ����Ŀ��
	private int pageCode;//��ǰҳ
	private int totalCount;//����Ŀ��
	private int totalPage;//��ҳ��
	private List<T> listBean;//��ŵ�ǰҳ������
	//������ҳ��
	public int getTotalPage(){
		totalPage = totalCount/pageSize;
		if(totalCount%pageSize!=0){
			return totalPage+1;
		}
		return totalPage;
	}
	
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCode() {
		return pageCode;
	}
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getListBean() {
		return listBean;
	}
	public void setListBean(List<T> listBean) {
		this.listBean = listBean;
	}
	
}
