package com.tarena.dao;

import java.sql.Date;
import java.util.List;

import com.tarena.entity.Order;
import com.tarena.entity.OrderMess;

public interface OrderDao {
	int saveOrder(Order order);
	List<OrderMess> queryOrderMess(String order_id);
	int updateByOrderId(String order_id,String address_id,double payment,Date placed);
}
