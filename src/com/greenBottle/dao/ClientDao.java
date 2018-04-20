package com.greenBottle.dao;
import com.greenBottle.utils.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
		client.setCodePostal(rs.getString("code_postal"));
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
	
	public static void addClient(Client client) throws SQLException, IOException{
		Connection conn = SqlConnexion.getConnection();
		PreparedStatement ps = conn.prepareStatement("INSERT INTO clients VALUES (0,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, client.getNom());
		ps.setString(2, client.getPrenom());
		ps.setString(3, client.getAdresseMail());
		ps.setString(4, client.getPassword());
		ps.setInt(5, client.getNumeroAdresse());
		ps.setString(6, client.getComplement());
		ps.setString(7, client.getNomVoie());
		ps.setString(8, client.getVille());
		ps.setString(9, client.getCodePostal());
		ps.executeUpdate();
		
	}
	
	public static void updateClient (Client client) throws IOException, SQLException {
		Connection conn = SqlConnexion.getConnection();
		PreparedStatement ps = conn.prepareStatement("UPDATE clients SET nom=?, prenom=?, email=?, mot_de_passe=?, num_voie=?,complement=?, nom_voie=?, ville=?, code_postal=? WHERE id_client=?");
		ps.setString(1, client.getNom());
		ps.setString(2, client.getPrenom());
		ps.setString(3, client.getAdresseMail());
		ps.setString(4, client.getPassword());
		ps.setInt(5, client.getNumeroAdresse());
		ps.setString(6, client.getComplement());
		ps.setString(7, client.getNomVoie());
		ps.setString(8, client.getVille());
		ps.setString(9, client.getCodePostal());
		ps.setInt(10, client.getId());
		ps.executeUpdate();
	}
	
}
