package com.greenBottle.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class SqlConnection {
	private static Connection conn;
	private static Properties prop = new Properties();
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	
	
	
	public static Connection getConnection() throws IOException {
		FileInputStream in = new FileInputStream(new File("resources/db.properties"));
		prop.load(in);
		driver = prop.getProperty("jdbc.driver");
		url = prop.getProperty("jdbc.url");
		user = prop.getProperty("jdbc.username");
		password = prop.getProperty("jdbc.password");	
		
		try {
			Class.forName(driver);
			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException ex) {

				System.out.println("Connexion � la base �chou�e");
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver non trouv�.");
		}
		return conn;
	}	
}
