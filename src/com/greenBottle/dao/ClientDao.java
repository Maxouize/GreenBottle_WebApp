package com.greenBottle.dao;
import com.greenBottle.utils.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.greenBottle.bean.Client;

public class ClientDao {

	public Client getClientByMail(String mail) throws SQLException{
		Client client = new Client();
		Connection conn = SqlConnection.getConnection();
		//Statement st = conn.createStatement();
		//ResultSet rs = st.executeQuery("SELECT * FROM client WHERE mail="+mail);
				return client;
	}
	
	public Client getClientById(String id) throws SQLException{
		Connection conn = SqlConnection.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM prestation WHERE idFacture="+id);
		Client client = new Client();
		while(rs.next()){
			client.setNom(rs.getString("nom"));
		}
		st.close();
		return client;
	}
	
	public void addClient(Client client) throws SQLException{
		
	}
	
	public void updateClient (Client client) {
		
	}
	
}
