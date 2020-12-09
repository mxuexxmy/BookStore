package com.tarena.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.entity.Collection;
import com.tarena.service.impl.CollectionServiceImpl;

public class SaveOrDeleteCollectServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		String user_id = req.getParameter("user_id");
		String product = req.getParameter("product");
		CollectionServiceImpl service = new CollectionServiceImpl();
		Collection c = service.query(user_id, product);
		if(c!=null){
			boolean b = service.delete(user_id, product);
			if(b){
				resp.getWriter().write("ȡ���ղ�");
			}else{
				resp.getWriter().write("����ʧ��");
			}
		}else{
			boolean b = service.save(user_id, product);
			if(b){
				resp.getWriter().write("�ղسɹ�");
			}else{
				resp.getWriter().write("����ʧ��");
			}
		}
		
	}
}
