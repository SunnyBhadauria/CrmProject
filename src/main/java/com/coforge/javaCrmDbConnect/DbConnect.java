package com.coforge.javaCrmDbConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

static	Connection con=null;
static	String url="jdbc:mysql://localhost:3306/CRM";
static	String username="root";
static	String password="sunny@1997";
	
	public static Connection dbConnect()
	{
		try {
			System.out.println("Connecting to Database");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Database coonected");
			//con.close();
			System.out.println("Database discoonected");
			
		}
		catch(Exception e) {
			e.printStackTrace();
					
		}
		
				return con;		
			
		}
		
		
	
	
}
