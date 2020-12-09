package com.tarena.servlet.user;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.entity.Address;
import com.tarena.entity.Order;
import com.tarena.entity.OrderItem;
import com.tarena.entity.OrderMess;
import com.tarena.entity.User;
import com.tarena.service.impl.AddressServiceImpl;
import com.tarena.service.impl.OrderItemServiceImpl;
import com.tarena.service.impl.OrderMessServiceImpl;
import com.tarena.service.impl.OrderServiceImpl;

public class BuyNowServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		String product = req.getParameter("product");
		double price = Double.parseDouble(req.getParameter("price"));
		int count  = Integer.parseInt(req.getParameter("count"));
		
		User user = (User)req.getSession().getAttribute("user");
		Date d = new Date();
		String order_id = d.getTime()+"";
		Order o = new Order();
		o.setUser_id(user.getPhone());
		o.setOrder_id(order_id);
		o.setSta("´ý´¦Àí");
		
		OrderServiceImpl oService = new OrderServiceImpl();
		boolean b1 = oService.saveOrder(o);
		
		
		OrderItem order = new OrderItem();
		order.setProduct(product);
		order.setPrice(price);
		order.setCount(count);
		order.setOrder_id(order_id);
		
		OrderItemServiceImpl orderService = new OrderItemServiceImpl();
		boolean b2 = orderService.saveOrderItem(order);
		if(b2){
			AddressServiceImpl addService = new AddressServiceImpl();
			List<Address> list = addService.queryAllByUser(user.getPhone());
			req.setAttribute("list", list);
			OrderMessServiceImpl omService = new OrderMessServiceImpl();
			List<OrderMess> list2 = omService.queryOrderMess(order_id);
			req.setAttribute("omlist", list2);
			req.getRequestDispatcher("order-confirm.jsp").forward(req, resp);
		}
	}
}
