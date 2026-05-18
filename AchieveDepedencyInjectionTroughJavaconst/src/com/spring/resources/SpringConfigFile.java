package com.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.Address;
import com.spring.bean.Student;

@Configuration
public class SpringConfigFile {
    
	@Bean
	public Address createAddrObj() {
		Address addr = new Address(172, "London", 123406);
		return  addr;
	}
	
	@Bean
	public Student createStdObj() {
		Student std	 = new Student(182, "Jay", createAddrObj());
		return  std;
	}
}
