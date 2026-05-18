package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertData {
	
	   

		public static int common() throws ClassNotFoundException, SQLException {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/W3schools", "root", "root");
			Statement st= connection.createStatement();
			 int update=st.executeUpdate(query);
			 return update;
	    }
	
	        @PostMapping("/inserdata")
	        public void insertData()  {
		      	
				String query="insert into categories(CategoryName,Description) VALUES('Indian dishes','Samosas and Vada Pav');";
	              common();		 
				
			}
	
	@PostMapping("/insertemployeesdata")
	public void employeesData()  {
		
		
		String query ="insert into employees (LastName, FirstName) values ('chouhan', 'Ram');";
		 common();
			
	}
	      
	      @PostMapping("/inserdatacustomers") 
	      public void customersData() throws SQLException, ClassNotFoundException {
	    	 
	    	String query="Insert Into customers(CustomerName ,Address) VALUES('Pratibha chouhan', 'Indore');";
	    	 common();
		
	      }
	      
	      @PostMapping("/insertshippersids") 
	      public void shippersDetailsData()  {
	    
	    	String query="Insert into shippers(ShipperName , ShipperID) VALUES('Kevin',39);";
	    	 try {
				common();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	
	}



