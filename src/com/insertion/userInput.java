package com.insertion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class userInput {
	
	Connection connection = null;
	PreparedStatement ps = null;
	private void insertStudentData(String firstname, String lastname, 
	int salary) throws SQLException {
	try {
	connectionTest connectionTest = new 
	connectionTest();
	connection = 
	connectionTest.getConnectionDetails();
	ps = connection.prepareStatement("insert into employee (firstname, lastname, salary)values(?,?,?)");
	ps.setString(1, firstname);
	ps.setString(2, lastname);
	ps.setInt(3, salary);
	int i = ps.executeUpdate();
	System.out.println("job done" + i);
	} catch (Exception e) {
	e.printStackTrace();
	} finally {
	connection.close();
	ps.close();
	}
	}
	
	
	public static void main(String[] args) throws SQLException {
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < 3; i++) {
	System.out.println("Enter firstname>>");
	String firstname = sc.next();
	System.out.println("Enter lastname>>");
	String lastname = sc.next();
	System.out.println("Enter salary>>");
	int salary = sc.nextInt();
	userInput joker = new userInput();
	joker.insertStudentData(firstname, lastname, salary);
	}
	sc.close();
	}
	}


