package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertData {

	@PostMapping("/checkdata")
	public Hello InsertData(@RequestBody Hello h) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/W3schools", "root", "root");
		
		String query="insert into customers(City, Country) values(?,?)";
		
		PreparedStatement ps=connection.prepareStatement(query);
		
		ps.setString(1,h. getCity());
		ps.setString(2,h. getCountry());
		
		int update=ps.executeUpdate();
		return h;
		
		

	}

}
