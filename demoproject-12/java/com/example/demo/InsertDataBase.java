package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InsertDataBase {
	@GetMapping("/insert")
	public int InsertDataBas() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/W3schools", "root", "root");
		 
		String query="Insert into customers(CustomerName , ContactName) VALUES ('Aman' ,'Bhanu');";
		Statement st= connection.createStatement();
		int update=st.executeUpdate(query);
		
		return update;
	}

}
