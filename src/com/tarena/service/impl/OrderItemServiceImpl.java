package com.tarena.service.impl;

import com.tarena.dao.impl.OrderItemDaoimpl;
import com.tarena.entity.OrderItem;
import com.tarena.service.OrderItemService;

public class OrderItemServiceImpl implements OrderItemService {
	private OrderItemDaoimpl dao;
	
	public OrderItemServiceImpl() {
		dao = new OrderItemDaoimpl();
	}
	
	@Override
	public boolean saveOrderItem(OrderItem order) {
		if(order!=null){
			int num = dao.saveOrderItem(order);
			if(num>0){
				return true;
			}
		}
		return false;
	}

}
