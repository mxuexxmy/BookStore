package com.tarena.servlet.user;

import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.service.impl.OrderMessServiceImpl;

public class UpdateOrderServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		String address_id = req.getParameter("address_id");
		String order_id = req.getParameter("order_id");
		double payment = Double.parseDouble(req.getParameter("money"));
		Date date = new Date(System.currentTimeMillis());
		OrderMessServiceImpl mess = new OrderMessServiceImpl();
		boolean b = mess.updateOrderByOrderId(order_id, address_id, payment, date);
		if(b){
			req.setAttribute("order_id", order_id);
			req.setAttribute("payment", payment);
			req.getRequestDispatcher("pay-success.jsp").forward(req, resp);
		}
	}
}
