package com.tarena.service.impl;

import java.util.List;

import com.tarena.dao.impl.AddressDaoImpl;
import com.tarena.entity.Address;
import com.tarena.service.AddressService;

public class AddressServiceImpl implements AddressService {

	private AddressDaoImpl dao;
	public AddressServiceImpl() {
		dao = new AddressDaoImpl();
	}
	
	@Override
	public List<Address> queryAllByUser(String user_id) {
		if(null!=user_id&&!"".equals(user_id)){
			List<Address> list = dao.queryByUserId(user_id);
			return list;
		}
		return null;
	}

}
