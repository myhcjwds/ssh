package com.shuai.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import com.shuai.service.CarService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.shuai.domain.Car;

public class CarAction  extends ActionSupport {
	private static final long serialVersionUID = 113695314694166436L;
	
	private List<Car> list = new ArrayList<Car>();
	
	public List<Car> getList() {
		return list;
	}

	private CarService carService;
	
	public void setCarService(CarService carService) {
		this.carService = carService;
	}

	public String list() {
		//ValueStack vs = ActionContext.getContext().getValueStack();
		list = carService.list();
		/**
		 * 存入值栈的三种方法
		 * 1.调用值栈对象的set方法(通常 存 集合对象 时使用)
		 * 2.调用值栈对象的push方法(通常 存 单个对象 使用)
		 * 3.在action中生成变量(提供get方法)
		 */
		return "carlist";
	}

}
