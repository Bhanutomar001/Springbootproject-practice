package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Student;

public class Main {
  
	public static void main(String[] args) {
	
		String confile = "com/spring/resources/applicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(confile);

		Student std = context.getBean("stdId", Student.class);
		std.display();
	}
}