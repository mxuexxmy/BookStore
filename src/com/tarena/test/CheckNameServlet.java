package com.tarena.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckNameServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req,
			HttpServletResponse resp) 
					throws ServletException, IOException {
		String name = req.getParameter("name");
		if("admin".equals(name)){
			resp.getWriter().write("This Name had");
		}else{
			resp.getWriter().write("This Name is OK");
		}
	}
}
