package com.spring.test;

import com.fp.spring.aop.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestIOC {
//	@Test
//	public void test01(){
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("conf/ApplicationContext.xml");
//		User user01 = (User) context.getBean("user");
//		System.out.println(user01);
//		user01.test();
//	}
//	@Test
//	public void test02(){
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("conf/ApplicationContext.xml");
//		UserService userService =(UserService) context.getBean("userService");
//		userService.test();
//	}
//	@Test
//	public void test03(){
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("conf/ApplicationContext.xml");
//		User user = (User) context.getBean("user1");
////		user.setName("fp");
//		user.test();
//		System.out.println("test annotention");
//	}
	@Test
	public void test04(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("conf/ApplicationContexAop.xml");
		Book book = (Book) context.getBean("book");
		book.add();
	}
}
