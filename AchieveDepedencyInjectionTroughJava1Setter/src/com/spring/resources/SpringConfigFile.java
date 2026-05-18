package com.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.Address;
import com.spring.bean.Student;

@Configuration
public class SpringConfigFile {
    
	@Bean
	public Address createAddrObj() {
		Address addr = new Address(350, "Bhanu", 873476);
		
		return  addr;
	}
	
	@Bean
	public Student createStdObj() {
		Student std	 = new Student(120, "Jaipur", createAddrObj());
		
		return  std;
	}
}
