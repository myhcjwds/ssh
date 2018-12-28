package com.shuai.controller;

import com.shuai.domain.User;
import com.shuai.service.UserService;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @author Administrator
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
	
	private static final long serialVersionUID = 113695314694166436L;
	

	private User user = new User();
	public User getModel() {
		return user;
	}
	
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	//µÇÂ½
	public String login(){
		System.out.print(user.getUser_num());
		
		System.out.print(user.getUser_psw());
		List<User> list = userService.login(user);
		
		System.out.print(list.size());
		if(list.size() > 0) {
			
			 ServletActionContext.getRequest().getSession().setAttribute("user",list.get(0));

			return "overlogin";
		}
		else {
			return "tologin";
		}
	}
	
}












