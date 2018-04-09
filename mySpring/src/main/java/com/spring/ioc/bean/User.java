package com.spring.ioc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "user1")
public class User {
	@Value("fanp")
	private String name;

	
/*	public void setName(String name) {
		this.name = name;
	}*/

	/*public User(String name) {
		this.name = name;
	}
	*/
	public void test(){
		System.out.println("test:"+name);
	}
}
