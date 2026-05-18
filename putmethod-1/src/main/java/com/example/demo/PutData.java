package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PutData {
	@PutMapping("/insert")
	public Hello InsertDataBas(@RequestBody Hello h) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/W3schools", "root", "root");
		 
		String query="update  products SET ProductName=?, Price =?  where ProductId=101";
		PreparedStatement st= connection.prepareStatement(query);
	
		 //  st.setInt(1,h.getProductid());
		    st.setString(1,h.getProductname());
		    st.setLong(2,h.getPrice());
		    
		    int update=st.executeUpdate();
		    
		    st.close();
		    connection.close();
		return h;
	}

}
