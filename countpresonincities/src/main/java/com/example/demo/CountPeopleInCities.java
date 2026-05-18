package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountPeopleInCities {
	@GetMapping("/count/{city}")
    public ResultSet counting(@PathVariable String city) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/W3schools", "root", "root");
		System.out.println("connection establish");
	     
		String query ="select*From customers  WHERE City=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, city);
		
		    ResultSet update = ps.executeQuery();
		    
			return update;
			
 }
}
