package com.tarena.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tarena.entity.User;
import com.tarena.service.impl.CartDetatilServiceImpl;

public class CartDetailDeleteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("user");
		String product = req.getParameter("product");
		CartDetatilServiceImpl service = new CartDetatilServiceImpl();
		boolean b = service.delete(user.getPhone(), product);
		if(b){
			resp.sendRedirect("queryall.do");
		}
	}
}
