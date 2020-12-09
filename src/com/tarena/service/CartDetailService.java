package com.tarena.service;

import java.util.List;

import com.tarena.entity.CartDetail;

public interface CartDetailService {
	List<CartDetail> queryAll(String user_id);
	boolean delete(String user_id,String product);
}
