package com.shuai.service.impl;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import com.shuai.dao.UserDao;
import com.shuai.domain.User;
import com.shuai.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {
	
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> login(User user) {
		return userDao.login(user);
	}
	
}
