package com.insertion;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionTest {
	Connection connection = null;
	public Connection getConnectionDetails() { //utility
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	connection = 
	DriverManager.getConnection("jdbc:mysql://localhost:3306/bismillah", 
	"root", "junnubaby");
	} catch (Exception e) {
	e.printStackTrace();
	}
	return connection;
	}

}
