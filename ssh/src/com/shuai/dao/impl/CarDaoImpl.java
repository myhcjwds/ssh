package com.shuai.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.shuai.dao.CarDao;
import com.shuai.domain.Car;

public class CarDaoImpl extends HibernateDaoSupport implements CarDao {

	@Override
	public List<Car> list() {
	
		return (List<Car>) this.getHibernateTemplate().find("from Car");
	}

}
