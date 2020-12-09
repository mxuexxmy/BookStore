package com.tarena.service;

import java.sql.Date;
import java.util.List;

import com.tarena.entity.OrderMess;

public interface OrderMessService {
	List<OrderMess> queryOrderMess(String order_id);
	boolean updateOrderByOrderId(String order_id,String address_id,double payment,Date placed);
}
