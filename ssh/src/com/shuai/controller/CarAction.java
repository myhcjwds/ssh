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
		 * ����ֵջ�����ַ���
		 * 1.����ֵջ�����set����(ͨ�� �� ���϶��� ʱʹ��)
		 * 2.����ֵջ�����push����(ͨ�� �� �������� ʹ��)
		 * 3.��action�����ɱ���(�ṩget����)
		 */
		return "carlist";
	}

}
