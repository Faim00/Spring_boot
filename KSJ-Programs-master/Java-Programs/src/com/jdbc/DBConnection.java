package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	 public static Connection getConnection() 
	 {
		 Connection con=null;
		 try {
		  con = DriverManager.getConnection("jdbc:mysql:///jdbc", "root", "root");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return con;
	 }// connection Method
}
