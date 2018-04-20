package com.greenBottle.dao;
import com.greenBottle.bean.Retrait;
import com.greenBottle.utils.SqlConnexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.greenBottle.bean.Client;

public class RetraitDao {
	
	public static Retrait fillRetraitWithInfos(ResultSet rs, Retrait retrait) throws SQLException{
		retrait.setDateRetrait(rs.getDate("date_retrait").toString());
		retrait.setHeureRetrait(rs.getTime("heure_retrait").toString());
		retrait.setId(rs.getInt("id_retrait"));
		retrait.setStatut(rs.getString("statut"));
		retrait.setPoids(rs.getInt("poids"));
		retrait.setCommentaire(rs.getString("commentaire"));
		return retrait;
	}

	public static List<Retrait> getRetraitsFromClientId(Client client) throws IOException, SQLException{
		List<Retrait> listeRetraits = new ArrayList<Retrait>();
		int idClient = client.getId();
		Connection conn = SqlConnexion.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM retraits WHERE id_client="+idClient);
		while(rs.next()){
			Retrait retrait = new Retrait();
			retrait = fillRetraitWithInfos(rs, retrait);
			listeRetraits.add(retrait);
		}
		return listeRetraits;
	}
	
	public static void createRetrait(Retrait retrait, Client client) throws IOException, SQLException{
		Connection conn = SqlConnexion.getConnection();
		PreparedStatement ps = conn.prepareStatement("INSERT INTO retraits VALUES (0,?,?,?,?,?,?)");
		ps.setInt(1, client.getId());
		ps.setString(2, retrait.getDateRetrait().toString());
		ps.setString(3, retrait.getHeureRetrait());
		ps.setInt(4, retrait.getPoids());
		ps.setString(5, retrait.getCommentaire());
		ps.setString(6, retrait.getStatut());
		ps.executeUpdate();
	}
	
	public static void updateRetrait(Retrait retrait) throws IOException, SQLException{
		Connection conn = SqlConnexion.getConnection();
		PreparedStatement ps = conn.prepareStatement("UPDATE retraits SET statut=? WHERE id_retrait=?");
		ps.setString(1, retrait.getStatut());
		ps.setInt(2, retrait.getId());
		ps.executeUpdate();
	}
}
