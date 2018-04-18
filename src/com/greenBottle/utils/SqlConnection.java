package com.greenBottle.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SqlConnection {
	private static Connection conn;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nomBase?"
						+ "user=swingUser&password=swingPass&useSSL=false&serverTimezone=GMT");
			} catch (SQLException ex) {

				System.out.println("Connexion � la base �chou�e");
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver non trouv�.");
		}
		return conn;
	}	
}
