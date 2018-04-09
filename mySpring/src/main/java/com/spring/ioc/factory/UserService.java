package com.spring.ioc.factory;

import com.spring.ioc.bean.User;

public class UserService {
	private User user;

	public void setUser(User user) {
		this.user = user;
	}
	
	public void test(){
		System.out.println("service......");
		user.test();
	}
}
