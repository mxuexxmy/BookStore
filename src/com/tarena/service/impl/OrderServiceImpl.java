package com.tarena.service.impl;

import com.tarena.dao.impl.OrderDaoImpl;
import com.tarena.entity.Order;
import com.tarena.service.OrderService;

public class OrderServiceImpl implements OrderService {

	private OrderDaoImpl dao;
	
	public OrderServiceImpl() {
		dao = new OrderDaoImpl();
	}
	
	@Override
	public boolean saveOrder(Order order) {
		if(order!=null){
			int num = dao.saveOrder(order);
			if(num>0){
				return true;
			}
		}
		return false;
	}

}
