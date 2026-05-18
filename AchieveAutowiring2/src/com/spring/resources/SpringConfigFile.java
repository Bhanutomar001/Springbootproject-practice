package com.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.Address;
import com.spring.bean.Student;

@Configuration
public class SpringConfigFile {
    
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseno(260);
		addr.setCity("Jaipur");
		addr.setPincode(875687);
		return  addr;
	}
	
	@Bean
	public Student createStdObj() {
		Student std	 = new Student();
		std.setRollno(635);
		std.setName("Amisha");
		//std.setAddress(createAddrObj());
		return  std;
	}
}
