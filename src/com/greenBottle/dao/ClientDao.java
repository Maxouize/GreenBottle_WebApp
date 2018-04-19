package com.greenBottle.dao;
import com.greenBottle.utils.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.greenBottle.bean.Client;

public class ClientDao {

static Properties prop = new Properties();

	public static void fillClientWithInfos(ResultSet rs, Client client) throws SQLException{
		while(rs.next()){
		client.setNom(rs.getString("nom"));
		client.setPrenom(rs.getString("prenom"));
		client.setId(rs.getInt("id_client"));
		client.setAdresseMail(rs.getString("email"));
		client.setCodePostal(rs.getInt("code_postal"));
		client.setNomVoie(rs.getString("nom_voie"));
		client.setNumeroAdresse(rs.getInt("num_voie"));
		client.setVille(rs.getString("ville"));
		client.setComplement(rs.getString("complement"));
		}
	}
	
	public static Client getClientByMailAndPassword(String mail, String password) throws SQLException, IOException{
//		FileInputStream in = new FileInputStream(new File("resources/sqlRequests.properties"));
//		prop.load(in);
		Client client = new Client();
		Connection conn = SqlConnexion.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM clients WHERE email="+"'"+mail+"'");
		fillClientWithInfos(rs, client);
		st.close();
		return client;
	}
	
	public static boolean isClient(String username, String password) throws SQLException, IOException{
		boolean isClient;
		Connection conn = SqlConnexion.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM clients WHERE email='"+username+"' AND mot_de_passe='"+password+"'");
		if(rs.next()){
			isClient=true;
		}
		else{
			isClient=false;
		}
		return isClient;
	}
	
	public void addClient(Client client) throws SQLException{
		
	}
	
	public void updateClient (Client client) {
		
	}
	
}
