package com.itkweb.menotte.menotte_rs.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Ticket implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4529073322400329646L;

	@Id
	private Integer id;

	@Indexed
	private String titre;

	private String description;

	private Integer importance;

	private Integer poids;

	private Integer tempsPris;

	private Integer projet_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getImportance() {
		return importance;
	}

	public void setImportance(Integer importance) {
		this.importance = importance;
	}

	public Integer getPoids() {
		return poids;
	}

	public void setPoids(Integer poids) {
		this.poids = poids;
	}

	public Integer getTempsPris() {
		return tempsPris;
	}

	public void setTempsPris(Integer tempsPris) {
		this.tempsPris = tempsPris;
	}

	public Integer getProjet_id() {
		return projet_id;
	}

	public void setProjet_id(Integer projet_id) {
		this.projet_id = projet_id;
	}

}
