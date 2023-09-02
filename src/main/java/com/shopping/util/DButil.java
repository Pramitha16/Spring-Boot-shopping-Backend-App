package com.shopping.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

	private static Connection connection = null;
	
	public  Connection getConnnection() throws SQLException {
		if (connection !=null) {
		return connection;
	}
		else {
			String username="root";
			String password="123456789";
			String Url = "jdbc:mysql://localhost:3306/shopping";
			String Driver = "com.mysql.jdbc.Driver ";
			
			try {
				Class.forName(Driver);
				DriverManager.getConnection(Url, username, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return connection;
	}
}
