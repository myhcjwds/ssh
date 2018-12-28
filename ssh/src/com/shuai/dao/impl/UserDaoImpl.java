package com.shuai.dao.impl;
import java.util.List;



import org.springframework.orm.hibernate5.support.HibernateDaoSupport;


import com.shuai.dao.UserDao;
import com.shuai.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public List<User> login(User user) {
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User u where u.user_num = ? and u.user_psw = ?", user.getUser_num(),user.getUser_psw());
		return list;
	}
}
