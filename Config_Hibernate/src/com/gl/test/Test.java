package com.gl.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	
	public static void main(String[] args) {
		
		String jdbc = "jdbc:mysql://localhost:3306/ebookshop";
		String user = "root";
		String pass = "A9178784058a@";
		
		try {
			System.out.println("jdbc ur]: "+jdbc);
		
		Connection myConn= DriverManager.getConnection(jdbc, user, pass);
		System.out.println("Connection Successful");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
