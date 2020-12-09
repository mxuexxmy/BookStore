package com.tarena.service;

import java.util.List;

import com.tarena.entity.Address;

public interface AddressService {
	List<Address> queryAllByUser(String user_id);
}
