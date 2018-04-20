package com.greenBottle.bean;

import java.util.Date;

public class Retrait {
	private int id;
	private int idClient;
	private Date dateRetrait;
	private String heureRetrait;
	private String statut;
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	private int poids;
	private String commentaire;
	
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
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}

	
}
