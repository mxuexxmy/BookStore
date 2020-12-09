package com.tarena.dao;

import java.util.List;

import com.tarena.entity.Address;

public interface AddressDao {
	List<Address> queryByUserId(String user_id);
}
