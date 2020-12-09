package com.tarena.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tarena.entity.CartDetail;
import com.tarena.entity.User;
import com.tarena.service.impl.CartDetatilServiceImpl;

public class CartDetailQueryServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("user");
		CartDetatilServiceImpl service = new CartDetatilServiceImpl();
		List<CartDetail> list = service.queryAll(user.getPhone());
		if(list!=null){
			req.setAttribute("list", list);
			req.getRequestDispatcher("cart.jsp").forward(req, resp);
		}
	}
}
