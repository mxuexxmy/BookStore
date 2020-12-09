package com.tarena.dao;

import com.tarena.entity.User;

public interface UserDao {
	User login(String uname,String upwd,int role);
	User queryName(String name);
	User queryPhone(String phone);
	int insertUser(User user);
}
