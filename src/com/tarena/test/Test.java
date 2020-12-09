package com.tarena.test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.tarena.dao.impl.AddressDaoImpl;
import com.tarena.dao.impl.BookDaoImpl;
import com.tarena.dao.impl.CartDetatilDaoImpl;
import com.tarena.dao.impl.CollectionDaoImpl;
import com.tarena.dao.impl.UserDaoImpl;
import com.tarena.entity.Address;
import com.tarena.entity.Book;
import com.tarena.entity.Car;
import com.tarena.entity.CartDetail;
import com.tarena.entity.OrderMess;
import com.tarena.entity.PageBean;
import com.tarena.entity.User;
import com.tarena.service.impl.OrderMessServiceImpl;
import com.tarena.util.DBUtil;

public class Test {

	public static void main(String[] args) {
		OrderMessServiceImpl o = new OrderMessServiceImpl();
		List<OrderMess> list = o.queryOrderMess("901201907101702");
		System.out.println(list.get(0).getOrder_id());
//		AddressDaoImpl dao = new AddressDaoImpl();
//		List<Address> list = dao.queryByUserId("12345678901");
//		System.out.println(list);
		
//		BookDaoImpl dao = new BookDaoImpl();
//		PageBean<Book> bean = dao.queryPage(2, 3);
//		System.out.println(bean.getTotalPage());
//		System.out.println(bean.getListBean());
//		PageBean<Book> bean = dao.searchQuery(1, 1, "java");
//		System.out.println(bean.getTotalPage());
//		System.out.println(bean.getListBean());
//		Car c = new Car();
//		c.setUser_id("18385056630");
//		c.setPruduct("9787111213826");
//		c.setCount(2);;
//		int num = dao.saveCar(c);
//		System.out.println(num);
//		CollectionDaoImpl dao = new CollectionDaoImpl();
//		List<Book> list = dao.queryCollect("12345678901");
//		System.out.println(list.size());
//		CartDetatilDaoImpl dao = new CartDetatilDaoImpl();
//		List<CartDetail> list = dao.queryAllByUser("18385056630");
//		System.out.println(list);
//		System.out.println(list.size());
		
	}

}
