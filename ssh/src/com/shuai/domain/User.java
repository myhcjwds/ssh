package com.shuai.domain;

import java.util.HashSet;
import java.util.Set;

public class User {

	private Long user_id; //Ö÷¼üID
	
	private String user_num; //µÇÂ½ÕËºÅ
	private String user_psw; //µÇÂ½ÃÜÂë
	
	private String user_name; //ĞÕÃû
	
	private String user_sex; //ĞÔ±ğ
	
	private Long user_age; //ÄêÁä

	private Set<Car> cars = new HashSet<Car>();
	
	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}



	
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_sex=" + user_sex + ", user_age="
				+ user_age + "]";
	}



	public Long getUser_id() {
		return user_id;
	}



	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}



	public String getUser_num() {
		return user_num;
	}



	public void setUser_num(String user_num) {
		this.user_num = user_num;
	}



	public String getUser_psw() {
		return user_psw;
	}



	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}



	public String getUser_name() {
		return user_name;
	}



	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}



	public String getUser_sex() {
		return user_sex;
	}



	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}



	public Long getUser_age() {
		return user_age;
	}



	public void setUser_age(Long user_age) {
		this.user_age = user_age;
	}

}
