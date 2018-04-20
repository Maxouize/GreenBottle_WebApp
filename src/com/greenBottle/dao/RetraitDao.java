package com.greenBottle.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.greenBottle.bean.Client;
import com.greenBottle.bean.Retrait;
import com.greenBottle.utils.SqlConnexion;

public class RetraitDao {
	
	public Retrait fillRetraitWithInfos(ResultSet rs, Retrait retrait) throws SQLException{
		retrait.setDateRetrait(rs.getDate("date_retrait"));
		retrait.setHeureRetrait(rs.getTime("heure_retrait").toString());
		retrait.setId(rs.getInt("id_retrait"));
		retrait.setStatut(rs.getString("statut"));
		return retrait;
	}

	public List<Retrait> getRetraitsFromClientId(Client client){
		List<Retrait> listeRetraits = new ArrayList<Retrait>();
        int idClient = client.getId();
		Connection conn = SqlConnexion.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM clients WHERE email='"+username+"' AND mot_de_passe='"+password+"'");
		while(rs.next()){
			Retrait retrait = new Retrait();
			retrait = fillRetraitWithInfos(rs, retrait);
			listeRetraits.add(retrait);
		}
		return listeRetraits;
	}
	
}
