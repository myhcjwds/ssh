package com.shuai.service.impl;

import java.util.List;

import com.shuai.domain.Car;
import com.shuai.service.CarService;
import com.shuai.dao.CarDao;
public class CarServiceImpl implements CarService {

	private CarDao carDao;
	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}


	@Override
	public List<Car> list() {
		return carDao.list();
	}

}
