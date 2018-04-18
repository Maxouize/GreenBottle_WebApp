package com.greenBottle.bean;

import java.util.Date;

public class Retrait {
	private int id;
	private int idClient;
	private Date dateRetrait;
	private String heureRetrait;
	private String Statut;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public Date getDateRetrait() {
		return dateRetrait;
	}
	public void setDateRetrait(Date dateRetrait) {
		this.dateRetrait = dateRetrait;
	}
	public String getHeureRetrait() {
		return heureRetrait;
	}
	public void setHeureRetrait(String heureRetrait) {
		this.heureRetrait = heureRetrait;
	}
	public String getStatut() {
		return Statut;
	}
	public void setStatut(String statut) {
		Statut = statut;
	}

	
}
