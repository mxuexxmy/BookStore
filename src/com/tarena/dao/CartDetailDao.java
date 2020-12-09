package com.tarena.dao;

import java.util.List;

import com.tarena.entity.CartDetail;

public interface CartDetailDao {
	List<CartDetail> queryAllByUser(String user_id);
	int deleteCartDetail(String user_id,String product);
}
