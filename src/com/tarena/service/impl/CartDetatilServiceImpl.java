package com.tarena.service.impl;

import java.util.List;

import com.tarena.dao.impl.CartDetatilDaoImpl;
import com.tarena.entity.CartDetail;
import com.tarena.service.CartDetailService;

public class CartDetatilServiceImpl implements CartDetailService {

	private CartDetatilDaoImpl dao = null;
	
	public CartDetatilServiceImpl() {
		dao = new CartDetatilDaoImpl();
	}
	
	@Override
	public List<CartDetail> queryAll(String user_id) {
		if(null!=user_id&&!"".equals(user_id)){
			List<CartDetail> list = dao.queryAllByUser(user_id);
			return list;
		}
		return null;
	}

	@Override
	public boolean delete(String user_id, String product) {
		if(null!=user_id&&null!=product&&
				!"".equals(user_id)&&!"".equals(product)){
			int num = dao.deleteCartDetail(user_id, product);
			if(num>0){
				return true;
			}
		}
		return false;
	}

}
