package com.greenBottle.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class SqlConnexion {
	private static Connection conn;
	private static Properties prop = new Properties();
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	
	
	
	public static Connection getConnection() throws IOException {
//		FileInputStream in = new FileInputStream(new File("resources/db.properties"));
//		prop.load(in);
//		driver = prop.getProperty("jdbc.driver");
//		url = prop.getProperty("jdbc.url");
//		user = prop.getProperty("jdbc.username");
//		password = prop.getProperty("jdbc.password");	
		
		driver = "com.mysql.jdbc.Driver";		
		url = "jdbc:mysql://localhost:3306/greenbottle";
		user = "admin";
		password = "admin";	
		
		try {
			Class.forName(driver);
			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException ex) {

				System.out.println("Connexion à la base échouée");
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver non trouvé.");
		}
		return conn;
	}	
}
