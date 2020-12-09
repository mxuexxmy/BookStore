package com.tarena.service;

import com.tarena.entity.User;

public interface UserService {
	User queryLgin(String name,String pwd,int role);
	boolean CheckName(String name);
	boolean CheckPhone(String phone);
	boolean saveUser(User user);
}
