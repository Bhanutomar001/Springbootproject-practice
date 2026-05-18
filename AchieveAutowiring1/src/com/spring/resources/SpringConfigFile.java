package com.spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.Address;
import com.spring.bean.Student;
import com.spring.bean.Subjects;

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
		//std.setAddress(createAddrObj());     manually DI 
		return  std;
	}
	
	@Bean
	public Subjects createSubObj() {
		
		Subjects sub= new Subjects();
		
		 List<String> al = new ArrayList();
		 al.add("java");
		 al.add("Python");
		 al.add("c++");
		 al.add("Mern");
		sub.setSubjects(al);
		return sub;
		
	}
}
