package com.tarena.service.impl;

import java.sql.Date;
import java.util.List;

import com.tarena.dao.impl.OrderDaoImpl;
import com.tarena.entity.OrderMess;
import com.tarena.service.OrderMessService;

public class OrderMessServiceImpl implements OrderMessService {
	private OrderDaoImpl dao;
	
	public OrderMessServiceImpl() {
		dao = new OrderDaoImpl();
	}
	
	@Override
	public List<OrderMess> queryOrderMess(String order_id) {
		if(!"".equals(order_id)&&null!=order_id){
			List<OrderMess> list = dao.queryOrderMess(order_id);
			return list;
		}
		return null;
	}

	@Override
	public boolean updateOrderByOrderId(String order_id, String address_id, double payment, Date placed) {
		if(order_id!=null&&address_id!=null&&placed!=null){
			int num = dao.updateByOrderId(order_id, address_id, payment, placed);
			if(num>0){
				return true;
			}
		}
		return false;
	}

}
