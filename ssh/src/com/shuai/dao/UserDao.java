package com.shuai.dao;

import java.util.List;

import com.shuai.domain.User;

public interface UserDao {

	public List<User> login(User user);

}
