package com.itkweb.menotte.menotte_rs.model;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7856260830856792573L;

	private int id;

	private String nom;

	private Date created_at;

	private Date updated_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

}
