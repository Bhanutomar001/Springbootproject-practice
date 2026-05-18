package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Student;
import com.spring.resources.SpringConfigFile;

public class Main {
  
	public static void main(String[] args) {
	
		
		
		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = (Student) context.getBean(Student.class);
		std.display();
	}
}